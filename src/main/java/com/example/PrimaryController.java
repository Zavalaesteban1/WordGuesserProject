package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController
{
    // decalare FXML variables that will be used
    @FXML TextField nameTextField;
    @FXML TextField foodTextField;
    @FXML TextField socialMediaTextField;
    @FXML Button primaryButton;

   @FXML
    public void Submit() throws IOException
    {
        // once button is clicked go to secondary page
        App.setRoot("secondary");
        // load up the information that the user will put in into the secondary.fmxl file 
        FXMLLoader loader = new FXMLLoader(App.class.getResource("secondary.fxml"));

        Parent root = loader.load();

        SecondaryController newController = loader.getController();
        // pass user info into the corresponding methods 
        newController.updateNameResult(nameTextField.getText());
        newController.updateFoodResult(foodTextField.getText());
        newController.updateSocialMedia(socialMediaTextField.getText());
        
        App.scene.setRoot(root); 

    }  
}
