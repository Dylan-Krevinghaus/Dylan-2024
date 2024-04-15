import java.util.*;
public class MainTest{
    public static void main(String[] args)
    {
        Astronaut astro = new Astronaut();
        AstronautAdministrator astroAdmin = new AstronautAdministrator();
        Spaceship ship = new Spaceship();
        SpaceshipAdministrator shipAdmin = new SpaceshipAdministrator();
        Launch launchAttempt = new Launch();
        System.out.println(astroAdmin);
        System.exit(0);
    }
}