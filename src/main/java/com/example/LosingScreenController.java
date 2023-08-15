package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LosingScreenController
{
    @FXML Button menuButton;
    @FXML Button playHangMan;

@FXML 
public void backToMenu() throws IOException
{
    App.setRoot("wordGuesserMainPage");
}


@FXML 
public void backToHangManPage() throws IOException
{
    App.setRoot("hangManPage");
}




}



