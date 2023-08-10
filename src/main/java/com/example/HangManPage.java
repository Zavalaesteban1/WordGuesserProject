package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HangManPage
{
   
    @FXML Button hintButton;
    @FXML Button menuButton;
    


    

    @FXML
    public void backToMenu() throws IOException
    {
        App.setRoot("wordGuesserMainPage");
    }

    @FXML
    public void seeHint() throws IOException
    {

    }



}
