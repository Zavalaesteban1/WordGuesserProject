package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CrossWordController 
{
    @FXML Button menuButton;


    @FXML
    public void backToMenu() throws IOException
    {
        App.setRoot("wordGuesserMainPage");
    }


}
