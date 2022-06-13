package types;

import animaux.Animal;

public abstract class Autre extends Animal {

	public Autre(String nom, char sexe, int poids, float taille, int age, boolean aFaim, boolean dors, float sante) {
		super(nom, sexe, poids, taille, age, aFaim, dors, sante);
		// TODO Auto-generated constructor stub
	}


	/**
	 *  Permet d'accoucher seulement si c'est une femelle
	 */
	public void Accouchement() {
		if(this.getSexe() == 'F') {
			System.out.println("L'animal pond des oeufs");
		}
		
	}
}
