
public class Human extends Super implements superCaract {
	public Human (String pNombre) {
		this.setNombre(pNombre);
		this.setTipo("Humano");
	}
	public void nombreHeroe() {
		System.out.println("El nombre de este heroe es:" + this.getNombre());
	}

	public void caractRaza() {
		System.out.println("Los humanos son una raza debil, suelen usar artefactos tecnologicos para combatir");
		
	}
	public void origen() {
		System.out.println("Origen: Planeta Tierra");
	}

}
