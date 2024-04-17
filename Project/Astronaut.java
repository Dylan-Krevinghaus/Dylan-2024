public class Astronaut extends AstronautAdministrator
{
    
    // List of variables used in the lines of code below
   
    private String name;
    private String skills;
    private String address;
    private String password;
    private int id;
    private int amountOfFamily;
    
    // Makes the variables a little more easy to access inside the get and set methods
    
    public Astronaut(String name, String skills, String address, String password, int id, int amountOfFamily)
    {
       this.name = name;
        this.skills = skills;
         this.address = address;
          this.password = password;
           this.id = id;
            this.amountOfFamily = amountOfFamily; 
    }
   
    // Methods getName and setName, return and set the name of the astronaut
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
   // Methods getSkills and setSkills, return and set the skills attributed to the following astronaut
    
    public String getSkills()
    {
        return skills;
    }
    
    public void setSkills(String skills)
    {
        this.skills = skills;
    }

    // Methods getAddress and setAddress, return and set the address of the astronaut
    
    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    // The following methods, getPassword and setPassword, grabs and sets the password the astronaut has
    // public String createPassword(){ }
    
    public String getCreatePassword()
    {
        return password;
    }

    public void setCreatePassword(String password)
    {
        this.password = password;
    }

    // The following methods, getID and setID, grabs and sets the id of the astronaut
    
    public int getID()
    {
        return id;
    }

     public void setID(int id)
     {
        this.id = id;
    }

    // The methods, getFamilyNumbers and setFamilyNumbers, works to count the number of family members of the astronaut
    //  public int familyNumbers(){ }
    
    public int getFamilyNumbers()
    {
        return amountOfFamily;
    }

    public void setFamilyNumbers(int amountOfFamily)
    {
        this.amountOfFamily = amountOfFamily;
    }
}
