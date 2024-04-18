import java.util.*;
import java.util.Scanner;
public class SpaceshipAdministrator
{
    ArrayList<String> shipName = new ArrayList<String>();
    String newShipName, removeShipName, verifyString, inputForChange, shipCheck, removeYesOrNo;
    ArrayList<Integer> shipFuel = new ArrayList<Integer>();
    ArrayList<Integer> fuelCapacity = new ArrayList<Integer>();
    ArrayList<Integer> crewNumb = new ArrayList<Integer>();
    ArrayList<Integer> crewCapacity = new ArrayList<Integer>();
    int newFuel, fixedShipFuel, newFuelCap, newCrewNumbs, newCrewCap, whileFIX, removeFuel, removeCrewCap, changeSwitch, addingSwitch, removingSwitch, inputForInt;
    int i = 0, a = 0;
    boolean vailidity;
    Scanner kbd = new Scanner(System.in);
//Constructor//
    public SpaceshipAdministrator(String shipName, int shipFuel, int fuelCapacity, int crewCapacity)
        {
            this.shipName.add(shipName);
            this.shipFuel.add(shipFuel);
            this.fuelCapacity.add(fuelCapacity);
            this.crewCapacity.add(crewCapacity);
        }
    public SpaceshipAdministrator()
    {
    }
////operation for everything////
    public void switchSpaceshipInfo()
    {
        whileFIX = 0;
        while(whileFIX == 0)
        {
            System.out.println("Please enter the number that correlates with the action. \n1. add \n2. remove \n3. change \n4. exit");
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
        if(changeSwitch >= 1 && changeSwitch <= 3)
        {
            switchSpaceshipInfo();
        }
        switch (changeSwitch)
        {
////Add////
            case 1:
            whileFIX = 0;
                while(whileFIX == 0)
                {
                    System.out.println("Please enter the number that correlates with the following: \n1. Name \n2. Fuel \n3. Fuel Capacity \n4. Crew Numbers \n5. Crew Capacity");
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
                switch (addingSwitch)
                {
//Add Name
                    case 1:
                        whileFIX = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println("Enter the name that you want to add: ");
                            newShipName = kbd.nextLine();
                            vailidity = true;
                            for(i = 0; i < shipName.size(); i++)
                            {
                                if(newShipName == shipName.get(i))
                                {
                                    System.out.println("This ship has already been made.");
                                    vailidity = false;
                                }
                            }
                            if(vailidity == true)
                                {
                                    shipName.add(newShipName);
                                    whileFIX = 1;
                                }
                        }
//Add Fuel
                    case 2:
                        whileFIX = 0;
                        a = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println(shipName);
                            System.out.println("What ship would you like to add the fuel into?");
                            shipCheck = kbd.nextLine();
                            for(i = 0; i < shipName.size(); i++)
                            {
                                if(shipCheck == shipName.get(i))
                                {
                                    a = 1;
                                    break;
                                }
                            }
                            if(a == 1)
                            {
                                whileFIX = 1;
                            }
                            else
                            {
                                System.out.println("Your entry was not a ship name.");
                            }
                        }
                        whileFIX = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println("Enter the amount of fuel that you want to add: (Note: Fuel must be max in order to launch)");
                            newFuel = kbd.nextInt();
                            kbd.nextLine();
                            if(a == 1)
                            {
                                shipFuel.add(i, newFuel);
                                whileFIX = 1;
                            }
                        }
//Add Fuel Capacity
                    case 3:
                        whileFIX = 0;
                        a = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println(shipName);
                            System.out.println("What ship does this corrolate to?");
                            shipCheck = kbd.nextLine();
                            for(i = 0; i < shipName.size(); i++)
                            {
                                if(shipCheck == shipName.get(i))
                                {
                                    a = 1;
                                    break;
                                }
                            }
                            if(a == 1)
                            {
                                whileFIX = 1;
                            }
                            else
                            {
                                System.out.println("Your entry was not a ship name.");
                            }
                        }
                        whileFIX = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println("Enter the fuel capacity that you want to add: ");
                            newFuelCap = kbd.nextInt();
                            kbd.nextLine();
                            if(a == 1)
                            {
                                fuelCapacity.add(i, newFuelCap);
                                whileFIX = 1;
                            }
                        }
//Add Crew Memebers
                    case 4:
                        whileFIX = 0;
                        a = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println(shipName);
                            System.out.println("What ship does this corrolate to?");
                            shipCheck = kbd.nextLine();
                            for(i = 0; i < shipName.size(); i++)
                            {
                                if(shipCheck == shipName.get(i))
                                {
                                    a = 1;
                                    break;
                                }
                            }
                            if(a == 1)
                            {
                                whileFIX = 1;
                            }
                            else
                            {
                                System.out.println("Your entry was not a ship name.");
                            }
                        }
                        whileFIX = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println("Enter the crew amount that you want to add: (Note: Crew numbers must be max in order to launch)");
                            newCrewNumbs = kbd.nextInt();
                            kbd.nextLine();
                            if(a == 1)
                            {
                                crewNumb.add(i, newCrewNumbs);
                                whileFIX = 1;
                            }
                        }
//Add Crew Capacity
                    case 5:
                        whileFIX = 0;
                        a = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println(shipName);
                            System.out.println("What ship does this corrolate to?");
                            shipCheck = kbd.nextLine();
                            for(i = 0; i < shipName.size(); i++)
                            {
                                if(shipCheck == shipName.get(i))
                                {
                                    a = 1;
                                    break;
                                }
                            }
                            if(a == 1)
                            {
                                whileFIX = 1;
                            }
                            else
                            {
                                System.out.println("Your entry was not a ship name.");
                            }
                        }
                        whileFIX = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println("Enter the crew capacity that you want to add: ");
                            newCrewCap = kbd.nextInt();
                            kbd.nextLine();
                            if(a == 1)
                            {
                                crewCapacity.add(i, newCrewCap);
                                whileFIX = 1;
                            }
                        }
                }
////Remove////
            case 2:
                whileFIX = 0;
                while(whileFIX == 0)
                {
                    System.out.println("Please enter the number that correlates with the following: \n1. Name \n2. Fuel \n3. Fuel Capacity \n4. Crew Numbers \n5. Crew Capacity");
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
                switch (addingSwitch)
                {
//Remove Name
                    case 1:
                        whileFIX = 0;
                        a = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println(shipName);
                            System.out.println("Please enter in the exact name you would like to remove. Note: Removing the name does not remove its attributes");
                            removeShipName = kbd.nextLine();
                            for(i = 0; i < shipName.size(); i++)
                            {
                                newShipName = shipName.get(i);
                                if(newShipName == removeShipName)
                                {
                                    shipName.remove(i);
                                    a = 1;
                                }
                            }
                            if(a == 1)
                            {
                                whileFIX = 1;
                            }
                            else
                            {
                                System.out.println("Your entry was not a ship name.");
                            }
                        }
//Remove Fuel
                    case 2:
                        whileFIX = 0;
                        a = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println(shipName);
                            System.out.println("What ship would you like to remove the fuel from?");
                            shipCheck = kbd.nextLine();
                            for(i = 0; i < shipName.size(); i++)
                            {
                                if(shipCheck == shipName.get(i))
                                {
                                    a = 1;
                                    break;
                                }
                            }
                            if(a == 1)
                            {
                                whileFIX = 1;
                            }
                            else
                            {
                                System.out.println("Your entry was not a ship name.");
                            }
                        }
                        whileFIX = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println("Please Enter in the exact amount of fuel you would like to remove.");
                            removeFuel = kbd.nextInt();
                            kbd.nextLine();
                            whileFIX = 0;
                            while(whileFIX == 0)
                            {
                                if(a == 1)
                                {
                                    fixedShipFuel = shipFuel.get(i) - removeFuel;
                                    if(fixedShipFuel <= 0)
                                    {   
                                        System.out.println("This fuel is now empty. Would you like to remove it from the ship? 'Yes' or 'No'");
                                        removeYesOrNo = kbd.nextLine();
                                        whileFIX = 0;
                                        while(whileFIX == 0)
                                        {
                                            if(removeYesOrNo == "Yes")
                                            {
                                                shipFuel.remove(i);
                                                whileFIX = 1;
                                            }
                                            else if(removeYesOrNo == "No")
                                            {
                                                shipFuel.set(i, 0);
                                                whileFIX = 1;
                                            }
                                            else if(whileFIX == 0)
                                            {
                                                System.out.println("That was not the correct input.");
                                            }
                                        }
                                    }
                                }
                            }
                        }
//Remove Fuel Capacity
                    case 3:
                        whileFIX = 0;
                        a = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println(shipName);
                            System.out.println("Please enter the ship's name in order to remove the fuel capacity.");
                            shipCheck = kbd.nextLine();
                            for(i = 0; i < shipName.size(); i++)
                            {
                                if(shipCheck == shipName.get(i))
                                {
                                    a = 1;
                                    break;
                                }
                            }
                            if(a == 1)
                            {
                                whileFIX = 1;
                            }
                            else
                            {
                                System.out.println("Your entry was not a ship name.");
                            }
                        }
                        fuelCapacity.remove(i);
//Remove Crew Members
                    case 4:
                        whileFIX = 0;
                        a = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println(shipName);
                            System.out.println("Please enter the ship's name in order to remove the fuel capacity.");
                            shipCheck = kbd.nextLine();
                            for(i = 0; i < shipName.size(); i++)
                            {
                                if(shipCheck == shipName.get(i))
                                {
                                    a = 1;
                                    break;
                                }
                            }
                            if(a == 1)
                            {
                                whileFIX = 1;
                            }
                            else
                            {
                                System.out.println("Your entry was not a ship name.");
                            }
                        }
                        crewNumb.remove(i);
//Remove Crew Capacity
                    case 5:
                        whileFIX = 0;
                        a = 0;
                        while(whileFIX == 0)
                        {
                            System.out.println(shipName);
                            System.out.println("Please enter the ship's name in order to remove the fuel capacity.");
                            shipCheck = kbd.nextLine();
                            for(i = 0; i < shipName.size(); i++)
                            {
                                if(shipCheck == shipName.get(i))
                                {
                                    a = 1;
                                    break;
                                }
                            }
                            if(a == 1)
                            {
                                whileFIX = 1;
                            }
                            else
                            {
                                System.out.println("Your entry was not a ship name.");
                            }
                        }
                        crewCapacity.remove(i);
                    }
////Change////
            case 3:
                whileFIX = 0;
                while(whileFIX == 0)
                {
                    System.out.println("Please enter the number that correlates with the following: \n1. Name \n2. Fuel \n3. Fuel Capacity \n4. Crew Capacity");
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
                        System.out.println(shipName);
                        System.out.println("Enter the name you would like to change.");
                        inputForChange = kbd.nextLine();
                        for(i = 0; i < shipName.size(); i++)
                        {
                            if(shipName.get(i) == inputForChange)
                            {
                                shipName.remove(i);
                                System.out.println("Enter new name: ");
                                inputForChange = kbd.nextLine();
                                shipName.add(i, inputForChange);
                            }
                        }
//Change Fuel
                    case 2:
                        System.out.println(shipFuel);
                        System.out.println("Enter the fuel you would like to change.");
                        inputForInt = kbd.nextInt();
                        kbd.nextLine();
                        for(i = 0; i < shipFuel.size(); i++)
                        {
                            if(shipFuel.get(i) == inputForInt)
                            {
                                shipFuel.remove(i);
                                System.out.println("Enter new fuel: ");
                                inputForInt = kbd.nextInt();
                                kbd.nextLine();
                                shipFuel.add(i, inputForInt);
                            }
                        }
//Change Fuel Capacity
                    case 3:
                        System.out.println(fuelCapacity);
                        System.out.println("Enter the fuel capacity you would like to change.");
                        inputForInt = kbd.nextInt();
                        kbd.nextLine();
                        for(i = 0; i < fuelCapacity.size(); i++)
                        {
                            if(fuelCapacity.get(i) == inputForInt)
                            {
                                fuelCapacity.remove(i);
                                System.out.println("Enter new fuel capacity: ");
                                inputForInt = kbd.nextInt();
                                kbd.nextLine();
                                fuelCapacity.add(i, inputForInt);
                            }
                        }
//Change Crew Capacity
                    case 4:
                        System.out.println(crewCapacity);
                        System.out.println("Enter the crew capacity you would like to change.");
                        inputForInt = kbd.nextInt();
                        kbd.nextLine();
                        for(i = 0; i < crewCapacity.size(); i++)
                        {
                            if(crewCapacity.get(i) == inputForInt)
                            {
                                crewCapacity.remove(i);
                                System.out.println("Enter new crew capacity: ");
                                inputForInt = kbd.nextInt();
                                kbd.nextLine();
                                crewCapacity.add(i, inputForInt);
                            }
                        }
                }
        }
    }
}