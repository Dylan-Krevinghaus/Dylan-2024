import java.util.Scanner;
import java.util.*;
public class AstronautAdministrator
{
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> skills = new ArrayList<String>();
    ArrayList<String> address = new ArrayList<String>();
    ArrayList<String> passwordArray = new ArrayList<String>();
    String newName;
    String newSkills;
    String newAddress;
    String password;
    String inputForChange;
    String verifyString;
    String removeName;
    String removeSkills;
    String removeAddress;
    ArrayList<Integer> id = new ArrayList<Integer>();
    ArrayList<Integer> amountOfFamily = new ArrayList<Integer>();
    int inputForInt;
    int idInput;
    int addingSwitch = 0;
    int removingSwitch = 0;
    int changeSwitch = 0;
    int removeID;
    int removeAmountOfFam;
    int whileFIX = 0;
    int newID;
    int newAmountOfFam;
    int i;


    Scanner kbd = new Scanner(System.in);


//Choosing add, remove, or change.
//Along with what they want to change.


    public AstronautAdministrator()
    {
    }

    public AstronautAdministrator(String oldName, int oldID, String oldSkills, String oldAddress, int oldFam, String oldPassword)
    {
        while(whileFIX == 0)
        {
            System.out.println("Please enter the number that correlates with the action. /n 1. add /n 2. remove /n 3. change /n 4. exit");
            verifyString = kbd.nextLine();
            try
            {
                changeSwitch = Integer.parseInt(verifyString);
                if(changeSwitch > 0 && changeSwitch < 5)
                {
                    whileFIX = 1;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Not a valid input.");
            }
        }
        if(changeSwitch != 4)
        {
            switchAstronautInfo(oldName, oldID, oldSkills, oldAddress, oldFam, oldPassword);
        }
    }

//operation for everything

    public void switchAstronautInfo(String oldName, int oldID, String oldSkills, String oldAddress, int oldFam, String oldPassword)
    {
        switch (changeSwitch) {

////Add////

            case 1:
            whileFIX = 0;
                while(whileFIX == 0)
                {
                    System.out.println("Please enter the number that correlates with the following: /n 1. Name /n 2. ID /n 3. Skills /n 4. Address /n 5. Family numbers");
                    verifyString= kbd.nextLine();
                    try
                    {
                        addingSwitch = Integer.parseInt(verifyString);
                        if(addingSwitch > 0 && addingSwitch < 5)
                        {
                            whileFIX = 1;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("Not a valid input.");
                    }
                }
                switch (addingSwitch){
//Add Name
                    case 1:
                        System.out.println("Type the name that you want to add: ");
                        newName = kbd.nextLine();
                        name.add(newName);
//Add ID
                    case 2:
                        System.out.println("Type the ID that you want to add: ");
                        newID = kbd.nextInt();
                        kbd.nextLine();
                        id.add(newID);
//Add Skills
                    case 3:
                        System.out.println("Type the skills that you want to add: ");
                        newSkills = kbd.nextLine();
                        skills.add(newSkills);
//Add Address
                    case 4:
                        System.out.println("Type the address that you want to add: ");
                        newAddress = kbd.nextLine();
                        address.add(newAddress);
//Add Family numbers
                    case 5:
                        System.out.println("Type the amount of family that you want to add: ");
                        newAmountOfFam = kbd.nextInt();
                        amountOfFamily.add(newAmountOfFam);

                }
////Remove////
            case 2:
            whileFIX = 0;
                while(whileFIX == 0)
                {
                    System.out.println("Please enter the number that correlates with the following: /n 1. Name /n 2. ID /n 3. Skills /n 4. Address /n 5. Family numbers");
                    verifyString= kbd.nextLine();
                    try
                    {
                        removingSwitch = Integer.parseInt(verifyString);
                        if(removingSwitch > 0 && removingSwitch < 5)
                        {
                            whileFIX = 1;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("Not a valid input.");
                    }
                }
                switch (addingSwitch){
//Remove Name
                    case 1:
                        //how to remove from array list
                        //variable.remove(index);
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
//Remove ID
                    case 2:
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
//Remove Skills
                    case 3:
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
//Remove Address
                    case 4:
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
//Remove Family Numbers
                    case 5:
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
                }
////Change////
            case 3:
            whileFIX = 0;
                while(whileFIX == 0)
                {
                    System.out.println("Please enter the number that correlates with the following: /n 1. Name /n 2. ID /n 3. Skills /n 4. Address /n 5. Password");
                    verifyString = kbd.nextLine();
                    try
                    {
                        changeSwitch = Integer.parseInt(verifyString);
                        if(changeSwitch > 0 && changeSwitch < 5)
                        {
                            whileFIX = 1;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("Not a valid input.");
                    }
                }
                switch (changeSwitch)
                {
//Change Name
                    case 1:
                        System.out.println(name);
                        System.out.println("Enter the name you would like to change.");
                        inputForChange = kbd.nextLine();
                        for(i = 0; i < name.size(); i++)
                        {
                            if(name.get(i) == inputForChange)
                            {
                                name.remove(inputForChange);
                                System.out.println("Enter new name: ");
                                inputForChange = kbd.nextLine();
                                name.add(inputForChange);
                            }
                        }
//Change ID
                    case 2:
                        System.out.println(id);
                        System.out.println("Enter the ID you would like to change.");
                        idInput = kbd.nextInt();
                        kbd.nextLine();
                        for(i = 0; i < id.size(); i++)
                        {
                            if(id.get(i) == idInput)
                            {
                                id.remove(idInput);
                                System.out.println("Enter new name: ");
                                inputForInt = kbd.nextInt();
                                id.add(inputForInt);
                            }
                        }
//Change Skills
                    case 3:
                        System.out.println(skills);
                        System.out.println("Enter the skills you would like to change.");
                        inputForChange = kbd.nextLine();
                        for(i = 0; i < skills.size(); i++)
                        {
                            if(skills.get(i) == inputForChange)
                            {
                                skills.remove(inputForChange);
                                System.out.println("Enter new name: ");
                                inputForChange = kbd.nextLine();
                                skills.add(inputForChange);
                            }
                        }
//Change Address
                    case 4:
                        System.out.println(address);
                        System.out.println("Enter the address you would like to change.");
                        inputForChange = kbd.nextLine();
                        for(i = 0; i < address.size(); i++)
                        {
                            if(address.get(i) == inputForChange)
                            {
                                address.remove(inputForChange);
                                System.out.println("Enter new name: ");
                                inputForChange = kbd.nextLine();
                                address.add(inputForChange);
                            }
                        }
//Change Password
                    case 5:
                        System.out.println("Enter the password you would like to change.");
                        inputForChange = kbd.nextLine();
                        for(i = 0; i < name.size(); i++)
                        {
                            if(passwordArray.get(i) == inputForChange)
                            {
                                passwordArray.remove(inputForChange);
                                System.out.println("Enter new password: ");
                                inputForChange = kbd.nextLine();
                                passwordArray.add(inputForChange);
                            }
                        }
                }
        }
    }
}