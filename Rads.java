class Rads extends ConsoleProgram {

  /**
  * Program that takes degrees from the user and converts to radians
  * @author: B. Yu
  */
  
  public void run() {
    
    // naming variables
    double dblDegrees;
    double dblRadians;

    // Get the degree value from the user
    dblDegrees = readDouble("Input degree: ");
    
    // Converting degrees to radians
    dblRadians = Math.toRadians(dblDegrees);

    // Add an inline comment for the ouput
    // Output the result
    System.out.println("The radian measures to: " + dblRadians);
  }
}