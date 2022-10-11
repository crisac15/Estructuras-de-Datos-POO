import java.util.ArrayList;

public class Estacion {
	private String nombre;
	private int nivelSolMax;
	private int nivelSolMin;
	private int nivelLluviaMin;
	private int nivelLluviaMax;
	private int totalEstaciones;
	private ArrayList <TipoEstacion> seasons;
	
	public Estacion () {
		PlantScanner load = new PlantScanner();
		this.seasons = load.loadSeason();
		this.totalEstaciones = seasons.size();
	}
	public void actual (int pIndex) {
		TipoEstacion actual = seasons.get(pIndex%totalEstaciones);
		
		this.setNombre(actual.getNombreS());
		this.setNivelLluviaMax(actual.getNivelLluviaMaxS());
		this.setNivelLluviaMin(actual.getNivelLluviaMinS());
		this.setNivelSolMax(actual.getNivelSolMaxS());
		this.setNivelSolMin(actual.getNivelSolMinS());
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNivelSolMax() {
		return nivelSolMax;
	}
	public void setNivelSolMax(int nivelSolMax) {
		this.nivelSolMax = nivelSolMax;
	}
	public int getNivelSolMin() {
		return nivelSolMin;
	}
	public void setNivelSolMin(int nivelSolMin) {
		this.nivelSolMin = nivelSolMin;
	}
	public int getNivelLluviaMin() {
		return nivelLluviaMin;
	}
	public void setNivelLluviaMin(int nivelLluviaMin) {
		this.nivelLluviaMin = nivelLluviaMin;
	}
	public int getNivelLluviaMax() {
		return nivelLluviaMax;
	}
	public void setNivelLluviaMax(int nivelLluviaMax) {
		this.nivelLluviaMax = nivelLluviaMax;
	}
	public int getTotalEstaciones() {
		return totalEstaciones;
	}
	public ArrayList<TipoEstacion> getSeasons() {
		return seasons;
	}

}
