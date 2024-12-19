module com.v.sgpicalculate {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.v.sgpicalculate to javafx.fxml;
    exports com.v.sgpicalculate;
}