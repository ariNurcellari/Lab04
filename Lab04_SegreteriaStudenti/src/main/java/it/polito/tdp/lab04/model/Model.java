package it.polito.tdp.lab04.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;

public class Model {
	
	List <String> corsi ;
	CorsoDAO corsoDAO ;
	
	public Model() {
		corsi = new LinkedList<String>() ;
		corsoDAO= new CorsoDAO() ;
	}
	
	public List<String> NomiCorsi(){
		List<String> cTemp = new LinkedList<String>() ;
		for(Corso corso : corsoDAO.getTuttiICorsi())
			cTemp.add(corso.getNome()) ;
		return cTemp ;
	}
	public List<String> studenti(){
		List<String> cTemp = new LinkedList<String>() ;
		for(Corso corso : corsoDAO.getTuttiICorsi())
			cTemp.add(corso.getNome()) ;
		return cTemp ;
	}
	
	public List<Studente> studentiCorso(Corso corso){
		return corsoDAO.getStudentiIscrittiAlCorso(corso);	
	}
}
