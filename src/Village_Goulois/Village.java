package Village_Goulois;

import LesPersonnages.Goulois;

public class Village {
	private String nom ;
	private Goulois chef ;
	private int nbVillageois = 0;
	private Goulois Villageois[] = new Goulois[nbVillageois] ;
	
	
	public Village(String nom,Goulois chef, int nbVillageois) {
		super();
		this.nom = nom;
		this.chef = chef;
		this.nbVillageois = nbVillageois;
	}


	public String getNom() {
		return nom;
	}


	/*public Goulois getChef() {
		return nbVillageois;
	}*/
	
	public void ajouterVillageois(Goulois goulois) {
		Villageois[nbVillageois] = goulois ;
		nbVillageois++;
	}
	
	public Goulois trouverVillageois(int numVillageois) {
		return Villageois[numVillageois];
	}
	
	public void afficherVillageois() {
		
	}

	
	public static void main(String[] args) {
		Goulois chef = new Goulois("Abraracourcix", 6);
		Village village = new Village("Village des irréductibles",chef, 30);
		Goulois Asterix = new Goulois("Astérix", 8);
		village.ajouterVillageois(Asterix);
		
		Goulois gaulois = village.trouverVillageois(1);
		 System.out.println(gaulois);
		/*gaulois = village.trouverVillageois(2);
		 System.out.println(gaulois);*/
	}


	
	
	
}
