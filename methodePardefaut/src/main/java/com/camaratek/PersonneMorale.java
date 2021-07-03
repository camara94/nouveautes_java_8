package com.camaratek;

public class PersonneMorale implements Personne {

	private String nom;
	
	

	public PersonneMorale() {}
	
	public PersonneMorale(String nom) {
		this.nom = nom;
	}

	@Override
	public String getNom() {
		return this.nom;
	}

}
