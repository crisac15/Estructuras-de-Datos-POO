
public class artificial extends Super implements superCaract {

	public artificial (String pNombre) {
		this.setNombre(pNombre);
	}
	public void nombreHeroe() {
		System.out.println("El nombre de este heroe es:" + this.getNombre());
	}

	public void caractRaza() {
		System.out.println("Los heroes de tipo artificial suelen ser maquinas creadas por humanos o seres fuera de nuestro planeta, destacan por el uso de armas de todo tipo y carecer de emociones");
		
	}
	public void origen() {
		System.out.println("Origen : Depende del creador, principalmente de la tierra");
		
	}

}
