class Minutes extends ConsoleProgram {

  /**
  * A program Minutes.java that lets you enter a number of minutes, and 
  * that will calculate the number of days, hours and minutes that represents.
  * @author: B. Yu
  */
  
  public void run() {
    
    // define the variables
    int intNumberOfMinutes;
    int intNumberOfDays;
    int intNumberOfHours;
    int intLeftOverMinutes;
    int intLeftOverMinutes2;

    // get the number of minutes from the user
    intNumberOfMinutes = readInt("Enter the number of minutes: ");

    // compute days, hours, and minutes
    intNumberOfDays = intNumberOfMinutes / 1440;
    intLeftOverMinutes = intNumberOfMinutes % 1440;
    intNumberOfHours = intLeftOverMinutes / 60;
    intLeftOverMinutes2 = intLeftOverMinutes % 60;

    // print the output
    System.out.println(intNumberOfMinutes + " represents " + intNumberOfDays + " days, " + intNumberOfHours + " hours, and " +  intLeftOverMinutes2 + " minutes.");
  }
}