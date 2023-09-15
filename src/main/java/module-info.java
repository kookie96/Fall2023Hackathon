module com.example.fall2023hackathon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fall2023hackathon to javafx.fxml;
    exports com.example.fall2023hackathon;
}