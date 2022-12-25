package com.example.gestioneprofilo;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {




    @Override
    public void start(Stage stage) throws IOException {

        //FXMLLoader loader = new FXMLLoader();
       // FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VisualizzaProfilo.fxml"));
       Parent root = FXMLLoader.load(getClass().getResource("VisualizzaProfilo.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();}
}
