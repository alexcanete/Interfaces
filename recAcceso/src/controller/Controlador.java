package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import model.Defunciones;

public class Controlador {
    
    public static List<model.Defunciones> listaDefunciones = new ArrayList<model.Defunciones>();

    public static void leerArchivos(String sFileName) {
        //leer fichero


        
        try{
            System.out.println(sFileName);
            FileReader fr =new FileReader(sFileName);
            BufferedReader br = new BufferedReader(fr);   

            String linea;

            while((linea=br.readLine())!=null){
                

                
                Defunciones d = new Defunciones();
                String[] datos = linea.split(";");
                String sSaltoLinea=("/n");

                if(datos.length==4){
                    d.setsCcaa(datos[0]);
                    d.setsTipoDeDato(datos[1]);
                    d.setsPeriodo(datos[2]);
                    d.setsTotal(datos[3]);
                    listaDefunciones.add(d);
                

                }

            }
            br.close();

        }catch(IOException e){
            e.printStackTrace();
        }
        
    }

    public static void exportarEnFormatoXML(String sFileName) throws ParserConfigurationException {
        File ficheroXml = new File("ine.xml");
		try {
			

			
			//Arraylist a xml
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();

			Element root = doc.createElement("Defunciones");
			doc.appendChild(root);

            
			for (Defunciones d : listaDefunciones) {
                Element defunciones = doc.createElement("Defunciones");
                root.appendChild(defunciones);

                Attr attr = doc.createAttribute("sCcaa");
                attr.setValue(d.getsCcaa());
                defunciones.setAttributeNode(attr);

                Element tipo = doc.createElement("sTipoDeDato");
                tipo.appendChild(doc.createTextNode(d.getsTipoDeDato()));
                defunciones.appendChild(tipo);

                Element periodo = doc.createElement("sPeriodo");
                periodo.appendChild(doc.createTextNode(d.getsPeriodo()));
                defunciones.appendChild(periodo);

                Element total = doc.createElement("sTotal");
                total.appendChild(doc.createTextNode(d.getsTotal()));
                defunciones.appendChild(total);
            }
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(ficheroXml);
			transformer.transform(source, result);
            System.out.println("XML creado");

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();

		}
        
    }

    public static void exportarEnObjetoList(String sFileName) {
        File ficheroDat = new File("ine.dat");
        try {
            FileWriter fw = new FileWriter(ficheroDat);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Defunciones d : listaDefunciones) {
                bw.write(d.getsCcaa() + ";" + d.getsTipoDeDato() + ";" + d.getsPeriodo() + ";" + d.getsTotal());
                bw.newLine();
            }
            bw.close();
            System.out.println("Fichero exportado en formato objeto list");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void exportarEnOracle() {
        try {
            dbms.Database.conectarCasa();
            dbms.Database.executeQuery();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



    

}
