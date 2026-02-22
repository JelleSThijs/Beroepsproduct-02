package com.jsthijs.beroepsproduct02;

import com.jsthijs.beroepsproduct02.screens.HomeScreen;
import com.jsthijs.beroepsproduct02.screens.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    private static Stage primaryStage;
    public static int[] window_size = {1400, 800};

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        NavigateTo(new HomeScreen());
        stage.show();
    }

    public static void NavigateTo(Screen screenClass){
        primaryStage.setScene(screenClass.getScene());
        primaryStage.setTitle(screenClass.getTitle());
    }
}
