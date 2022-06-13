package animaux;

public abstract class Animal {
	
	private String nom;
	private char sexe;
	private int poids;
	private float taille;
	private int age;
	private boolean aFaim;
	private boolean dors;
	private float sante;
	private int dureeGestation;
	private int dureeIncubation;

	public Animal(String nom, char sexe, int poids, float taille, int age, boolean aFaim, boolean dors, float sante) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
		this.aFaim = aFaim;
		this.dors = dors;
		this.sante = sante;
		this.setDureeGestation(0);
		this.setDureeIncubation(0);
	}
    
	/** 
	 * methode qui permet de nourir l'animal
	 * @return
	 */
	public String manger() {
		if(!this.dors) {
			String response = "Le " + this.nom + " mange";
			return response;
		}
		return null;
	}
	 
	/** 
	 * mmethode abstraite qui ce fait overrider
	 * @return
	 */
	public abstract String emmettreSon();
	
	public void seSoigner(int points) {
		this.sante += points;
	}
	
	public void seReveiller() {
		this.dors = !this.dors;
	}
	
	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public char getSexe() {
		return sexe;
	}
	
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	
	public int getPoids() {
		return poids;
	}
	
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	public float getTaille() {
		return taille;
	}
	
	public void setTaille(float taille) {
		this.taille = taille;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isaFaim() {
		return aFaim;
	}
	
	public void setaFaim(boolean aFaim) {
		this.aFaim = aFaim;
	}
	
	public boolean isDors() {
		return dors;
	}
	
	public void setDors(boolean dors) {
		this.dors = dors;
	}
	
	public float getSante() {
		return sante;
	}
	
	public void setSante(float sante) {
		this.sante = sante;
	}

	public int getDureeGestation() {
		return dureeGestation;
	}

	public void setDureeGestation(int dureeGestation) {
		this.dureeGestation = dureeGestation;
	}

	public int getDureeIncubation() {
		return dureeIncubation;
	}

	public void setDureeIncubation(int dureeIncubation) {
		this.dureeIncubation = dureeIncubation;
	}
}
