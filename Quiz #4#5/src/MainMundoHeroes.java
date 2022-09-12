
public class MainMundoHeroes {

	public static void main(String[] args) {
		// declaramos 3 heroes de cada tipo, cada clase Human, artificial y extraterrestre hereda los atributos propios y metodos getter y setter 
		// de la class Super, ademas implementa la plantilla de metodos de superCaract donde se define la plantida de 3 caracteristicas para cada tipo
		// de heroe
		Human humano = new Human ("Juan Santamaria");
		artificial dron = new artificial ("robot de guerra");
		extraterrestre marciano = new extraterrestre ("Marvin el Marciano");
		
		
		System.out.println("");
		System.out.println("atributos heredados y metodos implementados por interfaz para heroes de tipo humanos:");
		humano.nombreHeroe();
		humano.origen();
		humano.caractRaza();
		
		System.out.println("");
		System.out.println("atributos heredados y metodos implementados por interfaz para heroes de tipo extraterrestre:");
		marciano.nombreHeroe();
		marciano.origen();
		marciano.caractRaza();
		
		System.out.println("");
		System.out.println("atributos heredados y metodos implementados por interfaz para heroes de tipo artificial:");
		dron.nombreHeroe();
		dron.origen();
		dron.caractRaza();
		
	}

}
