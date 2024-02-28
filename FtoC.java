class FtoC extends ConsoleProgram {

  /**
  * Program that converst Fahrenheit to Celsius.
  * @author: B. Yu
  */
  
  public void run() {
    
    // Define the variables
    double dblDegreeinFahrenheit;
    int intDegreeinCelsius;

    // Get the degree in farenheit from the user
    dblDegreeinFahrenheit = readDouble("Enter a degree measure in Fahrenheit: ");

    // Convert farenheit to celsius
    intDegreeinCelsius = ((int)dblDegreeinFahrenheit - 32) * 5 / 9; // Add white space between arithmetic operators

    // Output the result
    System.out.println("c = " + intDegreeinCelsius);
  }
}