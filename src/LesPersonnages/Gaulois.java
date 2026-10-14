package LesPersonnages;

import Village_Goulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village ;

	public Gaulois(String nom, int force) {
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
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
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
	
	public void setVillage(Village village) {
		this.village=village;
	}
	
	public void sepresenter() {
		if(this.village==null) 
			System.out.println("Le Gaulois "+ getNom() + " :  ''Bonjour, je m'appelle "+ getNom() +". Je voyage de villages en villages''");
		else if(village.getChef()==this) 
			System.out.println("Le Gaulois "+ getNom() + " :  ''Bonjour, je m'appelle "+ getNom() +". Je suis le chef le village : "+ village.getNom() + ".''");
		else 
			System.out.println("Le Gaulois "+ getNom() + " :  ''Bonjour, je m'appelle "+ getNom() +". J'habite le village : "+ village.getNom() + ".''");
			
		
	}

}
