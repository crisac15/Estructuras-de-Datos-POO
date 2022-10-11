import java.util.ArrayList;

public class TipoPlanta {
	private String nombreS;
	private int edadS;
	private int vitalS;
	private int agualvlS;
	private int abonolvlS;
	private String imagenActualS;
	private String pocaAguaS;
	private String muchaAguaS;
	private String pocoAbonoS;
	private int consumoAguaS;
	private int consumoAbonoS;
	private int stageIndexS;
	private ArrayList <Stage> etapaS;
	
	TipoPlanta(){
		
	}
	
	public String getNombreS() {
		return nombreS;
	}
	public void setNombreS(String pNombreS) {
		this.nombreS = pNombreS;
	}
	public int getEdadS() {
		return edadS;
	}
	public void setEdadS(int pEdadS) {
		this.edadS = pEdadS;
	}
	public int getVitalS() {
		return vitalS;
	}
	public void setVitalS(int vitalS) {
		this.vitalS = vitalS;
	}
	public int getAgualvlS() {
		return agualvlS;
	}
	public void setAgualvlS(int agualvlS) {
		this.agualvlS = agualvlS;
	}
	public String getImagenActualS() {
		return imagenActualS;
	}
	public void setImagenActualS(String pImagenActualS) {
		this.imagenActualS = pImagenActualS;
	}
	public int getConsumoAguaS() {
		return consumoAguaS;
	}
	public void setConsumoAguaS(int consumoAguaS) {
		this.consumoAguaS = consumoAguaS;
	}
	public int getConsumoAbonoS() {
		return consumoAbonoS;
	}
	public void setConsumoAbonoS(int consumoAbonoS) {
		this.consumoAbonoS = consumoAbonoS;
	}
	public int getStageIndexS() {
		return stageIndexS;
	}
	public void setStageIndexS(int stageIndexS) {
		this.stageIndexS = stageIndexS;
	}

	public ArrayList <Stage> getEtapaS() {
		return etapaS;
	}

	public void setEtapaS(ArrayList <Stage> etapaS) {
		this.etapaS = etapaS;
	}

	public int getAbonolvlS() {
		return abonolvlS;
	}

	public void setAbonolvlS(int pAbonolvlS) {
		this.abonolvlS = pAbonolvlS;
	}

	public String getPocaAguaS() {
		return pocaAguaS;
	}

	public void setPocaAguaS(String pocaAguaS) {
		this.pocaAguaS = pocaAguaS;
	}

	public String getMuchaAguaS() {
		return muchaAguaS;
	}

	public void setMuchaAguaS(String muchaAguaS) {
		this.muchaAguaS = muchaAguaS;
	}

	public String getPocoAbonoS() {
		return pocoAbonoS;
	}

	public void setPocoAbonoS(String pocoAbonoS) {
		this.pocoAbonoS = pocoAbonoS;
	}
	
}
