package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController
{
    @FXML Label resultNameLabel;
    @FXML Label foodResultLabel;
    @FXML Label socialMediaResultLabel;
    @FXML Button secondaryButton; 
    // once done click go back button to return to the main page
    @FXML
    public void goBack() throws IOException
    {
        App.setRoot("primary");
    }
  

    // create result name method
    public void updateNameResult(String message)
    {
        resultNameLabel.setText("Thank you for answering all the question, " + message + ".");
    }


    // create result favorite food method
    public void updateFoodResult(String message2)
    {
        foodResultLabel.setText("It is true that " + message2 + " is a delicious food item.");
    }

    // create result social media method
    public void updateSocialMedia(String message3)
    {
        socialMediaResultLabel.setText("Well, guess you bettter get back on " + message3 + " now.");
    }
   
}
