package com.jsthijs.beroepsproduct02.screens;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.jsthijs.beroepsproduct02.Application.*;

public class NewScreen implements Screen {
    private final Scene scene;

    public NewScreen() {
        FlowPane root = new FlowPane();
        this.scene = new Scene(root, window_size[0], window_size[1]);
        root.setAlignment(Pos.TOP_CENTER);

        FlowPane itemPane =  new FlowPane();
        itemPane.setOrientation(Orientation.HORIZONTAL);

        TextField imagePath = new TextField();
        imagePath.setPromptText("Link naar foto / poster");
        imagePath.setPadding(new Insets(100, 200, 100, 200));

        TextField title = new TextField();
        title.setPromptText("Titel");

        ChoiceBox genre = new ChoiceBox();
        genre.setPrefSize(156, 40);
        genre.setValue("Genre");
        try {
            ResultSet rs = db.executeQuery("SELECT name FROM tags;");
            while(rs.next()) { genre.getItems().add(rs.getString("name")); }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        TextField releaseYear = new TextField();
        releaseYear.setPromptText("Jaar");

        ChoiceBox type = new ChoiceBox();
        type.getItems().addAll("boek", "film");

        TextArea summary = new TextArea();
        summary.setPromptText("Samenvatting");

        FlowPane userFullName = new FlowPane(new Text(user.getName()));


        itemPane.getChildren().addAll(imagePath, title, genre, releaseYear, type, summary, userFullName);
        root.getChildren().addAll(header);

    }

    public Scene getScene() {
        return this.scene;
    }

    public String getTitle() {
        return "New Item Screen";
    }

}
