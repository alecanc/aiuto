package com.example.gestioneprofilo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.sql.SQLException;

public class SchermataPrincipale {
ControlGestioneProfilo controlGestioneProfilo= new ControlGestioneProfilo();
    @FXML
    private Button VisualizzaProfiloButton;

    @FXML
    private StackPane container;



@FXML
    public void clickVis(ActionEvent event) throws IOException, SQLException {
      controlGestioneProfilo.visualizzaProfilo(event);



    }
}

