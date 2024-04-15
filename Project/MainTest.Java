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
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
        }
        //does not work
        Scanner.close(kbd);
        System.exit(0);
    }
}