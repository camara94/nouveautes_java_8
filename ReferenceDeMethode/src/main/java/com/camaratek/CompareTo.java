package com.camaratek;

import java.util.Comparator;

public class CompareTo implements Comparator<Personne> {

	public int compare(Personne o1, Personne o2) {
		Personne p1 = o1;
		Personne p2 = o2;
		return p1.getAge() - p2.getAge();
	}

}
