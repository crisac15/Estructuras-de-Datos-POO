import java.util.ArrayList;

import quiz6.Participante;

public class HuertaMain {

	public static void main(String[] args) {		
		
		PlantManager newManager = new PlantManager();
		Controller controller = new Controller(newManager);
		newManager.getPartida().setController(controller);
		// asignarle al controller que cosas el debe ver del model
		
		MainFrame myroulettewindow = new MainFrame("Roulette game sample", controller);
	}
}