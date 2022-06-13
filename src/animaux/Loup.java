package animaux;

import interfaces.Vagabonder;
import types.Autre;

public class Loup extends Autre implements Vagabonder {

	public Loup(String nom, char sexe, int poids, float taille, int age, boolean aFaim, boolean dors, float sante) {
		super(nom, sexe, poids, taille, age, aFaim, dors, sante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emmettreSon() {
		return "Le loup grogne !!!";
	}

	@Override
	public void vagabonde() {
		System.out.println("Le loup vagabonde !!!");
	}

}
