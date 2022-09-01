package Yate.Simulador;
import java.util.ArrayList;

public class AdminEnergia {
	private ArrayList <Bateria> listaBaterias = new ArrayList <Bateria>();
	private  ArrayList <Panel> listaPaneles = new ArrayList <Panel>();
	
	public AdminEnergia (ArrayList <Bateria> pBaterias, ArrayList <Panel> pPaneles) {
		for(int i = 0; i < pBaterias.size(); i = i + 1) {
			listaBaterias.add( pBaterias.get(i));
		}
		for(int j = 0; j < pPaneles.size(); j = j + 1) {
			listaPaneles.add( pPaneles.get(j));
		}
		}
	void CargarBaterias () {
		for(int i = 0; i < listaPaneles.size(); i = i + 1)
		{
			for(int j = 0; j < listaBaterias.size(); j = j + 1) {
				if ( listaPaneles.get(i).getAlmacenamiento() <= 100 && listaPaneles.get(i).getAlmacenamiento() != 0 ) {
					//System.out.println("///////////////////ACA///////////////// ");
					if ( listaBaterias.get(j).getNivelCarga() < 75) {
						
						listaBaterias.get(j).setNivelCarga(listaBaterias.get(j).getNivelCarga() + listaPaneles.get(j).getCapacidadParaCargar()); //cargo bateria
						listaPaneles.get(i).setAlmacenamiento(listaPaneles.get(i).getAlmacenamiento()-listaPaneles.get(i).getCapacidadParaCargar()); // despues resto al almacenamiento del panel
						System.out.println("La bateria "+ (j+1) + " ha recibido energia del panel y esta al " + listaBaterias.get(j).getNivelCarga()+ " % de su capacidad" +"\n");
						System.out.println("El panel "+ (i+1) + " ha reducido su almacenamiento al " + listaPaneles.get(i).getAlmacenamiento()+ " % de su capacidad" +"\n");
					}
				}
				
			}
		}	 
	}
	void CargarPanel (int pSol) {
		
		if (pSol <= 100 && pSol != 0) {
			for(int i = 0; i < listaPaneles.size(); i = i + 1) {
				if (listaPaneles.get(i).getAlmacenamiento() < 100) {
					System.out.println("*****************************CARGA Panel************************** ");
					listaPaneles.get(i).setAlmacenamiento(listaPaneles.get(i).getAlmacenamiento() + Constants.CARGA_PANEL*pSol/100);
					System.out.println("El panel "+ (i+1) + " se ha cargado y ha aumentado un " + listaPaneles.get(i).getAlmacenamiento()+ " % su almacenamiento" +"\n");
				}
				
			}	
		}
	}
	void RestarBaterias (int pVelocidadAct, int pConsumo) {
		System.out.println("**************************DESCARGA BATERIA************************** ");
		for(int i = 0; i < listaBaterias.size(); i = i + 1)
		{
			if ( listaBaterias.get(i).getNivelCarga() <= 100 & listaBaterias.get(i).getNivelCarga() != 0 ) {
				listaBaterias.get(i).setNivelCarga(listaBaterias.get(i).getNivelCarga() - pConsumo);
				System.out.println("La baterria "+ (i+1) + " ha reducido su carga al " + listaBaterias.get(i).getNivelCarga() + " % de su capacidad. " +"\n");
				}
			}
		}	 
	}
