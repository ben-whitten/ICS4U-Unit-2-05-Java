/*
* The Main program implements an application that
* creates a vheicle.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-14
*/

import java.util.Scanner;  // Import the Scanner class

///////////////////////////////////////////////////////////////////////////////

class Main {

  ////////////////////////////////////////////////////////////////////////////

  /**
   * This function handles all the inputs and outputs.
   */
  public static void main(String[] args) {

    // Vehicle.
    Vehicle someCar = new Vehicle();

    someCar.licenseplateNumber = "CAJA 723";
    System.out.println("Set license plate to: " + someCar.licenseplateNumber);
    someCar.colour = "White";
    System.out.println("Set colour to: " + someCar.colour);
    

    int speed = someCar.accelerate();
    System.out.println("Currently going at: " + speed + " kph");
    speed = someCar.accelerate();
    System.out.println("Currently going at: " + speed + " kph");
    speed = someCar.accelerate();
    System.out.println("Currently going at: " + speed + " kph");
    speed = someCar.accelerate();
    System.out.println("Currently going at: " + speed + " kph");
    speed = someCar.accelerate();
    System.out.println("Currently going at: " + speed + " kph");
    speed = someCar.accelerate();
    System.out.println("Currently going at: " + speed + " kph");
    speed = someCar.accelerate();
    System.out.println("Currently going at: " + speed + " kph");
    speed = someCar.brake();
    System.out.println("Currently going at: " + speed + " kph");

    ///////////////////////////////////////////////////////////////////////////
  }
}
