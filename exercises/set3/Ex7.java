//package comp1721.exercises;
import java.util.*;
import java.lang.Math.*;

public class Ex7 {
public static void main (String[] args)
{
Circle defaultCircle = new Circle();

System.out.println("The area of the circle where radius = " + defaultCircle.getRadius() + " is: " + defaultCircle.getArea());
System.out.println("The perimeter of the circle where radius = " + defaultCircle.getRadius() + " is: " + defaultCircle.getPerimeter());

Circle testCircle = new Circle(3.5);
System.out.println("The area of the circle where radius = " + testCircle.getRadius() + " is: " + testCircle.getArea());
System.out.println("The perimeter of the circle where radius = " + testCircle.getRadius() + " is: " + testCircle.getPerimeter());

}
}

