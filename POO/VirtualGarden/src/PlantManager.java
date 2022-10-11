import java.util.ArrayList;

public class PlantManager {
	private ArrayList <Planta> garden;
	private ArrayList <TipoPlanta> tiposDisponibles;
	private Clima clima;
	public PlantManager() {
		this.garden = new ArrayList<Planta>();
		Planta ejemplos = new Planta(0);
		this.tiposDisponibles = ejemplos.getTiposPlantas();
		this.clima = new Clima();
	}
	
	public void evaluarVida (Planta pPlanta) {
		int agua = pPlanta.getAgualvl();
		int aguaMin = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMinNivelAgua();
		int aguaMax = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMaxNivelAgua();
		
		int abonoAct = pPlanta.getAbonolvl();
		int abonoMin = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMinNivelAbono();
		int anonoMax = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMaxNivelAbono();
		
		boolean restarVida = (((aguaMin >= agua) || (agua >= aguaMax)) || ((abonoMin >= abonoAct) || (abonoAct >= anonoMax)));
		int edadMaxima = pPlanta.getEtapa().get(pPlanta.getEtapa().size()-1).getRangeTime();
		if (restarVida) {
			pPlanta.setVital(pPlanta.getVital()-Config.RESTAR_VIDA);;
		}
		if (pPlanta.getEdad() >= edadMaxima) {
			pPlanta.setVital(0);;
		}
	}
	
	public boolean isAlive(Planta pPlanta) {
		if (pPlanta.getVital()<=0) {
			return false;
		}
		return true;
	}
	
	public void addPlant (int pIndex) {
		garden.add(new Planta(pIndex));
	}
	
	public void consumir(Planta pPlanta,int pLluvia,int pSol) {
		int aguaMin = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMinNivelAgua();
		int aguaMax = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMaxNivelAgua();
		
		int tempMin = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMinTemperatura();
		int tempMax = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMaxTemperatura();
		
		boolean consumoStandard = (((aguaMin <= pLluvia) && (pLluvia <= aguaMax)) && ((tempMin <= pSol) && (pSol <= tempMax)));
		
		if (consumoStandard) {
			pPlanta.setAgualvl(pPlanta.getAgualvl()-pPlanta.getConsumoAgua());
			pPlanta.setAbonolvl(pPlanta.getAbonolvl()-pPlanta.getConsumoAbono());
		}
		else {
			if (pSol > tempMax) {
				pPlanta.setAgualvl(pPlanta.getAgualvl()-(pPlanta.getConsumoAgua()*2));
				pPlanta.setAbonolvl(pPlanta.getAbonolvl()-(pPlanta.getConsumoAbono()*2));
			}
			if (pSol < tempMin) {
				pPlanta.setAbonolvl(pPlanta.getAbonolvl()-pPlanta.getConsumoAbono());
			}
			if (pLluvia > aguaMax) {
				pPlanta.setAgualvl(pPlanta.getAgualvl()+Config.REGAR);
				pPlanta.setAbonolvl(pPlanta.getAbonolvl()-pPlanta.getConsumoAbono());
			}
			if (pLluvia < aguaMin) {
				pPlanta.setAgualvl(pPlanta.getAgualvl()-(pPlanta.getConsumoAgua()*2));
				pPlanta.setAbonolvl(pPlanta.getAbonolvl()-(pPlanta.getConsumoAbono()));
			}
		}
	}
	public void cambioStage(Planta pPlanta,int pEdad, boolean pIsAlive) {
		int agua = pPlanta.getAgualvl();
		int aguaMin = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMinNivelAgua();
		int aguaMax = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMaxNivelAgua();
		
		int abonoAct = pPlanta.getAbonolvl();
		int abonoMin = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMinNivelAbono();
		int anonoMax = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMaxNivelAbono();
		
		boolean nextStage = (((aguaMin <= agua) && (agua <= aguaMax)) && ((abonoMin <= abonoAct) && (abonoAct <= anonoMax)));

		if (pEdad >= pPlanta.getEtapa().get(pPlanta.getStageIndex()).getRangeTime() && nextStage && pIsAlive) {
			pPlanta.setStageIndex(pPlanta.getStageIndex()+1);
			pPlanta.setVital(100);
		}
		
	}
	public void evaluate (int pSol, int pLluvia) {
		
		for (Planta planta: garden) {
			System.out.println("----//// 	    THINGS ARE HAPPENING   	////----");
			this.consumir(planta, pLluvia, pSol);
			this.cambioStage(planta, planta.getEdad(), this.isAlive(planta));
			this.evaluarVida(planta);
			this.setActualImage(planta, this.isAlive(planta));
			planta.setEdad(planta.getEdad()+1);
			System.out.println("Plnatla tipo:  "+ planta.getNombre()+ "  con vida: " + planta.getVital() + " ABONO:  "+ planta.getAbonolvl() + 
					"  AGUA: " + planta.getAgualvl() +" EDAD: "+ planta.getEdad()+"ACTUAL STAGE: "+planta.getStageIndex() +" IMAGEN ACTUAL: "+ planta.getImagenActual());
		}
	}
	
	public String getActualImage(Planta pPlanta) {
		return pPlanta.getImagenActual();
	}
	public void setActualImage(Planta pPlanta, boolean pIsAlive) {
		int agua = pPlanta.getAgualvl();
		int aguaMin = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMinNivelAgua();
		int aguaMax = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMaxNivelAgua();
		
		int abonoAct = pPlanta.getAbonolvl();
		int abonoMin = pPlanta.getEtapa().get(pPlanta.getStageIndex()).getMinNivelAbono();
		
		boolean seco = aguaMin > agua;
		boolean faltaAbono= abonoMin > abonoAct;
		boolean muchaAgua = agua > aguaMax;

		if (pIsAlive) {
			if (!seco && !faltaAbono && !muchaAgua) {
				pPlanta.setImagenActual(pPlanta.getEtapa().get(pPlanta.getStageIndex()).getImagen());
			}
			else {
				if (seco) {
					pPlanta.setImagenActual(pPlanta.getPocaAgua());
				}
				else if (faltaAbono) {
					pPlanta.setImagenActual(pPlanta.getPocoAbono());
				}
				else if (muchaAgua) {
					pPlanta.setImagenActual(pPlanta.getMuchaAgua());
				}
			}
		}
		else{
			pPlanta.setImagenActual(pPlanta.getEtapa().get(0).getImagen());
		}
	}
	
	public void abonar(int pIndex) {
		garden.get(pIndex).setAbonolvl(garden.get(pIndex).getAbonolvl()+Config.ABONAR);
	}
	public void regar(int pIndex) {
		garden.get(pIndex).setAgualvl(garden.get(pIndex).getAgualvl()+Config.REGAR);
	}
	public ArrayList <Planta> getGarden() {
		return garden;
	}

	public ArrayList <TipoPlanta> getTiposDisponibles() {
		return tiposDisponibles;
	}
	public ArrayList <String> vidaActual(){
		ArrayList <String> nuevasVidas = new ArrayList <String>();
		for (Planta p: garden) {
			nuevasVidas.add(p.getVital()+"");
		}
		return nuevasVidas;
	}

	public Clima getClima() {
		return clima;
	}
	
}
