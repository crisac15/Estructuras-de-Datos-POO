public class TimeLine extends Thread{
	private Thread hilo;
	private boolean isAnable;
	private int dias = 0;
	private int annos = 0;
	private PlantManager garden;
	private Clima clima;
	private MainFrame controlledFrame;
	
	public TimeLine (PlantManager pManager, MainFrame pMain) {
		this.garden = pManager;
		this.controlledFrame = pMain;
	}
	public void run () {
		this.clima = this.garden.getClima();
		
		try { 
			while (isAnable) {
				if (garden.getGarden().size()>=1) {
					controlledFrame.actulizarImagenes();
				}
				controlledFrame.actulizarVida(garden.vidaActual());
				clima.climaActual(dias);
				System.out.println("Estacion Actual: "+ clima.getCurrentSeason().getNombre()+" annos trasnscurridos:  "+ annos +"Dias: "+ dias + " nivel de sol:  " + clima.getSol()
				+ " nivel de lluvia:  " + clima.getLluvia());
				System.out.println("");
				System.out.println("");
				this.garden.evaluate(clima.getSol(), clima.getLluvia());
				dias++;
				if (this.dias >= 365) {
					this.dias = 0;
					this.annos++;
					}
				Thread.sleep(2000);
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
	
	public boolean isAnable() {
		return isAnable;
	}
	public Clima getClima() {
		return this.clima;
	}
	
	public int getDias() {
		return dias;
	}

}
