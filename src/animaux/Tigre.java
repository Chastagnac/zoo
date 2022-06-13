package animaux;

import interfaces.Vagabonder;
import types.Autre;

public class Tigre extends Autre  implements Vagabonder {

	static final int DEFAULT_DUREE_GESTATION = 9;
	
	public Tigre(String nom, char sexe, int poids, float taille, int age, boolean aFaim, boolean dors, float sante) {
		super(nom, sexe, poids, taille, age, aFaim, dors, sante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emmettreSon() {
		return "Le tigre rugit !!!";
	}

	@Override
	public void vagabonde() {
		System.out.println("Le tigre vagabonde !!!");
	}

}
