import java.util.Scanner;
public class MainTest{
    public static void main(String[] args)
    {
        String conformation;
        String passwordCheck;
        String passwordStore;
        int whileFIX;
        int a = 0;
        Astronaut astro = new Astronaut();
        AstronautAdministrator astroAdmin = new AstronautAdministrator();
        Spaceship ship = new Spaceship();
        SpaceshipAdministrator shipAdmin = new SpaceshipAdministrator();
        Launch launchAttempt = new Launch();
        Security safty = new Security();
        int index;
        Scanner kbd = new Scanner(System.in);
        whileFIX = 0;
        
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
            System.out.println("Welcome to our system! \nPlease enter: \n'1' for all astronaut info \n'2' for astronaut admin \n'3' for all spaceship info \n'4' for spaceship admin \n'5' to attempt to launch \n'6' to log off.");
            index = kbd.nextInt();
            kbd.nextLine();
            switch(index)
            {
                case 1:
                    System.out.println("Name: \n" + astro.getName() + "\nSkills: \n" + astro.getSkills() + "\nAddress: \n" + astro.getAddress() + "\nID: \n" + astro.getID() + "\nAmount of family: \n" + astro.getFamilyNumbers());
                    break;
                case 2:
                    whileFIX = 0;
                    while(whileFIX == 0)
                    {
                        System.out.println("Are you sure you want edit astronaut info? 'yes' or 'no'");
                        conformation = kbd.nextLine();
                        if(conformation.equals("yes"))
                        {
                            astroAdmin.switchAstronautInfo();
                        }
                        else if(conformation.equals("no"))
                        {
                            whileFIX = 1;
                        }
                        else
                        {
                            System.out.println("Your entry was invalid. Please try again.");
                        }
                        if(astro.verifyString == 4)
                        {
                            whileFIX = 1;
                        }
                    }
                    whileFIX = 0;
                    break;
                case 3:
                    System.out.println("Name: \n" + ship.getShipName() + "\nFuel: \n" + ship.getShipFuel() + "\nFuel Capacity: \n" + ship.getFuelCap() + "\nCrew Capacity: \n" + ship.getCrewCap());
                    break;
                case 4:
                    whileFIX = 0;
                    while(whileFIX == 0)
                    {
                        System.out.println("Are you sure you want edit spaceship info? 'yes' or 'no'");
                        conformation = kbd.nextLine();
                        if(conformation == "yes")
                        {
                            shipAdmin.switchSpaceshipInfo();
                        }
                        else if(conformation == "no")
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
                case 5:
                    whileFIX = 0;
                    while(whileFIX == 0)
                    {
                        System.out.println("Are you sure you want launch? 'yes' or 'no'");
                        conformation = kbd.nextLine();
                        if(conformation == "yes")
                        {
                            if(launchAttempt.takeOFF())
                            {
                                System.out.println("Launch successful!");
                            }
                            if(!launchAttempt.takeOFF())
                            {
                                System.out.println("Try again.");
                            }
                        }
                        else if(conformation == "no")
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
                case 6:
                    a = 0;
                    whileFIX = 0;
                    while(whileFIX == 0)
                    {
                        System.out.println("Are you sure you want log off? 'yes' or 'no'");
                        conformation = kbd.nextLine();
                        if(conformation == "yes")
                        {
                            whileFIX = 1;
                        }
                        else if(conformation == "no")
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
        //does not work
        kbd.close();
        System.exit(0);
    }
}