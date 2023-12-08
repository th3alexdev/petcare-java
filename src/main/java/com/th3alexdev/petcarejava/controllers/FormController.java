package com.th3alexdev.petcarejava.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class FormController {
    @FXML
    private TextField petname;
    @FXML
    private TextField petbreed;
    @FXML
    private TextField petcolor;
    @FXML
    private CheckBox isAllergic;
    @FXML
    private CheckBox specialAttention;
    @FXML
    private TextField ownername;
    @FXML
    private TextField ownerphone;
    @FXML
    private TextArea ownercomments;


    private List<TextField> inputList;

    public void initialize() {
        inputList = new ArrayList<>();
        inputList.add(petname);
        inputList.add(petbreed);
        inputList.add(petcolor);
        inputList.add(ownername);
        inputList.add(ownerphone);
    }

    public void onSubmit() {
        System.out.println("submitted!");
    }

    public void clearForm() {
        for (TextField textfield: inputList) {
            textfield.clear();
        }
        ownercomments.clear();
        isAllergic.setSelected(false);
        specialAttention.setSelected(false);
    }
}
