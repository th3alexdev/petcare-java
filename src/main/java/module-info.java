module com.th3alexdev.petcarejava {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;


    exports com.th3alexdev.petcarejava;
    opens com.th3alexdev.petcarejava to javafx.fxml;

    opens com.th3alexdev.petcarejava.models;

    exports com.th3alexdev.petcarejava.controllers;
    opens com.th3alexdev.petcarejava.controllers to javafx.fxml;
}