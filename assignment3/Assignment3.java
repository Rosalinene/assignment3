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
package assignment3;

//Imports declare
import ship.CargoShip;
import ship.CruiseShip;
import ship.ShipDetails;

public class Assignment3 
{
    public static void main(String[] args) 
    {
        ShipDetails cruise1 = new CruiseShip(3000, "Blue Whale", 1990);
        ShipDetails cruise2 = new CruiseShip(3300, "White Whale", 2000);
        ShipDetails cargo1 = new CargoShip(20000, "Pot Belly 1", 1990);
        ShipDetails cargo2 = new CargoShip(23000, "Pot Belly 2", 1865);
        
        cruise1.displayShipDetails();
        cruise2.displayShipDetails();
        cargo1.displayShipDetails();
        cargo2.displayShipDetails();
        
        if(cruise1.isOlder(cruise2))
        System.out.println(((CruiseShip)cruise1).getName() + " is older");
        else
        System.out.println(((CruiseShip)cruise2).getName() + " is older");
        if(cargo1.isOlder(cargo2))
        System.out.println(((CargoShip)cargo1).getName() + " is older");
        else
        System.out.println(((CargoShip)cargo2).getName() + " is older");
    }//End main
}//End public class Assignment3 
