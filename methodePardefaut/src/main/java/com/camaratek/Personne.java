package com.camaratek;

public interface Personne {
	default int getAge() {
		return -1;
	}
	
	public String getNom();
}
