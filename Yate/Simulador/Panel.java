package Yate.Simulador;

public class Panel {
	private int almacenamiento;
	private int solRecibido;
	private int capacidadParaCargar;
	
	public Panel () {
	this.almacenamiento = Constants.CAPACIDAD_CARGAP;
	this.solRecibido = Constants.PORCENTAJE_SOL;
	this.capacidadParaCargar = Constants.PANEL_A_BATERIA;
	//this.capacidadParaCargar = Constants.CARGA_BATERIAW * solRecibido / 100;
	}

	public void setAlmacenamiento(int pAlmacenamiento) {
		this.almacenamiento = pAlmacenamiento;
	}
	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setSolRecibido(int solRecibido) {
		this.solRecibido = solRecibido;
	}

	public int getCapacidadParaCargar() {
		return capacidadParaCargar;
	}
}
