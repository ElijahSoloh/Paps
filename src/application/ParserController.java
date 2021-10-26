package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ParserController implements Initializable {
	
	@FXML
	private Button fermerBouton, recherche;
	
	
	@FXML
	private ComboBox<String> combobox,combobox1,combobox2,combobox3,combobox4,combobox5,combobox6,combobox7,combobox8,combobox9,combobox10,combobox11 ;
	
	@FXML
	private Label texto;
	
	@FXML
	private TextArea texte;
	
	
	
	
	
	String typesList[] = {
			"cle primaire",
			 "cle etrangere",
			 "nom",
			 "prenom",
			 "tel",
			 "rue",
			 "ville",
			 "cp",
			 "date",
			 "mail",
			 "pays",
			 "profession" };
	
	ObservableList<String> list = FXCollections.observableArrayList(typesList);
	
	
	 List<String> tables = new ArrayList();
	 List<String> attribus = new ArrayList();
	 List<Integer> nbreAtt = new ArrayList();
	 List<Integer> typeD = new ArrayList(); 
	 List<Integer> dateMin = new ArrayList();
	 List<Integer> dateMax = new ArrayList();
	 int nbreA = 0;
	 int nbreInsert = 0;
	
	 private void displayText() throws FileNotFoundException {
		 try {
			 Scanner s = new Scanner (new File ("insert.txt")).useDelimiter("\\s+");
		        while (s.hasNext()) {
		            if (s.hasNextInt()) { // check if next token is an int
		                System.out.print(s.nextInt()+" "); // display the found integer
		                texte.appendText(s.nextInt()+" ");
		            }       
		            else {
		                System.out.print(s.next()+" "); // else read the next token
		                texte.appendText(s.next()+" ");
		            }
		        } //end while
		 } catch (FileNotFoundException ex) {
		        System.err.println(ex);
		    }
		    } 
	 
	 
	 
	 
	public void fermerBoutonOnAction(ActionEvent event) {
		
		Stage stage = (Stage) fermerBouton.getScene().getWindow();
		stage.close();

	
	
	
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		combobox.setItems(list);
		combobox1.setItems(list);
		combobox2.setItems(list);
		combobox3.setItems(list);
		combobox4.setItems(list);
		combobox5.setItems(list);
		combobox6.setItems(list);
		combobox7.setItems(list);
		combobox8.setItems(list);
		combobox9.setItems(list);
		combobox10.setItems(list);
		combobox11.setItems(list);
		
	}}
