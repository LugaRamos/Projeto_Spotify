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
    private MediaPlayer mediaPlayer;
    
    
    @Override
    public void start(Stage stage) {
    // Create a button to play the music.
    Button playButton = new Button("Play");
    playButton.setOnAction(event -> {
        // Create a media player and load the music file.
        mediaPlayer = new MediaPlayer(new Media(getClass().getResource("Teste.mp3").toExternalForm()));

        // Play the music.
        mediaPlayer.play();
    });

    // Create a stack pane to hold the button.
    StackPane layout = new StackPane();
    layout.getChildren().add(playButton);

    // Create a scene and add it to the stage.
    Scene scene = new Scene(layout, 300, 250);
    stage.setScene(scene);
    stage.show();
  }
}