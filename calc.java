feature2
import java.util.Scanner;

public class MathOperations {
	    public static void main(String[] args) {
		            Scanner scanner = new Scanner(System.in);

			          System.out.print("Enter first number: ");
				                  double num1 = scanner.nextDouble();
				                          
				                                  System.out.print("Enter second number: ");
				                                       double num2 = scanner.nextDouble();
				  				                       		                                                           double multiplication = num1 * num2;
				                                                                   double division = num2 != 0 ? num1 / num2 : Double.POSITIVE_INFINITY; // Avoid division by zero
				  				                                                                      
				                                                                                     System.out.println("Multiplication result: " + multiplication);
				                                                                                             if (num2 != 0) {
				                                                                                                         System.out.println("Division result: " + division);
				                                                                                                                 } else {
				                                                                                                                          System.out.println("Division by zero is not allowed.");
				                                                                                                                                  }
				  
				                                                                                                                                        scanner.close();
				                                                                                                                                            }
				                                                                                                                                               }
				  

 start code using functions
 public class Calc {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
    }
}

