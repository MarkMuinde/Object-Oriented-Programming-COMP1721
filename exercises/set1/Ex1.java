import java.util.Scanner;

class Ex1 {
//This program converts degrees celsius to degrees farenheit
public static void main (String[] args) {
System.out.print("Enter  a temperature in degrees celsius:");
Scanner input = new Scanner(System.in);
double temperatureCelsius=input.nextDouble();
double temperatureFarenheit=temperatureCelsius*4.056 + 32;
System.out.printf("%.2f degrees celsius = %.2f degrees farenheit\n", temperatureCelsius, temperatureFarenheit);
}
}
