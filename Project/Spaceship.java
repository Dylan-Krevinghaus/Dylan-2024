public class Spaceship extends SpaceshipAdministrator
{

    // List of variables used in the lines of code below

    private String shipName;
    private int shipFuel;
    private int fuelCapacity;
    private int crewCapacity;

    // Makes the variables a little more easy to access inside the get and set methods
    public Spaceship()
    {
    }
    public Spaceship(String name, int fuel, int fuelCap, int crewCap)
    {
       this.shipName = name;
        this.shipFuel = fuel;
         this.fuelCapacity = fuelCap;
          this.crewCapacity = crewCap;
    }
    // Methods getShipName and setShipName, return and set the name of the spaceship

    public String getShipName()
    {
        return shipName;
    }

    public void setShipName(String shipName)
    {
        this.shipName = shipName;
    }
    // Methods getShipFuel and setShipFuel, return and set the amount of fuel in the ship
    
    public int getShipFuel()
    {
        return shipFuel;
    }

    public void setShipFuel(int shipFuel)
    {
        this.shipFuel = shipFuel;
    }

    // Methods getFuelCap and setFuelCap, return and set the fuel capacity of the ship

    public int getFuelCap()
    {
        return fuelCapacity;
    }

    public void setFuelCap(int fuelCapacity)
    {
        this.fuelCapacity = fuelCapacity;
    }

    // Methods getCrewCap and setCrewCap, return and set the crew capacity of the ship

    public int getCrewCap()
    {
        return crewCapacity;
    }

    public void setCrewCap(int crewCapacity)
    {
        this.crewCapacity = crewCapacity;
    }
}