package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LeaderBoardController 
{
    @FXML Button menuButton;




    public void backToMenu() throws IOException
    {
        App.setRoot("wordGuesserMainPage");
    }
}
