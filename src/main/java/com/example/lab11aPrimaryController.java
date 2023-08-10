package com.example;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class lab11aPrimaryController
{
    @FXML Button rockButton; 
    @FXML Button paperButtton; 
    @FXML Button scissorsButton;
    @FXML Label playersChoice;
    @FXML Label computerChoice;
    @FXML Label result;

    
    private String humanPicked; 
    private String computerPicked; 
    private int numRandom;
    
 
    

    @FXML
    public void updateRockResult()
    {
        humanPicked = "rock.";
        playersChoice.setText("You selected " + humanPicked); 
        computerPicks();
    }

    @FXML
    public void updatePaperResult()
    {
        humanPicked = "paper.";
        playersChoice.setText("You selected " + humanPicked);
        computerPicks();
    }

    @FXML 
    public void updateScissorsResult()
    {
        humanPicked = "scissors.";
        playersChoice.setText("You selected " + humanPicked);
        computerPicks();

    }

    public void computerPicks()
    {
        numRandom = (int)(Math.random() * (3 + 1 -1 ) + 1);
        if(numRandom == 1)
        {
            computerPicked = "rock.";
        }
        else if(numRandom == 2)
        {
            computerPicked = "paper.";
        }
        else 
        {
            computerPicked = "scissors.";
        }
        computerChoice.setText("Computer selected " + computerPicked);
        checkWinner();
    }

    public void checkWinner()
    {
        if((computerPicked == "rock." && humanPicked == "paper.") || (computerPicked == "paper." && humanPicked == "scissors.") || (computerPicked == "scissors." && humanPicked == "rock."))
        {
            result.setText("You won!");
        }
        else if((humanPicked == "rock." && computerPicked == "paper.") || (humanPicked == "paper." && computerPicked == "rock.") || (humanPicked == "scissors." && computerPicked == "rock.") || (humanPicked == "paper." && computerPicked == "scissors."))
        {
            result.setText("You Lost!");
        }
        else
        {
            result.setText("You tied!");
        }
    }
}


