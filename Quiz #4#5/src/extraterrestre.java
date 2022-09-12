
public class extraterrestre extends Super implements superCaract {
	public extraterrestre (String pNombre) {
		this.setNombre(pNombre);
		this.setTipo("extraterrestre");
	}

	public void nombreHeroe() {
		System.out.println("El nombre de este heroe es:" + this.getNombre());
	}

	public void caractRaza() {
		System.out.println("Los extraterrestres son una raza de caracteristicas proporcionales al universo, los hay bajos, altos, fuertes, debiles. Sus poderes no siguen la logica de nuestro planeta.");
		
	}
	public void origen() {
		System.out.println("Origen: algun lugar del universo");
		
	}
	
}
