package it.polito.tdp.lab04.model;

public class Studente {
	String matricola ;
	String nome ;
	String cognome;
	String cds;
	
	public Studente(String matricola, String nome, String cognome, String cds) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.cds = cds;
	}
	public String getMatricola() {
		return matricola;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getCds() {
		return cds;
	}
}
