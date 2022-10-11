import java.io.FileReader;
    
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.lang.Object;
public class PlantScanner {
	
	private JSONObject jsonObject;
	private JSONArray tipoPlantas;
	private JSONArray allSeason;
	
	public PlantScanner(){
		JSONParser parser = new JSONParser();
		try {
	        Object obj = parser.parse(new FileReader("../VirtualGarden/src/huertaConfig.json"));
	        jsonObject = (JSONObject) obj;

		}
		catch(Exception ex){
		
			ex.printStackTrace(); 
		}
		tipoPlantas = (JSONArray) jsonObject.get("Plantas");

		allSeason = (JSONArray) jsonObject.get("Estaciones");
		
	}
	public ArrayList <TipoPlanta> loadPlantas () {
		ArrayList <TipoPlanta> tipos = new ArrayList <TipoPlanta>();
		for(int i = 0 ; i < tipoPlantas.size() ; i++) {

			JSONObject jsonObject1 = (JSONObject) tipoPlantas.get(i);
			JSONObject planta = (JSONObject) jsonObject1.get("Planta");
			TipoPlanta scaneada = new TipoPlanta();
			
			scaneada.setNombreS((String) planta.get("nombre"));
			
			scaneada.setEdadS(Integer.parseInt((String)planta.get("edad")));
			
			scaneada.setVitalS(Integer.parseInt((String)planta.get("vitalidad")));
			
			scaneada.setAgualvlS (Integer.parseInt((String)planta.get("actNivelAgua")));
			
			scaneada.setImagenActualS((String) planta.get("imagenActual"));
			
			scaneada.setPocaAguaS((String) planta.get("pocaAgua"));
			
			scaneada.setMuchaAguaS((String) planta.get("muchaAgua"));
			
			scaneada.setPocoAbonoS((String) planta.get("pocoAbono"));
			
			scaneada.setAbonolvlS(Integer.parseInt((String) planta.get("actNivelAbono")));
			
			scaneada.setConsumoAbonoS(Integer.parseInt((String)planta.get("consumoAbono")));
			
			scaneada.setConsumoAguaS(Integer.parseInt((String)planta.get("consumoAgua")));
			
			scaneada.setStageIndexS(Integer.parseInt((String)planta.get("actStage")));

			
			JSONArray scanStage = (JSONArray) planta.get("stages");
			ArrayList <Stage> totalStages = new ArrayList <Stage>();
			
			for (int j = 0 ; j < scanStage.size() ; j++) {
				JSONObject stage = (JSONObject) scanStage.get(j);
				Stage etapaScan = new Stage();
				if (j != 0) {

					etapaScan.setNivel(Integer.parseInt((String)stage.get("nivel")));
					etapaScan.setMinTemperatura(Integer.parseInt((String)stage.get("minTemperatura")));
					etapaScan.setMaxTemperatura(Integer.parseInt((String)stage.get("maxTemperatura")));
					etapaScan.setMinNivelAgua(Integer.parseInt((String)stage.get("minNivelAgua")));
					etapaScan.setMaxNivelAgua(Integer.parseInt((String)stage.get("maxNivelAgua")));
					etapaScan.setMinNivelAbono(Integer.parseInt((String)stage.get("minNivelAbono")));
					etapaScan.setMaxNivelAbono(Integer.parseInt((String)stage.get("maxNivelAbono")));
					etapaScan.setRangeTime(Integer.parseInt((String)stage.get("rangeTime")));
					etapaScan.setImagen((String) stage.get("imagen"));
					
					totalStages.add(etapaScan);
				}
				else {
					etapaScan.setNivel(Integer.parseInt((String)stage.get("nivel")));
					etapaScan.setImagen((String) stage.get("imagen"));
					
					totalStages.add(etapaScan);
				}
			}
			scaneada.setEtapaS(totalStages);
			tipos.add(scaneada);
		}
		return tipos;	
	}
	public ArrayList <TipoEstacion> loadSeason () {
		ArrayList <TipoEstacion> estacionesArray = new ArrayList <TipoEstacion>();
		for(int i = 0 ; i < this.allSeason.size() ; i++) {

			JSONObject jsonObject1 = (JSONObject) allSeason.get(i);
			JSONObject season = (JSONObject) jsonObject1.get("Estacion");
			TipoEstacion scannedSeason = new TipoEstacion();

			scannedSeason.setNombreS ((String) season.get("nombre"));
			scannedSeason.setNivelSolMaxS(Integer.parseInt((String)season.get("nivelSolMax")));
			scannedSeason.setNivelSolMinS(Integer.parseInt((String)season.get("nivelSolMin")));
			
			scannedSeason.setNivelLluviaMaxS(Integer.parseInt((String)season.get("nivelLluviaMax")));
			scannedSeason.setNivelLluviaMinS(Integer.parseInt((String)season.get("nivelLluviaMin")));
			
			estacionesArray.add(scannedSeason);
		}
		return estacionesArray;
	}
}
