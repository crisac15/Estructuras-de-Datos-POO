
import java.util.ArrayList;

public class Planta {
	private String nombre;
	private int id;
	private int vital;
	private int agualvl;
	private int templvl;
	private int consumoAgua;
	private int consumoAbono;
	private int stageIndex;
	private ArrayList <Stage> etapa;
	private int imagen;
	
	public Planta(ArrayList <TipoPlanta> pTiposPlantas, int pIndex){
		this.setNombre(pTiposPlantas.get(pIndex).getNombreS());
		this.setVital(pTiposPlantas.get(pIndex).getVitalS());
		this.setAgualvl(pTiposPlantas.get(pIndex).getAgualvlS());
		this.setTemplvl(pTiposPlantas.get(pIndex).getTemplvlS());
		this.setConsumoAgua(pTiposPlantas.get(pIndex).getConsumoAguaS());
		this.setConsumoAbono(pTiposPlantas.get(pIndex).getConsumoAbonoS());
		this.setStageIndex(pTiposPlantas.get(pIndex).getStageIndexS());
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getConsumoAgua() {
		return consumoAgua;
	}


	public void setConsumoAgua(int consumoAgua) {
		this.consumoAgua = consumoAgua;
	}


	public int getConsumoAbono() {
		return consumoAbono;
	}


	public void setConsumoAbono(int consumoAbono) {
		this.consumoAbono = consumoAbono;
	}


	public int getStageIndex() {
		return stageIndex;
	}


	public void setStageIndex(int actStage) {
		this.stageIndex = actStage;
	}


	public int getImagen() {
		return imagen;
	}


	public void setImagen(int imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVital() {
		return vital;
	}

	public void setVital(int vital) {
		this.vital = vital;
	}

	public int getAgualvl() {
		return agualvl;
	}

	public void setAgualvl(int agualvl) {
		this.agualvl = agualvl;
	}

	public int getTemplvl() {
		return templvl;
	}

	public void setTemplvl(int templvl) {
		this.templvl = templvl;
	}


	public ArrayList <Stage> getEtapa() {
		return etapa;
	}


	public void setEtapa(ArrayList <Stage> etapa) {
		this.etapa = etapa;
	}
	
}
