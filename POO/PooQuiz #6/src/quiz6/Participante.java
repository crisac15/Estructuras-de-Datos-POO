package quiz6;

/*
 *  Dichos participantes poseen un nombre, la cantidad de juegos realizados y la cantidad de puntos obtenidos a la fecha.
 *  
- Investigue la interface de java Comparable
- Declare una clase Participante que implemente a Comparable 
- Llene un ArrayList desordenado de al menos 7 participantes con juegos y puntos diferentes
- Use el método sort de ArrayList para que los ordene con el criterio expuesto arriba
- Imprima con un for sobre collections los Participantes ordenados para revisar que funciona

 */
public class Participante implements Comparable<Participante>{
	private String name;
	private int games;
	private int points;
	public Participante (String pNombre, int pGames, int pPuntos) {
		this.setName(pNombre);
		this.setGames(pGames);
		this.setPoints(pPuntos);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGames() {
		return games;
	}
	public void setGames(int games) {
		this.games = games;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public int compareTo(Participante pParticipante) {
		if (this.getGames()>pParticipante.getGames()) {
		      return 1;
		    }
		else if (this.getGames()<pParticipante.getGames()) {
		      return -1;
		    }
		else {
			if (this.getPoints()<pParticipante.getPoints()) {
				return 1;
				}
			else if (this.getPoints()>pParticipante.getPoints()) {
	    	return -1;
	    	}
			else {
	    	return 0;
	    	}
		}
	}
	
}
