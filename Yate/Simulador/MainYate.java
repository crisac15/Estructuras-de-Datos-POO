package Yate.Simulador;
import java.util.ArrayList;

public class MainYate {
	static AdminEnergia GenerarYate () {
		ArrayList <Bateria> listB = new ArrayList <Bateria>();
		ArrayList <Panel> listP = new ArrayList <Panel>();
		
		for(int i = 0; i < Constants.NUM_BATERIAS; i = i + 1) {
			Bateria batery = new Bateria ();
			listB.add(batery);
		}
		for(int i = 0; i < Constants.NUM_PANELES; i = i + 1) {
			Panel panel = new Panel ();
			listP.add(panel);
		}
		AdminEnergia admin = new AdminEnergia(listB, listP);
		return admin;
	}
	public static void main(String[] args) {
		AdminEnergia energia = GenerarYate ();
		Simulador Simular1 = new Simulador (energia);
		Simular1.start();
	}

}
