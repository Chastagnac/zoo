package types;

import animaux.Animal;

public abstract class Mammifere extends Animal {

	public Mammifere(String nom, char sexe, int poids, float taille, int age, boolean aFaim, boolean dors,
			float sante) {
		super(nom, sexe, poids, taille, age, aFaim, dors, sante);
		// TODO Auto-generated constructor stub
	}

	/**
	 *  Permet de mettre bas
	 */
	public void MettreBas() {
		System.out.println("Le mammifère met bas");
	}

}
