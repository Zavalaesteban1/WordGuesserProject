package com.example;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.image.ImageView;

public class wordGuesserController
{
    // decalare FXML variables that will be used
    @FXML Button hangManPlayButton;
    @FXML Button howToPlayButton;
    @FXML Button seeHowToPlay;
    @FXML Button crossWordPlayButton;
    @FXML ImageView leaderBoardPic; 
    @FXML ImageView hangManPic;
    @FXML ImageView hangMan2pic;
    @FXML ImageView crossWordPic; 


    // hangman button
    @FXML 
    public void playHangMan() throws IOException
    {
        App.setRoot("hangManPage");
    }


    // crossword button
    @FXML
    public void playCrossWord() throws IOException
    {
        App.setRoot("CcossWordPage");
    }

    // how t0 play button
    @FXML
    public void seeHowToPlay() throws IOException
    {
        App.setRoot("Howto");
    }

    // see leader board
    @FXML
    public void seeLeaderBoard() throws IOException
    {
        App.setRoot("Leaderboard");
    }

}
