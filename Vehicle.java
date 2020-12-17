/*
* The vehicle program implements an application that
* creates an object.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-14
*/

import java.util.ArrayList;  // Import the ArrayList class

///////////////////////////////////////////////////////////////////////////////

public class Vehicle {

  // variables for later.
  public String licenseplateNumber;
  public String colour;
  private final int numberOfDoors = 4;
  private int speed = 40;
  private final int maximumSpeed = 100;
  private final int speedIncreaseDecrease = 10;


  /////////////////////////////////////////////////////////////////////////////
  /**
   * Accelerate function.
   */
  public int accelerate() {
    speed += speedIncreaseDecrease;
    if (speed > maximumSpeed) {
      speed = maximumSpeed;
    }

    return speed;
  }
  
  /////////////////////////////////////////////////////////////////////////////
  /**
   * Brake function.
   */
  public int brake() {
    speed -= speedIncreaseDecrease;
    if (speed < 0) {
      speed = 0;
    }

    return speed;
  }
}
