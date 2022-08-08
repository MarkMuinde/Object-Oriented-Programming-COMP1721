//package comp1721.exercises;
import java.util.*;
import java.lang.Math.*;

public class Circle{
private double radius;

public Circle (){
    this.radius = radius;
    radius=1.0;
}

public Circle (double r){
    radius = r;
}

//function that gets area
public double getArea(){
    double area = Math.PI * radius * radius; //area
    return area;
}

//function that gets perimeter
public double getPerimeter(){
    double perimeter = 2 * Math.PI * radius;
    return perimeter;
}

//function that gets radius
public double getRadius(){
    return radius;
}

public void makeRadius(double newRadius){
    radius = newRadius;
}
}