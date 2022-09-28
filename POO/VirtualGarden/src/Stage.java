
public class Stage {
	private int nivel;
	private int minNivelAgua;
	private int maxNivelAgua;
	private int minTemperatura;
	private int maxTemperatura;
	private int minNivelAbono;
	private int maxNivelAbono;
	private int rangeTime;
	private String imagen;
	
	public Stage () {
		
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getMinNivelAgua() {
		return minNivelAgua;
	}
	public void setMinNivelAgua(int minNivelAgua) {
		this.minNivelAgua = minNivelAgua;
	}
	public int getMaxNivelAgua() {
		return maxNivelAgua;
	}
	public void setMaxNivelAgua(int maxNivelAgua) {
		this.maxNivelAgua = maxNivelAgua;
	}
	public int getMinTemperatura() {
		return minTemperatura;
	}
	public void setMinTemperatura(int minTemperatura) {
		this.minTemperatura = minTemperatura;
	}
	public int getMaxTemperatura() {
		return maxTemperatura;
	}
	public void setMaxTemperatura(int maxTemperatura) {
		this.maxTemperatura = maxTemperatura;
	}
	public int getMinNivelAbono() {
		return minNivelAbono;
	}
	public void setMinNivelAbono(int minNivelAbono) {
		this.minNivelAbono = minNivelAbono;
	}
	public int getMaxNivelAbono() {
		return maxNivelAbono;
	}
	public void setMaxNivelAbono(int maxNivelAbono) {
		this.maxNivelAbono = maxNivelAbono;
	}
	public int getRangeTime() {
		return rangeTime;
	}
	public void setRangeTime(int rangeTime) {
		this.rangeTime = rangeTime;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String pImagen) {
		this.imagen = pImagen;
	}
	
}
