package com.camaratek;

public class Personne {
	private String nom;
	private int age;
	public Personne() {}
	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static int compare(Personne o1, Personne o2) {
		Personne p1 = o1;
		Personne p2 = o2;
		return p1.getAge() - p2.getAge();
	}
	
	@Override
	public String toString() {
		return "Je m'appelle " + this.nom + ", et j'ai " + this.age + " ans";
	}
}
