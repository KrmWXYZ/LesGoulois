package village_gaulois;

import histoire.Trophee;
import personnages.Gaulois;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophees = 0;
	
	public void donnerTrophee(Gaulois goulois , Trophee trophee) {
		trophees[nbTrophees] = trophee;
		nbTrophees++;
	}
	
}
