package com.jsthijs.beroepsproduct02.screens;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

import static com.jsthijs.beroepsproduct02.Application.*;

public class HomeScreen implements Screen{
    private Scene scene;

    public HomeScreen() {
        FlowPane root = new FlowPane();
        this.scene = new Scene(root, window_size[0], window_size[1]);


        root.setStyle("-fx-background-color: black;");
        root.getChildren().add(header);

    }

    public Scene getScene() {
        return this.scene;
    }

    public String getTitle() {
        return "Home Screen";
    }

}
