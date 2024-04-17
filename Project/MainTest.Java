import java.util.*;
import java.util.Scanner;
public class MainTest{
    public static void main(String[] args)
    {
        Astronaut astro = new Astronaut();
        AstronautAdministrator astroAdmin = new AstronautAdministrator();
        Spaceship ship = new Spaceship();
        SpaceshipAdministrator shipAdmin = new SpaceshipAdministrator();
        Launch launchAttempt = new Launch();
        int index;
        Scanner kbd = new Scanner(System.in);
        System.out.println("Welcome to our system. Please enter '1' for astronaut and '2' for spaceship.");
        index = kbd.nextInt();
        kbd.nextLine();
        switch(index)
        {
            case 1:
                System.out.println("");
                switch(index)
                {   
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                }
            case 2:
                System.out.println("");
                switch(index)
                {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                }
        }
        //does not work
        kbd.close();
        System.exit(0);
    }
}