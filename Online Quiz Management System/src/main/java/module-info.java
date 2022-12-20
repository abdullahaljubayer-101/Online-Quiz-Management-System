module com.example.onlinequizmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.onlinequizmanagementsystem to javafx.fxml;
    exports com.example.onlinequizmanagementsystem;
}