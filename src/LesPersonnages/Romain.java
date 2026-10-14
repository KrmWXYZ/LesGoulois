package LesPersonnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		assert isInvariantVerified(force);
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert isInvariantVerified(forceCoup);
		force = force - forceCoup;
		if (force < 1) {
			parler("J'abandonne !");
		} else
			parler("Aie");
		assert isInvariantVerified(force);
	}
	
	private boolean isInvariantVerified(int force) {
		return force>=0;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Romain romain = new Romain("Minus", 6);
		romain.recevoirCoup(5);
	}
}









