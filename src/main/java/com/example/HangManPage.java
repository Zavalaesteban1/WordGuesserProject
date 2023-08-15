package com.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class HangManPage
{

    @FXML
    ImageView img;
    Image image2 = new Image(getClass().getResourceAsStream("Images/2.png"));
    Image image3 = new Image(getClass().getResourceAsStream("Images/3.png"));
    Image image4 = new Image(getClass().getResourceAsStream("Images/4.png"));
    Image image5 = new Image(getClass().getResourceAsStream("Images/5.png"));
    Image image6 = new Image(getClass().getResourceAsStream("Images/6.png"));
    Image image7 = new Image(getClass().getResourceAsStream("Images/7.png"));
    

    @FXML Label hint_label;
    @FXML Button menuButton;
    @FXML Button checkButton;
    @FXML TextField userInput; 
    @FXML Button anotherWordButton;
    @FXML Label loseLabel;
    @FXML Label loseLabel2;
    @FXML Label loseLabel3;
    @FXML Label test;
    // labels
    @FXML Label L1;
    @FXML Label L2;
    @FXML Label L3;
    @FXML Label L4;
    @FXML Label L5;
    @FXML Label L6;
    @FXML Label L7;
    @FXML Label L8;
    @FXML Label L9;  
     

    
    

    String hangmanWord = "";
    String hintWord = "";
    int wrongGuesses = 0;
   
    public String getWord() throws FileNotFoundException
    {
        L1.setText(" "); 
        L2.setText(" "); 
        L3.setText(" "); 
        L4.setText(" "); 
        L5.setText(" "); 
        L6.setText(" "); 
        L7.setText(" "); 
        L8.setText(" "); 
        L9.setText(" "); 
        int databaseRow =  0;
        databaseRow = (int) (Math.random() * (350 + 1 - 1) + 1);
    
        File f1 = new File("src/main/java/com/example/WordListProject copy.txt");
        Scanner s1 = new Scanner(f1);
        String temp = "";
        for (int i = 1; i <= 350; i++)
        {
            temp = s1.nextLine();
            if (i == databaseRow)
            {
                hangmanWord = temp;
                break;
            }   
        }
        File f2 = new File("src/main/java/com/example/WordListDef copy.txt");
        Scanner s2 = new Scanner(f2);
        temp = "";
        for (int i = 1; i <= 350; i++)
        {
            temp = s2.nextLine();
            if(i == databaseRow)
            {
                hintWord = temp;
                hint_label.setText(hintWord);
                break;
            }
        }
        s1.close();
        s2.close();
        return hangmanWord;
    }

    
    public void initialize() throws IOException
    {
        hangmanWord = getWord();
    }


    @FXML
    public void buttonCheck() throws IOException
    {   
        char letter = ' ';
        char[] wordToGuess = new char[9];
        char[] wordGuessing = new char[9];
        for (int i = 0; i < 9; i++)
        {
            wordToGuess[i] = ' ';
            
        }
        for (int i = 0; i < 9;i++)
        {
            wordGuessing[i] = ' ';
            
        }
    
        boolean letterInWord = false;
        int correctCounter = 0;
        String input;
        for (int i = 0; i < 9; i++)
        {
            wordToGuess[i] = hangmanWord.charAt(i);
            
        }
        while (wrongGuesses < 6)
        {
            
            if(correctCounter == 9)
            {
                break;
            }
            correctCounter = 0;
            input = userInput.getText().toLowerCase();
            userInput.setText("");
            letter = input.charAt(0);
            
            for (int j = 0; j < 9; j++)
            {
                if (letter == wordToGuess[j])
                {
                    wordGuessing[j] = letter;  
                    if (wordGuessing[j] == letter && j == 0)
                    {
                        correctCounter++;
                        L1.setText(Character.toString(letter));
                    }
                    else if (wordGuessing[j] == letter && j == 1)
                    {
                        correctCounter++;
                        L2.setText(Character.toString(letter));
                    }
                   else if (wordGuessing[j] == letter && j == 2)
                    {
                        correctCounter++;
                        L3.setText(Character.toString(letter));
                    }
                   else if (wordGuessing[j] == letter && j == 3)
                    {
                        correctCounter++;
                        L4.setText(Character.toString(letter));
                    }
                   else if (wordGuessing[j] == letter && j == 4)
                    {
                        correctCounter++;
                        L5.setText(Character.toString(letter));
                    }
                    else if (wordGuessing[j] == letter && j == 5)
                    {
                        correctCounter++;
                        L6.setText(Character.toString(letter));
                    }
                   else if (wordGuessing[j] == letter && j == 6)
                    {
                        correctCounter++;
                        L7.setText(Character.toString(letter));
                    }
                   else if (wordGuessing[j] == letter && j == 7)
                    {
                        correctCounter++;
                        L8.setText(Character.toString(letter));
                    }
                   else if (wordGuessing[j] == letter && j == 8)
                    {
                        correctCounter++;
                        L9.setText(Character.toString(letter));
                    }
                   
                    letterInWord = true;   
                }
    
            }
           
            if(L1.getText() != " " && L2.getText() != " " && L3.getText() != " " && L4.getText() != " " && L5.getText() != " " && L6.getText() != " " && L7.getText() != " " && L8.getText() != " " && L9.getText() != " ")
                {
                    break;
                }
            if (letterInWord == false)
            {
                wrongGuesses++;
                setImage(wrongGuesses);
            }
            letterInWord = false;
            
        }
        if(L1.getText() != " " && L2.getText() != " " && L3.getText() != " " && L4.getText() != " " && L5.getText() != " " && L6.getText() != " " && L7.getText() != " " && L8.getText() != " " && L9.getText() != " ")
        {
            loseLabel.setText("You won!");
            anotherWordButton.setText("Try Again");
            loseLabel3.setText("Exit Game"); 
        }

        if (wrongGuesses == 6)
        {
            loseLabel.setText("You Lost!");
            anotherWordButton.setText("Try Again");
            loseLabel3.setText("Exit Game"); 
        }
    }

        public void setImage(int wrong) 
        {
            if (wrongGuesses  == 1)
            {
                img.setImage(image2); // Display head
            }
            else if (wrongGuesses == 2)
            {
                img.setImage(image3); // Display body
            }
            else if (wrongGuesses == 3)
            {
                img.setImage(image4); // Display one arm
            }
            else if (wrongGuesses == 4)
            {
                img.setImage(image5); // Display the other arm
            }
            else if (wrongGuesses == 5)
            {
                img.setImage(image6); // Display one leg
            }
            else if (wrongGuesses == 6)
            {
                img.setImage(image7); // Display the other leg
            }
        }
            
    @FXML
    public void backToMenu() throws IOException
    {
        App.setRoot("wordGuesserMainPage");
    }


    @FXML
    public void newWorld() throws IOException
    {
        
        // once button is clicked it restarts the page
        App.setRoot("hangManPage");
        // load up the information that the user will get from here
        FXMLLoader loader = new FXMLLoader(App.class.getResource("hangManPage.fxml"));

        Parent root = loader.load();
        
        App.scene.setRoot(root); 
        

    }  
}
