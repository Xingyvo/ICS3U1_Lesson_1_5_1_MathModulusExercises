class Cos3rd extends ConsoleProgram {

  /**
  * A program Cos3rd.java that lets you enter two sides of a triangle and the 
  * contained angle, and that will use the cosine law to calculate the third side
  * @author: B. Yu
  */
  
  public void run() {
    
    // Define the variables
    double dblSideA;
    double dblSideB;
    double dblAngleC; 
    double dblSideC;

    // Get side a, side b, and angle C from the user
    dblSideA = readDouble("What is the length of side a: ");
    dblSideB = readDouble("What is the length of side b: ");
    dblAngleC = readDouble("What is the degree of angle C: ");

    // Calculate the third side using cosine law
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngleC)));
    
    // Output side c
    System.out.println("The length of side c is: " + dblSideC);
  }
}