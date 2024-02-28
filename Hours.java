class Hours extends ConsoleProgram {

  /**
  * A program Hours.java that lets you enter a number of 
  * hours, and that converts it to days and hours.
  * @author: B. Yu
  */
  
  public void run() {
    
    // naming variables
    double dblHours;
    int intDays;
    int intExtraHours;
  
    // calculations
    // Inline comments can be more detailed (ex: Get the number of hours from the user)
    dblHours = readDouble ("Hours: ");

    // Converting the number of hours to days 
    intDays = (int) dblHours / 24;
    intExtraHours = (int) dblHours % 24;
  
    // printing
    System.out.println(intDays + " days and " + intExtraHours + " hours.");
  }
}