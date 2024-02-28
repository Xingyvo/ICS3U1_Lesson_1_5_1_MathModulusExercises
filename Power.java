class Power extends ConsoleProgram {

  /**
  * A program Power.java that let you enter two 
  * numbers a,b, and that prints out ab
  * @author: B. Yu
  */
  
  public void run() {
    
    // variables
    double dblPower;
    double dblBase;
    double dblResult;

    // input
    dblPower = readDouble("What is power?: ");
    dblBase = readDouble("what is base?; ");

    // Calculate
    dblResult = Math.pow(dblBase, dblPower);

    // output
    System.out.println(dblBase + " to the power of " + dblPower + " is " + dblResult);
  }
}