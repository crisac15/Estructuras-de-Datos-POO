public class TimeLine extends Thread{
	private Thread hilo;
	private boolean isAnable;
	private int dias;
	private int annos;
	private PlantManager garden;
	private Clima clima;
	private Controller controller;
	
	public TimeLine (PlantManager pManager) {
		this.garden = pManager;
		
	}
	public void run () {
		this.clima = new Clima();
		
		try {
			while (isAnable) {
				this.controller.actualizarFrame();
				clima.climaActual(dias);
				System.out.println("Estacion Actual: "+ clima.getCurrentSeason().getNombre()+" "+"Dias: "+ dias + " nivel de sol:  " + clima.getSol()
				+ " nivel de lluvia:  " + clima.getLluvia());
				System.out.println("");
				System.out.println("");
				this.garden.evaluate(clima.getSol(), clima.getLluvia());
				dias++;
				if (this.dias >= 365) {
					this.dias = 0;
					this.annos++;
				}
				
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void iniciar () {
		this.isAnable = true;
		this.hilo = new Thread (this);
		hilo.start();
	}
	public void detener () {
		this.isAnable = false;
	}
	public void nuevaPartida () {
//		this.nuevaPartida = new TimeLine(this);
//		nuevaPartida.iniciar();
		this.iniciar();
		try {
			Thread.sleep(500000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.detener();
	}
	
	public boolean isAnable() {
		return isAnable;
	}
	public Clima getClima() {
		return this.clima;
	}
	
	public int getDias() {
		return dias;
	}
	public void setController(Controller pController) {
		this.controller = pController;
	}
}
