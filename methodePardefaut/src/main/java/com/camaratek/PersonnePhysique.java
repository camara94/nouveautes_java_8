package com.camaratek;

public class PersonnePhysique implements Personne{

	private int age;
	private String nom;
	
	public PersonnePhysique() {}
	

	public PersonnePhysique(int age, String nom) {
		this.age = age;
		this.nom = nom;
	}


	public int getAge() {
		return this.age;
	}

	@Override
	public String getNom() {
		return this.nom;
	}

}
