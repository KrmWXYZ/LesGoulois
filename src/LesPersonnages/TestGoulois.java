package LesPersonnages;

public class TestGoulois {
	public static void main(String[] args) {

		Gaulois goulois1 = new Gaulois("Astérix", 3);
		Gaulois goulois2 = new Gaulois("Obelix", 3);
		Romain romain1 = new Romain("Minus", 3);

		goulois1.parler("Bonjour Obélix.");
		goulois2.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		goulois1.parler("Oui très bonne idée.");
		goulois1.frapper(romain1);
		romain1.recevoirCoup(1);
		goulois1.frapper(romain1);
		romain1.recevoirCoup(1);
		goulois1.frapper(romain1);
		romain1.recevoirCoup(1);

	}
}
