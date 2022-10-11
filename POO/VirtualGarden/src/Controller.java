
import java.util.ArrayList;


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
	public ArrayList <String> getPlantasVida() {
		ArrayList <String> vidaPlantas = new ArrayList<String>();
		for (Planta planta: garden.getGarden()) {
			vidaPlantas.add(planta.getVital()+"");
		}
		return vidaPlantas;
	}
	public void regarPlanta (int pIndex) {
		this.garden.regar(pIndex);
	}
	public void abonarPlanta (int pIndex) {
		this.garden.abonar(pIndex);
	}
	
	public PlantManager getGarden() {
		return garden;
	}
	public ArrayList<String> actualizarImagen(){
		ArrayList<String> actuales = new ArrayList<String>();
		for (Planta p: this.garden.getGarden()) {
			actuales.add(p.getImagenActual());
		}
		this.controlledFrame.revalidate();
		this.controlledFrame.repaint();
		return actuales;
	}
	public String getActualClima () {
		return this.garden.getClima().getCurrentSeason().getNombre();
	}
	public String getActualSol () {
		return this.garden.getClima().getSol()+"";
	}
	public String getActualLluvia () {
		return this.garden.getClima().getSol()+"";
	}
}

