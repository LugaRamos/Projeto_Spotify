package com.spotify;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {
    private VBox root;
    private HBox hbox;
    private Label lbEnunciado, lbMusica;
    private Button btPlay;    
    
    @Override
    public void start(Stage stage){
        root = new VBox();
        hbox = new HBox();
        lbEnunciado = new Label("Spotify 2.0");
        lbMusica = new Label("Nome da Música");
        btPlay = new Button("Play");

        root.getChildren().addAll(lbEnunciado, hbox);
        hbox.getChildren().addAll(lbMusica, btPlay);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        
        stage.setScene(new Scene(root, 480, 600));
        stage.show();
    }
}