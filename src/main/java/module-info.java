module com.jsthijs.beroepsproduct02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jsthijs.beroepsproduct02 to javafx.fxml;
    exports com.jsthijs.beroepsproduct02;
}