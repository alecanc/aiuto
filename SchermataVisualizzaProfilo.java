package com.example.gestioneprofilo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SchermataVisualizzaProfilo {



    @FXML
    private AnchorPane sfondo;
    @FXML
    private Label nomeLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label dataNascitaLabel;
    @FXML
    private Label cfLabel;
  @FXML
    private Stage stage;
  @FXML
    private Scene scene;
  @FXML
    private Parent root;



    public void show(ActionEvent event, String n/*ControlGestioneProfilo.Profilo profilo*/) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Profilo.fxml"));

// Imposta il valore del label nome
   //nomeLabel.setText(n);
System.out.println(n);
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);

            stage.setScene(scene);
            stage.show();


          /*  String giornoNascita = profilo.getGiornoNascita();
            dataNascitaLabel.setText(giornoNascita);


            String email = profilo.getEmail();
            emailLabel.setText(email);

            String cf = profilo.getCodiceFiscale();
            cfLabel.setText(cf);
*/
        }



    }
