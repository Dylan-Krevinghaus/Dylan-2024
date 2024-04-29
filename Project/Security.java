import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Security {
    String password;
    String newPassword = "";
    String currentLine;
    String file = "ReadingThings";
    String letter;
    char betterLetter;
    Random rand = new Random();
    ArrayList<String> passwordHolder = new ArrayList<String>();
    int whileFIX;
    int ascii;
    int i;
    int a = 0;


    public boolean firstTime() throws IOException
    {
        //check if it is the first time the user entered
        try(BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
                currentLine = reader.readLine();
                if(currentLine == null)
                {
                    return true;
                }
        }
        catch(IOException ex)
        {
            ex.getMessage();
        }
        return false;
    }


    public String generatePassword()
    {
        int numToLet;
        char letterGEN;
        String lettergen;
        String pass = "";
        int passlength = rand.nextInt(5) + 5;
        for(i = 0; i < passlength; i++)
        {
            numToLet = rand.nextInt(26) + 65;
            letterGEN = (char)numToLet;
            lettergen = Character.toString(letterGEN);
            if(rand.nextInt(2) == 1)
            {
                lettergen = lettergen.toLowerCase();
            }
            pass = pass + lettergen;
        }
        return pass;
    }


    public boolean checkPassword(String password) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        currentLine = reader.readLine();
        newPassword = "";
        for(int i = 0; i < password.length(); i++)
        {
            betterLetter = password.charAt(i);
            ascii = (int) betterLetter + 10;
            betterLetter = (char) ascii;
            letter = String.valueOf(betterLetter);
            newPassword += letter;
        }
            if(newPassword.equals(currentLine))
            {
                return true;
            }
        return false;
    }


    public void store(String password) throws IOException
    {
        //Store the password for login later
        newPassword = "";
        for(int i = 0; i < password.length(); i++)
        {
            betterLetter = password.charAt(i);
            ascii = (int) betterLetter + 10;
            betterLetter = (char) ascii;
            letter = String.valueOf(betterLetter);
            newPassword += letter;
        }
        i = 0;
        while(passwordHolder.size() != 0)
        {
            if(passwordHolder.get(i) == null)
            {
                passwordHolder.add(newPassword);
            }
            i++;
        }
        if(passwordHolder.size() == 0)
        {
            passwordHolder.add(newPassword);
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            writer.write(newPassword);
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}