import java.util.Scanner;
public class Launch
{
    String shipLaunch;
    int whileFIX;
    int i;
    int a = 0;
    boolean successInFlight;
    SpaceshipAdministrator shipAdmin = new SpaceshipAdministrator();
    Scanner kbd = new Scanner(System.in);
    public boolean takeOFF()
    {
        whileFIX = 0;
        while(whileFIX == 0)
        {
            System.out.println(shipAdmin.shipName);
            System.out.println("What ship would you like to launch?");
            shipLaunch = kbd.nextLine();
            for(i = 0; i < shipAdmin.shipName.size(); i++)
            {
                if(shipLaunch == shipAdmin.shipName.get(i))
                {
                    a = 1;
                    break;
                }
            }
            if(a == 1)
            {
                break;
            }
            else
            {
                System.out.println("You did not put in a valid ship name.");
            }
        }
//Check Ship Name
        if(a == 1)
        {
//Check Ship Fuel
            if(shipAdmin.shipFuel.get(i) == shipAdmin.fuelCapacity.get(i))
            {
//Check Ship Crew
                if(shipAdmin.crewNumb.get(i) == shipAdmin.crewCapacity.get(i))
                {
                    return true;
                }
                System.out.println("Not enough crew members");
                return false;
            }
            System.out.println("Not enough fuel");
            return false;
        }
        return false;
    }
}