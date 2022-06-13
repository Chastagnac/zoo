package animaux;

import interfaces.Nager;
import types.Mammifere;

public class Requin extends Mammifere  implements Nager{
	
	static final int DEFAULT_DUREE_GESTATION = 9;
	
	public Requin(String nom, char sexe, int poids, float taille, int age, boolean aFaim, boolean dors, float sante) {
		super(nom, sexe, poids, taille, age, aFaim, dors, sante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emmettreSon() {
		return "Le requin claque des dents !!!";
	}

	@Override
	public void nage() {
		System.out.println("Le requin nage !!!");
	}

}
