package LesPersonnages;

public class Goulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Goulois(String nom, int force) {
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
		return "Le gaulois " + nom + " : ";
	}

	public String toString() {
		return "Goulois [nom=" + nom + ", force=" + force + "]";
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la machoire de " + nomRomain);
		int forceCoup = (force*effetPotion) / 3;
		romain.recevoirCoup(forceCoup);
		effetPotion --;
		if (effetPotion<1) {
			effetPotion =1;
		}
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}

}
