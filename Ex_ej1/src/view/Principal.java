package view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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

import model.Casa;

public class Principal {

	public static void main(String[] args) {
		guardarObj();
		guardarXml();

	}

	public static void guardarObj(){
        File ficheroObject = new File("casas.dat");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroObject));
            ArrayList<Casa> list = new ArrayList<Casa>();
            for(int i = 0; i < 3; i++) {
                list.add(new Casa(i+5, + i+.5,  i));
            }
            oos.writeObject(list);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public static void guardarXml(){
		File ficheroXml = new File("casas.xml");
		try {
			
			ArrayList<Casa> list = new ArrayList<Casa>();
			for(int i = 0; i < 3; i++) {
				list.add(new Casa(i+2, + i+15.5,  i+1));
			}
			
			//Arraylist a xml
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();

			Element root = doc.createElement("casas");
			doc.appendChild(root);

			for(Casa c : list) {
				Element casa = doc.createElement("casa");
				root.appendChild(casa);

				Attr attr = doc.createAttribute("poblacion");
				attr.setValue(Integer.toString(c.getiPoblacion()));
				casa.setAttributeNode(attr);

				Element superficie = doc.createElement("superficie");
				superficie.appendChild(doc.createTextNode(Double.toString(c.getdSuperficie())));
				casa.appendChild(superficie);

				Element aseos = doc.createElement("aseos");
				aseos.appendChild(doc.createTextNode(Integer.toString(c.getiAseos())));
				casa.appendChild(aseos);
				
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(ficheroXml);
			transformer.transform(source, result);

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();

		}
	}



}
