package com.camaratek;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main( String[] args ) {
		List<Personne> personnes = new ArrayList<Personne>();
		personnes.add(new PersonnePhysique(28, "Laby Damaro"));
		personnes.add(new PersonnePhysique(31, "Moussa"));
		personnes.add(new PersonneMorale("Laby Damaro"));
		
		
		personnes.forEach( p -> System.out.println(p.getNom()));
	}
}
