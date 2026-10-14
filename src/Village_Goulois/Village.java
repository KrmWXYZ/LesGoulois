package Village_Goulois;

import LesPersonnages.Gaulois;

public class Village {
	private String nom ;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois Villageois[];
	
	
	public Village(String nom, int nbVillageois,Gaulois chef) {
		super();
		this.nom = nom ;
		this.chef = chef;
		this.Villageois = new Gaulois[nbVillageois];
		
	}


	public String getNom() {
		return nom;
	}


	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois goulois) {
		if (nbVillageois<Villageois.length) {
			Villageois[nbVillageois] = goulois ;
			nbVillageois++;
		}
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if(Villageois[numVillageois]!= null) {
			return Villageois[numVillageois];
		}
		else {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
		
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village ''"+ getNom() + "'' du chef "+ getChef().getNom() + " vivent les légendaires gaulois : ");
		for (int i =0 ; i<nbVillageois;i++) {
			System.out.println("- "+ Villageois[i].getNom());
		}
	}

	
	public static void main(String[] args) {
		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des irréductibles", 30,Abraracourcix);
		Gaulois Asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(Asterix);
		
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		
		village.afficherVillageois();
		
		Gaulois Obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(Obelix);
		village.afficherVillageois();
		
		Gaulois goulois4 = new Gaulois("Doublepolémix", 4);
		goulois4.sepresenter();
	}


	
	
	
}
