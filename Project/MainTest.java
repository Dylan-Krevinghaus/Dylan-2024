import java.io.IOException;
import java.util.Scanner;
public class MainTest{
    public static void main(String[] args) throws IOException
    {
        String conformation;
        String passwordCheck;
        String passwordStore;
        int whileFIX;
        int a = 0;
        AstronautAdministrator astroAdmin = new AstronautAdministrator();
        SpaceshipAdministrator shipAdmin = new SpaceshipAdministrator();
        Launch launchAttempt = new Launch();
        Security safty = new Security();
        int index;
        Scanner kbd = new Scanner(System.in);
        whileFIX = 0;
        System.out.println("Welcome to our system!");
        if(safty.firstTime())
        {
            passwordStore = safty.generatePassword();
            System.out.println("New here I see, this will be your password: \n" + passwordStore + "\nDO NOT FORGET THIS PASSWORD");
            safty.store(passwordStore);
        }
        while(whileFIX == 0)
        {
            System.out.println("Enter your password: ");
            passwordCheck = kbd.nextLine();
            if(safty.checkPassword(passwordCheck))
            {
                whileFIX = 1;
            }
            else
            {
                System.out.println("Wrong password. Try again!");
            }
        }
        whileFIX = 0;
        while(whileFIX == 0)
        {
            System.out.println("Please enter: \n'1' for all astronaut info \n'2' for astronaut admin \n'3' for all spaceship info \n'4' for spaceship admin \n'5' to attempt to launch \n'6' to log off.");
            index = kbd.nextInt();
            kbd.nextLine();
            switch(index)
            {
//Astro info
                case 1:
                    System.out.println("Name: \n" + astroAdmin.name + "\nSkills: \n" + astroAdmin.skills + "\nAddress: \n" + astroAdmin.address + "\nID: \n" + astroAdmin.id + "\nAmount of family: \n" + astroAdmin.amountOfFamily);
                    break;
//Astro admin
                case 2:
                    whileFIX = 0;
                    while(whileFIX == 0)
                    {
                        System.out.println("Are you sure you want edit astronaut info? 'yes' or 'no'");
                        conformation = kbd.nextLine();
                        if(conformation.equals("yes"))
                        {
                            whileFIX = 0;
                            while(whileFIX == 0)
                            {
                                System.out.println("Enter your password. Or 'exit'");
                                passwordCheck = kbd.nextLine();
                                if(safty.checkPassword(passwordCheck))
                                {
                                    astroAdmin.switchAstronautInfo();
                                }
                                if(!safty.checkPassword(passwordCheck))
                                {
                                    System.out.println("Your password was incorrect. Try again.");
                                }
                                if(passwordCheck.equals("exit"))
                                {
                                    whileFIX = 1;
                                }
                            }
                        }
                        else if(conformation.equals("no"))
                        {
                            whileFIX = 1;
                        }
                        else
                        {
                            System.out.println("Your entry was invalid. Please try again.");
                        }
                        if(astroAdmin.adminFIX == 4)
                        {
                            whileFIX = 1;
                        }
                    }
                    whileFIX = 0;
                    break;
//Ship info
                case 3:
                    System.out.println("Name: \n" + shipAdmin.shipName + "\nFuel: \n" + shipAdmin.shipFuel + "\nFuel Capacity: \n" + shipAdmin.fuelCapacity + "\nCrew Capacity: \n" + shipAdmin.crewCapacity);
                    break;
//Ship admin
                case 4:
                    whileFIX = 0;
                    while(whileFIX == 0)
                    {
                        System.out.println("Are you sure you want edit spaceship info? 'yes' or 'no'");
                        conformation = kbd.nextLine();
                        if(conformation.equals("yes"))
                        {
                            System.out.println("Enter your password. Or 'exit'");
                            passwordCheck = kbd.nextLine();
                            whileFIX = 0;
                            while(whileFIX == 0)
                            {
                                
                                if(safty.checkPassword(passwordCheck))
                                {
                                    shipAdmin.switchSpaceshipInfo();
                                }
                                if(!safty.checkPassword(passwordCheck))
                                {
                                    System.out.println("Your password was incorrect. Try again.");
                                }
                                if(passwordCheck.equals("exit"))
                                {
                                    whileFIX = 1;
                                }
                            }
                        }
                        else if(conformation.equals("no"))
                        {
                            whileFIX = 1;
                        }
                        else
                        {
                            System.out.println("Your entry was invalid. Please try again.");
                        }
                    }
                    whileFIX = 0;
                    break;
//Launch
                case 5:
                    whileFIX = 0;
                    while(whileFIX == 0)
                    {
                        System.out.println("Are you sure you want launch? 'yes' or 'no'");
                        conformation = kbd.nextLine();
                        if(conformation.equals("yes"))
                        {
                            if(launchAttempt.takeOFF())
                            {
                                System.out.println("Launch successful!");
                                whileFIX = 1;
                            }
                            if(!launchAttempt.takeOFF())
                            {
                                System.out.println("Try again.");
                            }
                        }
                        else if(conformation.equals("no"))
                        {
                            whileFIX = 1;
                        }
                        else
                        {
                            System.out.println("Your entry was invalid. Please try again.");
                        }
                    }
                    whileFIX = 0;
                    break;
//Log off
                case 6:
                    a = 0;
                    whileFIX = 0;
                    while(whileFIX == 0)
                    {
                        System.out.println("Are you sure you want log off? 'yes' or 'no'");
                        conformation = kbd.nextLine();
                        if(conformation.equals("yes"))
                        {
                            whileFIX = 1;
                        }
                        else if(conformation.equals("no"))
                        {
                            a = 1;
                        }
                        else
                        {
                            System.out.println("Your entry was invalid. Please try again.");
                        }
                    }
                    if(a == 1)
                    {
                        whileFIX = 0;
                    }
                    break;
            }
        }
        System.out.println("Closing program.");
        kbd.close();
        System.exit(0);
    }
}