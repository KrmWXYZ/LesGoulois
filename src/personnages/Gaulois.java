package personnages;

import objets.Equipement;
import village_gaulois.Musee;
import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private Village village ;
	private int force;
	private int  nb_trophees;
	private Equipement[] trophees = new Equipement[100];
	
	
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
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 2) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
		effetPotion = 1;
		}
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
		this.trophees[nb_trophees] = trophees[i];
		}
		}
	
		public void faireUneDonnation(Musee musee) {
			String text ="";
			if (this.nb_trophees >0) {
				parler("<<Je donne au musee tous mes trophees");
				for(int i =0 ; i<nb_trophees;i++) {
					text += "\n";
					text += "- "+ trophees[i];
				}
				text += ">>";
				System.out.println(text);
				
			}
				
		}


}
