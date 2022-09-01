package Yate.Simulador;

public class Simulador extends Thread{
//	public Hilo (String msg) {
	private int solActual = Constants.PORCENTAJE_SOL;
	private int consumoAct = Constants.CONSUMO_INICIAL;
	private int velAct = 1;
	private AdminEnergia admin1;
public Simulador (AdminEnergia pAdmin) {
	this.admin1 = pAdmin;
}
public void run () {
		try {
			
			Thread.sleep(5000); 
			admin1.RestarBaterias(velAct,consumoAct);
			solActual = solActual- 20;
			
			Thread.sleep(10000); 
			admin1.RestarBaterias(velAct,consumoAct);
			
			Thread.sleep(5000); 
			solActual = solActual- 10;
			velAct++;
			consumoAct = consumoAct*velAct;
			admin1.RestarBaterias(velAct,consumoAct);
			
			Thread.sleep(6000);
			admin1.CargarBaterias();
			admin1.CargarPanel(solActual);
			
			Thread.sleep(6000); 
			admin1.CargarBaterias();
			admin1.CargarPanel(solActual);
			
			Thread.sleep(7000); 
			admin1.RestarBaterias(velAct,consumoAct);
			solActual = solActual- 20;
			
			Thread.sleep(7000); 
			admin1.RestarBaterias(velAct,consumoAct);
			
			Thread.sleep(5000); 
			solActual = solActual + 30;
			velAct++;
			consumoAct = consumoAct*velAct;
			admin1.RestarBaterias(velAct,consumoAct);
			
			Thread.sleep(7000);
			admin1.CargarBaterias();
			
			Thread.sleep(5000); 
			admin1.CargarPanel(solActual);
			
			Thread.sleep(5000); 
			admin1.RestarBaterias(velAct,consumoAct);
			admin1.CargarBaterias();
			admin1.CargarPanel(solActual);
			System.out.println("----------------------FINAL------------ ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
