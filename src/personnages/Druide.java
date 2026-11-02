package personnages;

public class Druide {
	String nom ;
	int force ;
	Chaudron chaudron;
	
	public Druide(String nom , int foce) {
		this.nom=nom;
		this.force=foce;
		this.chaudron = new Chaudron(0, 0);
	}
	
	private String prendreParole() {
	return "Le Druide " + nom + " : ";
	}
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	public void fabriquerPotion(int quantité , int forcePotion) {
		chaudron.remplirChaudron(quantité, forcePotion);
		parler("J'ai concoté " + quantité + " doses de potion magique . Elle a une force de " + forcePotion+ ".");
	}
	
	public void booster(Gaulois goulois) {
		boolean contientPotion = chaudron.resterPotion();
		String nomGoulois = goulois.getNom();
		if(contientPotion) {
			if(nomGoulois=="Obélix") {
				parler("Non, " + nomGoulois + " Non !...Et tu le sais très bien !");
			}
			else {
				int forcepotion = chaudron.prendreLouche();
				goulois.boirePotion(forcepotion);
				parler("Tiens "+nomGoulois+ " un peu de portion magique");
			}
		}
		else {
			parler("Désolé "+nomGoulois+" il n'y a plus une seul goutte de potion");
		}
	}

	public String getNom() {
		return nom;
	}


}
