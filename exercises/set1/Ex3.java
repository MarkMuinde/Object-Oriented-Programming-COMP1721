import java.util.*;
import java.lang.Math.*;
class Ex3 {
//this program takes radius and displays the area and perimeter
public static void main (String[] args){
System.out.print("Enter a radius(in metres):");
Scanner input = new Scanner (System.in);
double radius = input.nextDouble();
if (radius==0.0){
    System.out.print("Invalid value!");
}
double area = Math.PI * radius * radius; //area
double perimeter = 2 * Math.PI * radius;

System.out.printf("Perimeter = %.3f %n", perimeter);
System.out.printf("Area = %.3f %n", area);
}
}
