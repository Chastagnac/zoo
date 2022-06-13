package animaux;

import interfaces.Vagabonder;
import types.Autre;

public class Ours extends Autre implements Vagabonder {

	static final int DEFAULT_DUREE_GESTATION = 9;
	
	public Ours(String nom, char sexe, int poids, float taille, int age, boolean aFaim, boolean dors, float sante) {
		super(nom, sexe, poids, taille, age, aFaim, dors, sante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emmettreSon() {
		return "L'ours hurle";
	}

	@Override
	public void vagabonde() {
		System.out.println("L'ours vagabonde");
	}

}
