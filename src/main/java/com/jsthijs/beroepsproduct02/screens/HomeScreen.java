package com.jsthijs.beroepsproduct02.screens;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import static com.jsthijs.beroepsproduct02.Application.window_size;

public class HomeScreen implements Screen{
    private int margin = 40;
    private Scene scene;


    public HomeScreen() {
        Pane root = new Pane();
        this.scene = new Scene(root, window_size[0], window_size[1]);

        root.setStyle("-fx-background-color: black;");

    }

    public Scene getScene() {
        return this.scene;
    }

    public String getTitle() {
        return "Home Screen";
    }

}
