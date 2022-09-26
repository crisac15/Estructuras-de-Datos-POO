import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class HuertaMain {

	public static void main(String[] args) {
//		JSONParser parser = new JSONParser();
//		try {
//			Object obj = parser.parse(new FileReader("../VirtualGarden/src/huertaConfig.json"));
//	        JSONObject jsonObject = (JSONObject) obj;
//	        System.out.println("JSON LEIDO: " + jsonObject);
//	        
//	        JSONArray array = (JSONArray) jsonObject.get("Plantas");
////	        this.tipoPlantas = new ArrayList <Planta>();
//	        for(int i = 0 ; i < array.size() ; i++) {
//	        	
//	           JSONObject jsonObject1 = (JSONObject) array.get(i);
//	            
//	           JSONObject planta = (JSONObject) jsonObject1.get("Planta");
//	            
//	            
//	            System.out.println("DATOS DE plantas: " + i);
//	            System.out.println("Nombre: " + planta.get("nombre"));
//	            System.out.println("id: " + planta.get("id"));
//	            System.out.println("vida: " + planta.get("vitalidad"));
//	            System.out.println("agua: " + planta.get("actNivelAgua"));
//	            System.out.println("temp: " + planta.get("actNivelTemp"));
//	            System.out.println("vida: " + planta.get("consumoAbono"));
//	            System.out.println("agua: " + planta.get("consumoAgua"));
//	            System.out.println("temp: " + planta.get("actStage"));
//	            
////	            Planta nuevaPlanta = new Planta (i);
////	            nuevaPlanta.setNombre((String)planta.get("nombre"));
////	            nuevaPlanta.setId(Integer.parseInt((String)planta.get("id")));
////	            nuevaPlanta.setVital(Integer.parseInt((String)planta.get("vitalidad")));
////	            nuevaPlanta.setAgualvl (Integer.parseInt((String)planta.get("actNivelAgua")));
////	            nuevaPlanta.setTemplvl(Integer.parseInt((String)planta.get("actNivelTemp")));
////	            nuevaPlanta.setConsumoAbono(Integer.parseInt((String)planta.get("consumoAbono")));
////	            nuevaPlanta.setConsumoAgua(Integer.parseInt((String)planta.get("consumoAgua")));
////	            nuevaPlanta.setStageIndex(Integer.parseInt((String)planta.get("actStage")));
//	            
//	            //setNombre(planta.get("nombre"));
//
//	            JSONArray estado = (JSONArray) planta.get("stages");
////	            this.plantaStages = new ArrayList <Stage>();
//	            
//	            for (int j = 0 ; j < estado.size() ; j++) {
//	            	JSONObject stage = (JSONObject) estado.get(j);
////	            	Stage nuevoStage = new Stage();
//	            	if (j != 0) {
//	            		
//	            		
//	            		System.out.println("nivel: " + stage.get("nivel"));
//	                    System.out.println("MinTemperatura : " + stage.get("minTemperatura"));
//	                    System.out.println("MaxTemperatura : " + stage.get("maxTemperatura"));
//	                    System.out.println("MinNivelAgua : " + stage.get("minNivelAgua"));
//	                    System.out.println("MaxNivelAgua : " + stage.get("maxNivelAgua"));
//	                    System.out.println("minNivelAbono : " + stage.get("minNivelAbono"));
//	                    System.out.println("maxNivelAbono : " + stage.get("maxNivelAbono"));
//	                    System.out.println("RangeTime : " + stage.get("rangeTime"));
//	                    System.out.println("Imagen : " + stage.get("imagen"));
//	                    
//	                    
////	                    nuevoStage.setNivel(Integer.parseInt((String)stage.get("id")));
////	                    nuevoStage.setMinTemperatura(Integer.parseInt((String)stage.get("minTemperatura")));
////	                    nuevoStage.setMaxTemperatura(Integer.parseInt((String)stage.get("maxTemperatura")));
////	                    nuevoStage.setMinNivelAgua(Integer.parseInt((String)stage.get("minNivelAgua")));
////	                    nuevoStage.setMaxNivelAgua(Integer.parseInt((String)stage.get("maxNivelAgua")));
////	                    nuevoStage.setMinNivelAbono(Integer.parseInt((String)stage.get("minNivelAbono")));
////	                    nuevoStage.setMaxNivelAbono(Integer.parseInt((String)stage.get("maxNivelAbono")));
////	                    nuevoStage.setRangeTime(Integer.parseInt((String)stage.get("rangeTime")));
////	                    nuevoStage.setImagen((String) stage.get("imagen"));
//	                    
////	                    this.plantaStages.add(nuevoStage);
//	            	}
//	           	else {
//	            		System.out.println("nivel : " + stage.get("nivel"));
//	            		System.out.println("Imagen : " + stage.get("imagen"));
////	            		nuevoStage.setNivel(Integer.parseInt((String)stage.get("id")));
////	            		nuevoStage.setImagen((String) stage.get("imagen"));
//	            		
////	            		this.plantaStages.add(nuevoStage);
//	            	}
//	           }
////	            this.tipoPlantas.add(nuevaPlanta);
//	        }
//	}catch(Exception e) { }
		
//		Planta p2 = new Planta(0);

//		JSONParser parser = new JSONParser();
//		try {
//			Object obj = parser.parse(new FileReader("../VirtualGarden/src/huertaConfig.json"));
//	        JSONObject jsonObject = (JSONObject) obj;
//	        System.out.println("JSON LEIDO: " + jsonObject);
//	        
//	        JSONArray array = (JSONArray) jsonObject.get("Plantas");
//	        
//	        for(int i = 0 ; i < array.size() ; i++) {
//	        	
//                JSONObject jsonObject1 = (JSONObject) array.get(i);
//                
//               JSONObject planta = (JSONObject) jsonObject1.get("Planta");
//                
//                System.out.println("DATOS DE plantas: " + i);
//                System.out.println("Nombre: " + planta.get("nombre"));
//                System.out.println("id: " + planta.get("id"));
//                System.out.println("vida: " + planta.get("vitalidad"));
//                System.out.println("agua: " + planta.get("actNivelAgua"));
//                System.out.println("temp: " + planta.get("actNivelTemp"));
//                System.out.println("cosumo abono: " + planta.get("consumoAbono"));
//                System.out.println("consumoagua: " + planta.get("consumoAgua"));
//                System.out.println("act stage: " + planta.get("actStage"));
// 
//                
//                //setNombre(planta.get("nombre"));
//
//                JSONArray estado = (JSONArray) planta.get("stages");
//                
//                for (int j = 0 ; j < estado.size() ; j++) {
//                	JSONObject stage = (JSONObject) estado.get(j);
//            	
//	            	if (j != 0) {
//	            		System.out.println("nivel: " + stage.get("nivel"));
//	                    System.out.println("MinTemperatura : " + stage.get("minTemperatura"));
//	                    System.out.println("MaxTemperatura : " + stage.get("maxTemperatura"));
//	                    System.out.println("MinNivelAgua : " + stage.get("minNivelAgua"));
//	                    System.out.println("MaxNivelAgua : " + stage.get("maxNivelAgua"));
//	                    System.out.println("minNivelAbono : " + stage.get("minNivelAbono"));
//	                    System.out.println("maxNivelAbono : " + stage.get("maxNivelAbono"));
//	                    System.out.println("RangeTime : " + stage.get("rangeTime"));
//	                    System.out.println("Imagen : " + stage.get("imagen"));
//	            	}
//	           	else {
//	            		System.out.println("nivel : " + stage.get("nivel"));
//	            		System.out.println("Imagen : " + stage.get("imagen"));
//	            	}
//               }
//            }
//	}catch(Exception e) { }
		
		PlantScanner load = new PlantScanner();
		load.loadPlantas().get(0).getNombreS();
	}
}