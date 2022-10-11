
import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Controller extends Thread {
	private MainFrame controlledFrame;
	private PlantManager garden;

	public Controller(PlantManager pPlay) {
		this.garden = pPlay;
	}
	
	public void setWindow(MainFrame pFrame) {
		this.controlledFrame = pFrame;
	}
	public void addPlant (int pIndex) {
		this.garden.addPlant(pIndex);
	}
	public ArrayList <String> getPlantasName(){
		ArrayList <String> nombres = new ArrayList<String>();
		
		for (TipoPlanta tipo: garden.getTiposDisponibles()) {
			nombres.add(tipo.getNombreS());
		}
		return nombres;
	}
	public int getLasPosInGarden() {
		int lasPos = garden.getGarden().size()-1;
		return lasPos;
	}
	public String getPlantasVida(int pIndex) {
		ArrayList <String> vidaPlantas = new ArrayList<String>();
		for (Planta planta: garden.getGarden()) {
			vidaPlantas.add(planta.getVital()+"");
		}
		return vidaPlantas.get(pIndex);
	}
	public void regarPlanta (int pIndex) {
		this.garden.regar(pIndex);
	}
	public void abonarPlanta (int pIndex) {
		this.garden.abonar(pIndex);
	}
	public void actualizarFrame () {
		controlledFrame.revalidate();
		controlledFrame.repaint();
	}
}

