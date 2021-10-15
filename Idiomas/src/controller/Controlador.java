package controller;

public class Controlador {

	public static int numPreg;
	
	public static void inicio() {
		model.Languages.cargarLenguajes();
		generarNumPregunta();
		String pregunta = model.Languages.eng.get(numPreg);
		
		new view.Principal();
		view.Principal.lPalabra.setText(pregunta);
		
	}
	
	public static void generarNumPregunta() {
		numPreg= (int) Math.random();
	}
	
	public static boolean verificar() {
		boolean resultado = false;
		String respuestauser = view.Principal.lPalabra.getText().toString();
		String respuestaCorrecta = model.Languages.eng.get(numPreg);
		if (respuestauser.equalsIgnoreCase(respuestaCorrecta)) {
			resultado = true;
		}
		return resultado;
	}
}

