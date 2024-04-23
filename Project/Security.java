import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Security {
    String password;
    String currentLine;
    String file = "ReadingThings";
    Random rand = new Random();
    ArrayList<String> passwordHolder = new ArrayList<String>();
    int whileFIX;
    int i;
    int a = 0;


    public boolean firstTime()
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
        catch(Exception ex)
        {
            ex.getMessage();
        }
        return true;
    }


    public String generatePassword()
    {
        //Make 5 lower case and 5 upper case
        //Make it start and end with a single digit number
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


    public boolean checkPassword(String password)
    {
        for(i = 0; i < passwordHolder.size(); i++)
        {
            if(password.equals(passwordHolder.get(i)))
            {
                return true;
            }
        }
        return false;
    }


    public void store(String password)
    {
        //Store the password for login later
        i = 0;
        while(passwordHolder.size() != 0)
        {
            if(passwordHolder.get(i) == null)
            {
                passwordHolder.add(password);
            }
            i++;
        }
        if(passwordHolder.size() == 0)
        {
            passwordHolder.add(password);
        }
    }
}