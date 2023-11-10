module com.example.asercion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.asercion to javafx.fxml;
    exports com.example.asercion;
}