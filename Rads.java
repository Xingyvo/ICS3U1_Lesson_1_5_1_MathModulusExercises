class Rads extends ConsoleProgram {

  /**
  * Program that takes degrees from the user and converts to radians
  * @author: B. Yu
  */
  
  public void run() {
    
    // naming variables
    double dblDegrees;
    double dblRadians;

    // calculations and printing
    dblDegrees = readDouble("Input degree: ");
    dblRadians = Math.toRadians(dblDegrees);
    System.out.println("The radian measures to: " + dblRadians);
  }
}