module com.th3alexdev.petcarejava {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.th3alexdev.petcarejava;
    opens com.th3alexdev.petcarejava to javafx.fxml;

    exports com.th3alexdev.petcarejava.controllers;
    opens com.th3alexdev.petcarejava.controllers to javafx.fxml;
}