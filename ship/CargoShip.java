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

public class CargoShip extends Ship
{
    //Variables
    protected int capacity;

    public CargoShip(int capacity, String name, int year) 
    {
        super(name, year);
        this.capacity = capacity;
    }//End constructor

    public int getCapacity() 
    {
        return this.capacity;
    }//End getCapacity()

    public void setCapacity(int capacity) 
    {
        this.capacity = capacity;
    }//End setCapacity  

    @Override
    public String toString() 
    {
        String msg;
        msg = "CargoShip{" + "capacity=" + capacity + '}';
        msg += super.toString();
        
        return msg;
    }//End toString()
}//End public class CargoShip
