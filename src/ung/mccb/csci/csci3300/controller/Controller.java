package ung.mccb.csci.csci3300.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import ung.mccb.csci.csci3300.model.Subscriber;

public class Controller {
    @FXML
    TextField txtFirstname, txtLastname,txtEmail, txtCampus;
    public void submitRecord(ActionEvent actionEvent) {


            Subscriber model= new Subscriber();
            model.setFirstname(txtFirstname.getText());
            model.setLastname(txtLastname.getText());
            model.setEmail(txtEmail.getText());
            model.setCampus(txtCampus.getText());


            int result = model.saveRecord();
        }

    }

