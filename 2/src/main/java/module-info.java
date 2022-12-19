module a.a {
    requires javafx.controls;
    requires javafx.fxml;


    opens a.a to javafx.fxml;
    exports a.a;
}