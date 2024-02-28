class AreaSin extends ConsoleProgram {

  /**
  * Finds area of a triangle given two sides and a containing angle
  * @author: B. Yu
  */
  
  public void run() {
    
    // Add a comment here (Define the variables)
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // Get side and angle information
    dblSideA = readDouble("Enter side A of a triangle: ");
    dblSideB = readDouble("Enter side B of a triangle: ");
    dblAngleC = readDouble("Enter the angle contained by Side A and B: ");

    // Compute area
    dblArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngleC))) / 2.0;

    // Output result
    System.out.println("The area is " + dblArea);
  }
}