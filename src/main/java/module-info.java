module com.example.ebannoegovno {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.example.ebannoegovno to javafx.fxml;
    exports com.example.ebannoegovno;
}