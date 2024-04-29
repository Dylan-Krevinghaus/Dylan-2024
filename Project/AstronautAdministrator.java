import java.util.*;
import java.util.Scanner;
public class AstronautAdministrator
{
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> skills = new ArrayList<String>();
    ArrayList<String> address = new ArrayList<String>();
    ArrayList<String> passwordArray = new ArrayList<String>();
    String newName, newSkills, newAddress, password, inputForChange, verifyString, removeName, removeSkills, removeAddress;
    ArrayList<Integer> id = new ArrayList<Integer>();
    ArrayList<Integer> amountOfFamily = new ArrayList<Integer>();
    int inputForInt, idInput, addingSwitch = 0, removingSwitch = 0, changeSwitch = 0, removeID, removeAmountOfFam, whileFIX = 0, newID, newAmountOfFam, i, adminFIX;
    Scanner kbd = new Scanner(System.in);
//Choosing add, remove, or change.
//Along with what they want to change.
    public AstronautAdministrator(String astroName, String astroSkills, String astroAddress, String astroPassword, int astroID, int astroAmountOfFamily)
    {
        name.add(astroName);
        skills.add(astroSkills);
        address.add(astroAddress);
        passwordArray.add(astroPassword);
        id.add(astroID);
        amountOfFamily.add(astroAmountOfFamily);
    }
    public AstronautAdministrator()
    {
    }
//operation for everything
    public void switchAstronautInfo()
    {
        whileFIX = 0;
        while(whileFIX == 0)
        {
            whileFIX = 0;
            while(whileFIX == 0)
            {
                System.out.println("Please enter the number that correlates with the action. \n1. add \n2. remove \n3. change \n4. exit");
                verifyString = kbd.nextLine();
                if(possibleINTEGER(verifyString))
                {
                    changeSwitch = Integer.parseInt(verifyString);
                    if(changeSwitch > 0 && changeSwitch < 5)
                    {
                        whileFIX = 1;
                    }
                    else
                    {
                        System.out.println("Not a valid input.");
                    }
                }
                else
                {
                    System.out.println("Not a valid input.");
                }
            }
            if(changeSwitch >= 1 && changeSwitch <= 3)
            {
                switch (changeSwitch)
                {
////Add////
                    case 1:
                    whileFIX = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println("Please enter the number that correlates with the thing you would like to add: \n1. Name \n2. ID \n3. Skills \n4. Address \n5. Family numbers \n6. Exit");
                            verifyString = kbd.nextLine();
                            if(possibleINTEGER(verifyString))
                            {
                                changeSwitch = Integer.parseInt(verifyString);
                                if(changeSwitch > 0 && changeSwitch < 7)
                                {
                                    addingSwitch = changeSwitch;
                                    whileFIX = 1;
                                }
                                else
                                {
                                    System.out.println("Not a valid input.");
                                }
                            }
                            else
                            {
                                System.out.println("Not a valid input.");
                            }
                        }
                        whileFIX = 0;
                        switch (addingSwitch)
                        {
//Add Name
                            case 1:
                                System.out.println("Type the name that you want to add: ");
                                newName = kbd.nextLine();
                                name.add(newName);
                                break;
//Add ID
                            case 2:
                                System.out.println("Type the ID that you want to add: ");
                                newID = kbd.nextInt();
                                kbd.nextLine();
                                id.add(newID);
                                break;
//Add Skills
                            case 3:
                                System.out.println("Type the skills that you want to add: ");
                                newSkills = kbd.nextLine();
                                skills.add(newSkills);
                                break;
//Add Address
                            case 4:
                                System.out.println("Type the address that you want to add: ");
                                newAddress = kbd.nextLine();
                                address.add(newAddress);
                                break;
//Add Family numbers
                            case 5:
                                System.out.println("Type the amount of family that you want to add: ");
                                newAmountOfFam = kbd.nextInt();
                                amountOfFamily.add(newAmountOfFam);
                                break;
                            case 6:
                                break;
                        }
                        whileFIX = 0;
                        break;
////Remove////
                    case 2:
                        whileFIX = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println("Please enter the number that correlates with the thing you would like to remove: \n1. Name \n2. ID \n3. Skills \n4. Address \n5. Family numbers \n6. Exit");
                            verifyString= kbd.nextLine();                            
                            if(possibleINTEGER(verifyString))
                            {
                                changeSwitch = Integer.parseInt(verifyString);
                                if(changeSwitch > 0 && changeSwitch < 7)
                                {
                                    removingSwitch = changeSwitch;
                                    whileFIX = 1;
                                }
                                else
                                {
                                    System.out.println("Not a valid input.");
                                }
                            }
                            else
                            {
                                System.out.println("Not a valid input.");
                            }
                        }
                        whileFIX = 0;
                        switch (removingSwitch)
                        {
//Remove Name
                            case 1:
                                System.out.println(name);
                                System.out.println("Please type in the exact name you would like to remove");
                                removeName = kbd.nextLine();
                                for(i = 0; i < name.size(); i++)
                                {
                                    newName = name.get(i);
                                    if(newName == removeName)
                                    {
                                        name.remove(i);
                                    }
                                }
                                break;
//Remove ID
                            case 2:
                                System.out.println(id);
                                System.out.println("Please type in the exact ID you would like to remove");
                                removeID = kbd.nextInt();
                                kbd.nextLine();
                                for(i = 0; i < id.size(); i++)
                                {
                                    newID = id.get(i);
                                    if(newID == removeID)
                                    {
                                        id.remove(i);
                                    }
                                }
                                break;
//Remove Skills
                            case 3:
                                System.out.println(skills);
                                System.out.println("Please type in the exact skills you would like to remove");
                                removeSkills = kbd.nextLine();
                                for(i = 0; i < skills.size(); i++)
                                {
                                    newSkills = skills.get(i);
                                    if(newSkills == removeSkills)
                                    {
                                        skills.remove(i);
                                    }
                                }
                                break;
//Remove Address
                            case 4:
                                System.out.println(address);
                                System.out.println("Please type in the exact address you would like to remove");
                                removeAddress = kbd.nextLine();
                                for(i = 0; i < address.size(); i++)
                                {
                                    newAddress = address.get(i);
                                    if(newAddress == removeAddress)
                                    {
                                        address.remove(i);
                                    }
                                }
                                break;
//Remove Family Numbers
                            case 5:
                                System.out.println(amountOfFamily);
                                System.out.println("Please type in the exact family number you would like to remove");
                                removeAmountOfFam = kbd.nextInt();
                                kbd.nextLine();
                                for(i = 0; i < amountOfFamily.size(); i++)
                                {
                                    newAmountOfFam = amountOfFamily.get(i);
                                    if(newAmountOfFam == removeAmountOfFam)
                                    {
                                        amountOfFamily.remove(i);
                                    }
                                }
                                break;
                            case 6:
                            break;
                        }
                        whileFIX = 0;
                        break;
////Change////
                    case 3:
                    whileFIX = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println("Please enter the number that correlates with the thing that you would like to change: \n1. Name \n2. ID \n3. Skills \n4. Address \n5. Password \n6. Exit");
                            verifyString = kbd.nextLine();
                            if(possibleINTEGER(verifyString))
                            {
                                changeSwitch = Integer.parseInt(verifyString);
                                if(changeSwitch > 0 && changeSwitch < 7)
                                {
                                    //changeSwitch = changeSwitch
                                    whileFIX = 1;
                                }
                                else
                                {
                                    System.out.println("Not a valid input.");
                                }
                            }
                            else
                            {
                                System.out.println("Not a valid input.");
                            }
                        }
                        whileFIX = 0;
                        switch (changeSwitch)
                        {
//Change Name
                            case 1:
                                System.out.println(name);
                                System.out.println("Enter the name you would like to change.");
                                inputForChange = kbd.nextLine();
                                whileFIX = 0;
                                while(whileFIX == 0)
                                {
                                    for(i = 0; i < name.size(); i++)
                                    {
                                        if(name.get(i) == inputForChange)
                                        {
                                            name.remove(inputForChange);
                                            System.out.println("Enter new name: ");
                                            inputForChange = kbd.nextLine();
                                            name.add(inputForChange);
                                            whileFIX = 1;
                                        }
                                    }
                                }
                                whileFIX = 0;
                                break;
//Change ID
                            case 2:
                                System.out.println(id);
                                System.out.println("Enter the ID you would like to change.");
                                idInput = kbd.nextInt();
                                kbd.nextLine();
                                whileFIX = 0;
                                while(whileFIX == 0)
                                {
                                    for(i = 0; i < id.size(); i++)
                                    {
                                        if(id.get(i) == idInput)
                                        {
                                            id.remove(idInput);
                                            System.out.println("Enter new name: ");
                                            inputForInt = kbd.nextInt();
                                            id.add(inputForInt);
                                            whileFIX = 1;
                                        }
                                    }
                                }
                                whileFIX = 0;
                                break;
//Change Skills
                            case 3:
                                System.out.println(skills);
                                System.out.println("Enter the skills you would like to change.");
                                inputForChange = kbd.nextLine();
                                whileFIX = 0;
                                while(whileFIX == 0)
                                {
                                    for(i = 0; i < skills.size(); i++)
                                    {
                                        if(skills.get(i) == inputForChange)
                                        {
                                            skills.remove(inputForChange);
                                            System.out.println("Enter new name: ");
                                            inputForChange = kbd.nextLine();
                                            skills.add(inputForChange);
                                            whileFIX = 1;
                                        }
                                    }
                                }
                                whileFIX = 0;
                                break;
//Change Address
                            case 4:
                                System.out.println(address);
                                System.out.println("Enter the address you would like to change.");
                                inputForChange = kbd.nextLine();
                                whileFIX = 0;
                                while(whileFIX == 0)
                                {
                                    for(i = 0; i < address.size(); i++)
                                    {
                                        if(address.get(i) == inputForChange)
                                        {
                                            address.remove(inputForChange);
                                            System.out.println("Enter new name: ");
                                            inputForChange = kbd.nextLine();
                                            address.add(inputForChange);
                                            whileFIX = 1;
                                        }
                                    }
                                }
                                whileFIX = 0;
                                break;
//Change Password
                            case 5:
                                System.out.println("Enter the password you would like to change.");
                                inputForChange = kbd.nextLine();
                                whileFIX = 0;
                                while(whileFIX == 0)
                                {
                                    for(i = 0; i < name.size(); i++)
                                    {
                                        if(passwordArray.get(i) == inputForChange)
                                        {
                                            passwordArray.remove(inputForChange);
                                            System.out.println("Enter new password: ");
                                            inputForChange = kbd.nextLine();
                                            passwordArray.add(inputForChange);
                                            whileFIX = 1;
                                        }
                                    }
                                }
                                whileFIX = 0;
                                break;
                            case 6:
                                break;
                        }
                        whileFIX = 0;
                        break;
                }
            }
            adminFIX = 4;
        }
    }
    public boolean possibleINTEGER(String verifyString)
    {
        try
        {
            Integer.parseInt(verifyString);
            return true;
        }
        catch(Exception e)
        {
            e.getMessage();
            return false;
        }
    }
}