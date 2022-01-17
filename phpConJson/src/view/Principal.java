package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import model.Coche;

public class Principal {

	public static final String URI= "http://localhost:8080/coches";
	public static void main(String[] args) {

		try {
			//obetener listado de coches
			List<Coche> listaCoches = getCoches();
			listaCoches.forEach(coche -> System.out.println(coche));

			//obtener coche por id (ej id=2)
			Coche coche = getCoche(2);
			System.out.println(coche);


			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static Coche getCoche(int id) throws Exception {
		String url = URI + "get-coche.php?id=" + id;
		String requestHttp = peticionHttp(url);
		Coche c= StringToCoche(requestHttp);
		
		return c;
	}
	private static List<Coche> getCoches() throws Exception {
		String url = URI + "list-coches.php";
		String requestHttp = peticionHttp(url);
		List<Coche> listaCoches = stringToCocheList(requestHttp);

		return listaCoches;
	}
	private static List<Coche> stringToCocheList(String requestHttp) throws Exception {
		List<Coche> listaCoches = new ArrayList<>();
		JSONArray jsonArray = new JSONArray(requestHttp);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			Coche coche = objJson2Coche(jsonObject);


			
		}

		return listaCoches;
	}
	private static Coche objJson2Coche(JSONObject jsonObject) {
		//extraer los values del objeto json
		int id = jsonObject.getInt("id");
		String marca = jsonObject.getString("marca");
		String modelo = jsonObject.getString("modelo");
		String potencia = jsonObject.getString("potencia");

		//crear el objeto coche con los values extraidos
		Coche coche = new Coche();
		coche.setId(id);
		coche.setMarca(marca);
		coche.setModelo(modelo);
		coche.setPotencia(potencia);


		return coche;
	}
	private static String peticionHttp(String urlWebService) throws Exception {
		StringBuilder resultado = new StringBuilder();


		//realizar la peticion php 
		URL url = new URL(urlWebService);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");

		//recoger los datos de respuesta
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String linea;
		while ((linea = reader.readLine()) != null) {
			resultado.append(linea);
		}
		


		return resultado.toString();
	}

}
