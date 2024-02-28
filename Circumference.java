class Circumference extends ConsoleProgram {

  /**
  * Computes the circumference of a circle given a radius
  * @author: B.Yu
  */
  
  public void run() {
    
    // Define the variables
    double dblRadius;5    
    double dblCircumference;

    // Receive the value of the radius from user
    dblRadius = readDouble("Enter radius: ");

    // Compute the circumference
    dblCircumference = (2 * Math.PI * dblRadius);

    // Output the circumference
    System.out.println("The circumference of this circle is: " + dblCircumference);
  }
}
