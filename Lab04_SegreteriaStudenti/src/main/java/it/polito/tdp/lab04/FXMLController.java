/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.lab04;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.lab04.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> selezionaCorso;

    @FXML
    private Button cercaIscrittiCorso;

    @FXML
    private TextField matricola;

    @FXML
    private TextField nomeStudente;

    @FXML
    private TextField cognomeStudente;

    @FXML
    private Button cercaCorsi;

    @FXML
    private Button iscriviti;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button reset;

    @FXML
    void doCercaCorsi(ActionEvent event) {

    }

    @FXML
    void doCercaIscrittiCorso(ActionEvent event) {
    	String nomeCorso = selezionaCorso.getValue() ;
    //	model.studentiCorso()
    }

    @FXML
    void doIscriviti(ActionEvent event) {

    }

    @FXML
    void doReset(ActionEvent event) {

    }
    
    public void setModel(Model model) {
		this.model = model;
		selezionaCorso.getItems().add("nessuna selezione") ;
		selezionaCorso.getItems().addAll(model.NomiCorsi()) ;
	}

    @FXML
    void initialize() {
        assert selezionaCorso != null : "fx:id=\"selezionaCorso\" was not injected: check your FXML file 'Scene.fxml'.";
        assert cercaIscrittiCorso != null : "fx:id=\"cercaIscrittiCorso\" was not injected: check your FXML file 'Scene.fxml'.";
        assert matricola != null : "fx:id=\"matricola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert nomeStudente != null : "fx:id=\"nomeStudente\" was not injected: check your FXML file 'Scene.fxml'.";
        assert cognomeStudente != null : "fx:id=\"cognomeStudente\" was not injected: check your FXML file 'Scene.fxml'.";
        assert cercaCorsi != null : "fx:id=\"cercaCorsi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert iscriviti != null : "fx:id=\"iscriviti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert reset != null : "fx:id=\"reset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}