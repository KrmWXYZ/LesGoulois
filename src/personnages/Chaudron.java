package personnages;

public class Chaudron {
	int quantitePotion;
	int forcePotion;

	public Chaudron(int quantitePotion, int forcePotion) {
		super();
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	

	
	 public boolean resterPotion() {
		 return true;
	  }
	  
	 public int prendreLouche() {
		 quantitePotion -- ;
		 if(quantitePotion==0) {
			 forcePotion=0;
		 }
		 return forcePotion ;
	  }
	 
}
