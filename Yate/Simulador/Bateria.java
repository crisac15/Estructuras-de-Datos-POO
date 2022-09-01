package Yate.Simulador;

public class Bateria {
	private int nivelCarga;
	
	public Bateria () {
		this.nivelCarga = Constants.CARGA_BATERIA;
	}
	
	public int getNivelCarga() {
		return nivelCarga;
	}
	public void setNivelCarga(int nivelCarga) {
		this.nivelCarga = nivelCarga;
	}
}
