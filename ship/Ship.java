/*
* @author Huong Pham
 * Course: CSC 112-301 Fund of computing II
 * Assignment: GuiAssignment1
 * Description: Design a Ship class that has the following members:
 A field for the name of the ship
 A field for the year that the ship was built
 A constructor and appropriate accessors and mutators
Design a CruiseShip class that extends the Ship class. The CruiseShip should have
the following members:
 A field for the maximum number of passengers
 A constructor and appropriate accessors and mutators
Design a CargoShip class that extends the Ship class. The CargoShip class should
have the following members:
 A field for the cargo capacity in tonnage
 A constructor and appropriate accessors and mutators
Design an interface called ShipDetails which will provide the following methods
definitions:
 public void DisplayShipDetails();
o This method will display the detail information about the ship which
is contained in the base class and the derived class. (In a
clean/readable format, no guessing what the data on the screen
mean).
 public boolean isOlder(ShipDetails obj);
o This method will compare the two ships to determine which ship is
older.
The Ship should implement the ShipDetails interface. Create the driver class with
a main method that instantiates several ships of different types and exercise the
behavior provided by the classes. Below is the UML diagram you should be
following. A main is provided to test your work.
*/
package ship;

public class Ship implements ShipDetails 
{
    //Variables
    protected String name;
    protected int year;

    public Ship(String name, int year) 
    {
        this.name = name;
        this.year = year;
    }//End constructor

    public String getName() 
    {
        return this.name;
    }//End getName

    public void setName(String name) 
    {
        this.name = name;
    }//End setName

    public int getYear() 
    {
        return this.year;
    }//End getYear()

    public void setYear(int year) 
    {
        this.year = year;
    }//End setYear()
    
    @Override
    public void displayShipDetails()
    {
        System.out.println(this.toString());
    }//End displayShipDetails()
    
    
    @Override
    public boolean isOlder(ShipDetails obj)
    {
        if (obj instanceof Ship otherShip) 
        {
            return this.year < otherShip.year;
        }//End if loop
        return false;
    }//End isOlder 
    
    @Override
    public String toString() 
    {
        String msg;
        msg = "Ship Name: " + name + ", Year Built: " + year;
        
        return msg;
    }//End toString
}//End public class Ship 
