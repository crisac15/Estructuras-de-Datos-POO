import java.util.ArrayList;

import quiz6.Participante;

public class HuertaMain {

	public static void main(String[] args) {		
		
		PlantManager newManager = new PlantManager();
		Controller controller = new Controller(newManager);
		
		MainFrame VirtualGarden = new MainFrame("Cristopher Acuña-Virtual Garden", controller);
		TimeLine partida = new TimeLine(newManager,VirtualGarden);
		partida.iniciar();
		try {
			Thread.sleep(500000);
			} 
		catch (InterruptedException e) {
				e.printStackTrace();
			}
		partida.detener();
	}
}