import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class PlantScanner {
	
	private JSONObject jsonObject;
	private JSONArray tipoPlantas;
	
	PlantScanner(){
		JSONParser parser = new JSONParser();
		try {
	        Object obj = parser.parse(new FileReader("../VirtualGarden/src/huertaConfig.json"));
	        jsonObject = (JSONObject) obj;
	        
	}catch(Exception e) { }
		tipoPlantas = (JSONArray) jsonObject.get("Plantas");
	}
ArrayList <TipoPlanta> loadPlantas () {
	ArrayList <TipoPlanta> tipos = new ArrayList <TipoPlanta>();
	for(int i = 0 ; i < tipoPlantas.size() ; i++) {

		JSONObject jsonObject1 = (JSONObject) tipoPlantas.get(i);

		JSONObject planta = (JSONObject) jsonObject1.get("Planta");

		TipoPlanta scaneada = new TipoPlanta();
		scaneada.setNombreS((String)planta.get("nombre"));
		scaneada.setIdS(Integer.parseInt((String)planta.get("id")));
		scaneada.setVitalS(Integer.parseInt((String)planta.get("vitalidad")));
		scaneada.setAgualvlS (Integer.parseInt((String)planta.get("actNivelAgua")));
		scaneada.setTemplvlS(Integer.parseInt((String)planta.get("actNivelTemp")));
		scaneada.setConsumoAbonoS(Integer.parseInt((String)planta.get("consumoAbono")));
		scaneada.setConsumoAguaS(Integer.parseInt((String)planta.get("consumoAgua")));
		scaneada.setStageIndexS(Integer.parseInt((String)planta.get("actStage")));
		
		tipos.add(scaneada);
		//setNombre(planta.get("nombre"));

//		JSONArray estado = (JSONArray) planta.get("stages");
//
//		for (int j = 0 ; j < estado.size() ; j++) {
//			JSONObject stage = (JSONObject) estado.get(j);
//			Stage nuevoStage = new Stage();
//			if (j != 0) {
//
//				nuevoStage.setNivel(Integer.parseInt((String)stage.get("id")));
//				nuevoStage.setMinTemperatura(Integer.parseInt((String)stage.get("minTemperatura")));
//				nuevoStage.setMaxTemperatura(Integer.parseInt((String)stage.get("maxTemperatura")));
//				nuevoStage.setMinNivelAgua(Integer.parseInt((String)stage.get("minNivelAgua")));
//				nuevoStage.setMaxNivelAgua(Integer.parseInt((String)stage.get("maxNivelAgua")));
//				nuevoStage.setMinNivelAbono(Integer.parseInt((String)stage.get("minNivelAbono")));
//				nuevoStage.setMaxNivelAbono(Integer.parseInt((String)stage.get("maxNivelAbono")));
//				nuevoStage.setRangeTime(Integer.parseInt((String)stage.get("rangeTime")));
//				nuevoStage.setImagen((String) stage.get("imagen"));
//
//				this.plantaStages.add(nuevoStage);
//			}
//			else {
//				//            		System.out.println("nivel : " + stage.get("nivel"));
//				//            		System.out.println("Imagen : " + stage.get("imagen"));
//				nuevoStage.setNivel(Integer.parseInt((String)stage.get("id")));
//				nuevoStage.setImagen((String) stage.get("imagen"));
//
//				this.plantaStages.add(nuevoStage);
//			}
		}
		return tipos;
	}	
}
