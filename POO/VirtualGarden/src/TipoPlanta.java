import java.util.ArrayList;

public class TipoPlanta {
	private String nombreS;
	private int idS;
	private int vitalS;
	private int agualvlS;
	private int templvlS;
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
	public int getIdS() {
		return idS;
	}
	public void setIdS(int idS) {
		this.idS = idS;
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
	public int getTemplvlS() {
		return templvlS;
	}
	public void setTemplvlS(int templvlS) {
		this.templvlS = templvlS;
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
	
}
