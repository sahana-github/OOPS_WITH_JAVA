/*
Create a Circle class with following members.
A data member that stores the radius of a circle.
A constructor function with an argument that initializes the radius
A function that computes and returns area of a circle
Create two derived classes Sector and Segment that inherit the Circle class. Both classes
inherit radius and the function that returns the circle’s area from Circle.
In addition to the members inherited from Circle, Sector and Segment have some specific
members as follows:
Sector
1. A data member that stores the control angle of a sector (in radians)
2. A constructor function with arguments that initialize radius and angle
3. A function that computes and returns the area of a sector
Segment
1. A data member that stores the length of a segment in a circle
2. A constructor function with arguments that initialize radius and length
3. A function that computes and returns the area of a segment
Create the main () function to instantiate an object of each class and then call appropriate
member functions to compute and return the area of a circle, sector and segment.
Note :Area_of_circle = pi * r 2
Area_of_Sector=(1/2) r 2 *θ
Area_of_segment= r2
*((r-h)/r) – (r-h) (2rh-h
2
)
1/2 Where r is the radius of a circle, θ is the
central angle of a sector in radians, h is the length of a segment and ((r-h)/r) is in radians.

*/

import java.util.Scanner;
import java.lang.Math;
class Circle{

    double radius;

    Circle(){
        radius = 0;
    }
    Circle(double r){
        radius = r;
    }
    double Circle_area(){
        return (Math.PI * radius *radius);
    }
}

class Sector extends Circle{

    double angle;
    Sector(double a, double r){
        angle = a;
        radius = r;
    }

    Sector(){
        angle = 0;
        radius = 0;
    }
    double Sector_area(){
        return (0.5*radius*radius*angle);
    }
}

class Segment extends Circle{

    double length;
    Segment(){
        radius = 0;
        length = 0;
    }
    Segment(double l,double r){
        radius = r;
        length = l;
    }
    double Segment_area(){
        double h = radius - Math.pow(Math.pow(radius, 2) - Math.pow((length / 2), 2), 0.5);
        return ((h / (6 * length)) * ((3 * h * h) + (4 * length * length)));
    }
}

class Q8_Inheritance{

    public static void main(String[] args){
        double a,r,l;
        int ch;
            Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("--------------------------------------------");
            System.out.println("1. Area of circle");
            System.out.println("2. Area of sector of circle");
            System.out.println("3. Area of segment of circle");
            System.out.println("4. Exit!");
            System.out.println("--------------------------------------------");

            System.out.println("Enter your choice?");
            ch = sc.nextInt();

            switch(ch){

                case 1:
                        System.out.println("Enter the radius of the circle");
                        r = sc.nextDouble();
                        Circle c = new Circle(r);
                        System.out.println("The area of the circle is: "+ c.Circle_area());
                        break;

                case 2:
                        System.out.println("Ennter the radius of the circle");
                        r = sc.nextDouble();
                        System.out.println("Enter the angle of sector in radians");
                        a = sc.nextDouble();
                        Sector s1 = new Sector(a,r);
                        System.out.println("The area of the segment of the circle is: "+s1.Sector_area());
                        break;

                case 3:
                        System.out.println("Enter the radius of the circle");
                        r = sc.nextDouble();
                        System.out.println("Enter the length of segment of the circle");
                        l = sc.nextDouble();
                        Segment s2 = new Segment(l,r);
                        System.out.println("The area of the segment of the circle is: "+s2.Segment_area());
                        break;
                
                case 4:
                        System.exit(0);
                        break;

                default:
                        System.out.println("Invalid choice!!");
            }
        }
    }
}
