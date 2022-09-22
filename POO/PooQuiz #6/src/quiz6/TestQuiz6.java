package quiz6;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 
nombre        juegos    puntos
---------------------------
maria         11         23
kristel        11         21
ana         13         23
maria         13         23
laura         13         19
lucia         14         25
 */
public class TestQuiz6 {

	public static void main(String[] args) {
		Participante maria = new Participante("Maria",11,23);
		Participante kristel = new Participante("kristel",11,21);
		Participante ana = new Participante("ana",13,23);
		Participante laura = new Participante("laura",13,23);
		Participante lucia = new Participante("lucia",13,19);
		Participante cris = new Participante("cris",14,25);
		Participante juan = new Participante("Juan",10,22);
		
		 ArrayList<Participante> lista= new ArrayList<Participante>();
		 
		 lista.add(maria);
		 lista.add(lucia);
		 lista.add(ana);
		 lista.add(cris);
		 lista.add(juan);
		 lista.add(laura);
		 lista.add(kristel);
		 
		 
		 Collections.sort(lista);
		 
		 for (Participante p :lista) {
		      System.out.println(p.getName()+ " juegos: " + p.getGames() + " puntos: " + p.getPoints());
		      
		    }

	}

}
