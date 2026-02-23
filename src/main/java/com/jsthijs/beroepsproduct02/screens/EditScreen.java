package com.jsthijs.beroepsproduct02.screens;

import com.jsthijs.beroepsproduct02.models.Item;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static com.jsthijs.beroepsproduct02.Application.*;

public class EditScreen extends NewScreen implements Screen {
    private Item item;

    public EditScreen(Item item) {
        super();
        this.item = item;
    }

    public String getTitle() {
        return "Edit item Screen Screen";
    }

}
