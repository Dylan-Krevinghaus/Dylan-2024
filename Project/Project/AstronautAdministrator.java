package Project;
import java.util.Scanner;
import java.util.*;
public class AstronautAdministrator
{
    ArrayList<String> name = new ArrayList<String>();
    String newName;
    ArrayList<String> skills = new ArrayList<String>();
    String newSkills;
    ArrayList<String> address = new ArrayList<String>();
    String newAddress;
    String password;
    String add_remove_change;
    String add_removeinput;
    String add_remove;
    String changeInput;
    String nameInput;
    int changeSwitch = 0;
    ArrayList<Integer> id = new ArrayList<Integer>();
    int newID;
    ArrayList<Integer> amountOfFamily = new ArrayList<Integer>();
    int newAmountOfFam;
    int i;
    Scanner kbd = new Scanner(System.in);

//Choosing add, remove, or change.
//Along with what they want to change.

    public AstronautAdministrator(String oldName, int oldID, String oldSkills, String oldAddress, int oldFam, String oldPassword)
    {
        System.out.println("Please enter the number that correlates with the action. /n 1. add /n 2. remove /n 3. change /n 4. exit");
        // add_remove_change = kbd.nextLine();
        // if(add_remove_change == "add" || add_remove_change =="remove")
        // {
        //     System.out.println("Please select something you would like to add or remove: Name, ID, Skills, Address, or FamilyNumbers");
        //     add_removeinput = kbd.nextLine();
        //     if(add_removeinput == "Name")
        //     {
        //         add_remove_AstronautName(oldName);
        //     }
        //     if(add_removeinput == "ID")
        //     {
        //         add_remove_ID(oldID);
        //     }
        //     if(add_removeinput == "Skills")
        //     {
        //         add_remove_Skills(oldSkills);
        //     }
        //     if(add_removeinput == "Address")
        //     {
        //         add_remove_Address(oldAddress);
        //     }
        //     if(add_removeinput == "FamilyNumbers")
        //     {
        //         add_remove_FamilyNumbers(oldFam);
        //     }
        // }
        // if(add_remove_change == "change")
        // {
        //     System.out.println("Please select something you would like to change: Name, ID, Skills, Address, or FamilyNumbers");
        //     changeInput = kbd.nextLine();
        //     if(changeInput == "Name")
        //     {
        //         changeAstronautName();
        //     }
        //     if(changeInput == "ID")
        //     {
        //         changeID();
        //     }
        //     if(changeInput == "Skills")
        //     {
        //         changeSkills();
        //     }
        //     if(changeInput == "Address")
        //     {
        //         changeAddress();
        //     }
        //     if(changeInput == "Password")
        //     {
        //         resetPassword(oldPassword);
        //     }
        // }
    }
//operation for everything
    public void switchAstronautInfo()
    {
        switch (changeSwitch) {
//Add
            case 1:
//Remove
            case 2:
//Change
            case 3:
        }
    }
//Add or remove name
    public void add_remove_AstronautName(String oldName)
    {
        System.out.println("add or remove");
        add_remove = kbd.nextLine();
        if(add_remove == "add")
        {
            System.out.println("Type the name that you want to add: ");
            newName = kbd.nextLine();
            name.add(newName);
        }
    }
//Change name
    public String changeAstronautName()
    {
        System.out.println(name);
        System.out.println("Select the number of the name.");
        nameInput = kbd.nextLine();
        for(i = 0; i < name.size(); i++)
        {
            if(name.get(i) == nameInput)
            {
                System.out.println("Enter new name: ");
                name[i].replace(kbd.nextLine());
            }
        }
    }
//Add or remove ID
    public void add_remove_ID(int oldID)
    {
        System.out.println("add or remove");
        add_remove = kbd.nextLine();
        if(add_remove == "add")
        {
            System.out.println("Type the ID that you want to add: ");
            newID = kbd.nextInt();
            kbd.nextLine();
            id.add(oldID);
        }
    }
//Change ID
    public int changeID()
    {
    }
//Add or remove skills
    public void add_remove_Skills(String oldSkills)
    {
        System.out.println("add or remove");
        add_remove = kbd.nextLine();
        if(add_remove == "add")
        {
            System.out.println("Type the skills that you want to add: ");
            newSkills = kbd.nextLine();
            skills.add(oldSkills);
        }
    }
//Change skills
    public String changeSkills()
    {
    }
//Add or remove address
    public void add_remove_Address(String oldAddress)
    {
        System.out.println("add or remove");
        add_remove = kbd.nextLine();
        if(add_remove == "add")
        {
            System.out.println("Type the address that you want to add: ");
            newAddress = kbd.nextLine();
            address.add(oldAddress);
        }
    }
//Change address
    public String changeAddress()
    {
    }
//Add or remove family
    public void add_remove_FamilyNumbers(int oldFam)
    {
        System.out.println("add or remove");
        add_remove = kbd.nextLine();
        if(add_remove == "add")
        {
            System.out.println("Type the amount of family that you want to add: ");
            newAmountOfFam = kbd.nextInt();
            amountOfFamily.add(oldFam);
        }
    }
//Reset password
    public String resetPassword(String oldPassword)
    {
        return password;
    }
}