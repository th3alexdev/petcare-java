package com.th3alexdev.petcarejava;

import com.th3alexdev.petcarejava.models.Pet;
import com.th3alexdev.petcarejava.utils.PersistenceManager;
import jakarta.persistence.EntityManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class  PrincipalApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApp.class.getResource("form.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 680, 595);
        stage.setTitle("Pet Care 🐩");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //launch();

        EntityManager em = PersistenceManager.getEntityManager();
        List<Pet> pets = em.createQuery("SELECT p FROM Pet p WHERE p.name='Andy'", Pet.class).getResultList();
        for (Pet pet: pets) {
            System.out.println(pet);
        }
        em.close();
    }
}