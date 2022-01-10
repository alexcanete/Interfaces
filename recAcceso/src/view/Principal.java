package view;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

public class Principal {


	public static final String sFileName = "";

	public static void main(String[] args) throws ParserConfigurationException {
		String sFileName= "ine.csv";
		controller.Controlador.leerArchivos(sFileName);
		controller.Controlador.exportarEnFormatoXML(sFileName);
		controller.Controlador.exportarEnObjetoList(sFileName);
		// controller.Controlador.exportarEnOracle();



	}

}
