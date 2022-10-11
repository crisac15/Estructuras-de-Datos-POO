import java.util.Random;

public class Clima {
	private int anno;
	private int sol;
	private int lluvia;
	private int numEstaciones;
	private int cambioSeason;
	private int currentId = 0;
	private int diasEntreEstaciones;
	private int diasEntreAnno = 0;
	Estacion currentSeason;
	
	public Clima () {
		this.currentSeason = new Estacion();
		this.numEstaciones = currentSeason.getTotalEstaciones();
		this.cambioSeason = 365/numEstaciones;
		
	}
	
	public void climaActual (int pDias) {
		
		
		if (pDias > this.diasEntreAnno && pDias < (this.diasEntreAnno + this.cambioSeason)) {
			currentSeason.actual(currentId++);
			this.diasEntreAnno += this.cambioSeason;
		}
		if (pDias >= cambioSeason*numEstaciones) {
			this.currentId = 0;
			this.diasEntreAnno = 0;
		}
		Random aleatorio = new Random();
		System.out.println("===============================================");
		
		int lluviaMin = this.currentSeason.getNivelLluviaMin();
		int lluviaMax = this.currentSeason.getNivelLluviaMax();
		this.lluvia = aleatorio.nextInt(lluviaMin, lluviaMax+1);
		
		int solMin = this.currentSeason.getNivelSolMin();
		int solMax = this.currentSeason.getNivelSolMax();
		this.sol = aleatorio.nextInt(solMin, solMax+1);
	}

	public int getAnno() {
		return anno;
	}

	public int getSol() {
		return sol;
	}

	public int getLluvia() {
		return lluvia;
	}

	public Estacion getCurrentSeason() {
		return currentSeason;
	}

	
}
