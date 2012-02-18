package quizzionare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main
{
    public String[] answerChoice = new String[5];

    public static void main(String[] args)
    {
        new Main().getGoing();
    }

    private void getGoing()
    {
        File pokeFile = new File("/Users/t-mas/NetBeansProjects/Quizzionare/src/quizzionare/questions.txt");
        FileReader pokeReader = null;
        try
        {
            pokeReader = new FileReader(pokeFile);
            BufferedReader pokeBuffer = new BufferedReader(pokeReader);
            String stringshot = "";

            while ((stringshot = pokeBuffer.readLine()) != null)
            {
                if (stringshot.contains("?"))
                {
                    String question = stringshot;
                    String input = (String) JOptionPane.showInputDialog(null, stringshot, "The Pokemon Quizzionaire Score = " + 9000, JOptionPane.QUESTION_MESSAGE, null, answerChoice, answerChoice[0]);
                }
            }
        } catch (IOException ex)
        {
            System.out.println("file hickup");
        }
    }
}
