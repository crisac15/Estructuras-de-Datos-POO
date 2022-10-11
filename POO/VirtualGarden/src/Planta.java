
import java.util.ArrayList;

public class Planta {
	private String nombre;
	private int edad;
	private int vital;
	private int agualvl;
	private String imagenActual;
	private String pocaAgua;
	private String muchaAgua;
	private String pocoAbono;
	private int abonolvl;
	private int consumoAgua;
	private int consumoAbono;
	private int stageIndex;
	private ArrayList <Stage> etapa;
	private PlantScanner load = new PlantScanner();
	private ArrayList <TipoPlanta> tiposPlantas = this.load.loadPlantas();
	
	public Planta(int pIndex){
		
		this.setNombre(tiposPlantas.get(pIndex).getNombreS());
		this.setEdad(tiposPlantas.get(pIndex).getEdadS());
		this.setVital(tiposPlantas.get(pIndex).getVitalS());
		this.setAgualvl(tiposPlantas.get(pIndex).getAgualvlS());
		this.setImagenActual(tiposPlantas.get(pIndex).getImagenActualS());
		this.setPocaAgua(tiposPlantas.get(pIndex).getPocaAguaS());
		this.setMuchaAgua(tiposPlantas.get(pIndex).getMuchaAguaS());
		this.setPocoAbono(tiposPlantas.get(pIndex).getPocoAbonoS());
		this.setAbonolvl(tiposPlantas.get(pIndex).getAbonolvlS());
		this.setConsumoAgua(tiposPlantas.get(pIndex).getConsumoAguaS());
		this.setConsumoAbono(tiposPlantas.get(pIndex).getConsumoAbonoS());
		this.setStageIndex(tiposPlantas.get(pIndex).getStageIndexS());
		this.setEtapa(tiposPlantas.get(pIndex).getEtapaS());
	}
	
	public int getEdad() {
		return edad;
	}


	public void setEdad(int pEdad) {
		this.edad = pEdad;
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

	public String getImagenActual() {
		return imagenActual;
	}

	public void setImagenActual(String pimagenActual) {
		this.imagenActual = pimagenActual;
	}


	public ArrayList <Stage> getEtapa() {
		return etapa;
	}


	public void setEtapa(ArrayList <Stage> etapa) {
		this.etapa = etapa;
	}

	public int getAbonolvl() {
		return abonolvl;
	}

	public void setAbonolvl(int abonolvl) {
		this.abonolvl = abonolvl;
	}

	public String getPocaAgua() {
		return pocaAgua;
	}

	public void setPocaAgua(String pocaAgua) {
		this.pocaAgua = pocaAgua;
	}

	public String getMuchaAgua() {
		return muchaAgua;
	}

	public void setMuchaAgua(String muchaAgua) {
		this.muchaAgua = muchaAgua;
	}

	public String getPocoAbono() {
		return pocoAbono;
	}

	public void setPocoAbono(String pocoAbono) {
		this.pocoAbono = pocoAbono;
	}

	public ArrayList<TipoPlanta> getTiposPlantas() {
		return tiposPlantas;
	}
	
}
