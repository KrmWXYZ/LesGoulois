package LesPersonnages;

public class Chaudron {
	int quantitePotion;
	int forcePotion;

	public Chaudron(int quantitéPotion, int forcePotion) {
		super();
		this.quantitePotion = quantitéPotion;
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
