package com.camaratek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		
		Personne[] personnes = new Personne[4];
		CompareTo c = new CompareTo();
		Personne p1 = new Personne("Laby Damaro", 28);
		Personne p2 = new Personne("M'balou", 26);
		Personne p3 = new Personne("Moussa", 31);
		Personne p4 = new Personne("Ousmane", 32);
		
		personnes[0] = p4;
		personnes[1] = p3;
		personnes[2] = p2;
		personnes[3] = p1;
		
		for( int i=0; i < personnes.length; i++ )
			 System.out.println(personnes[i]);
		
		
		Arrays.sort(personnes, new CompareTo() );
		
		//Arrays.sort(personnes, Personne::compare);

		System.out.println("\n\n");
		for( int i=0; i < personnes.length; i++ )
			 System.out.println(personnes[i]);
	}

}
