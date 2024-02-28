class FtoC extends ConsoleProgram {

  /**
  * Program that converst Fahrenheit to Celsius.
  * @author: B. Yu
  */
  
  public void run() {
    
    // Define the variables
    double dblDegreeinFahrenheit;
    int intDegreeinCelsius;

    // Get the degree in farenheit from the user and convert it to celsius
    dblDegreeinFahrenheit = readDouble("Enter a degree measure in Fahrenheit: ");
    intDegreeinCelsius = ((int)dblDegreeinFahrenheit - 32) *5/9;

    // Output the result
    System.out.println("c = " + intDegreeinCelsius);
  }
}