import java.util.Scanner;
public class Shape
 {
    protected double dimension1;
    protected double dimension2;
    
    public Shape(double d1, double d2)
 {
        dimension1 = d1;
        dimension2 = d2;
    }
    
    public double area() 
{
        System.out.println("Area of shape is undefined");
        return 0.0;
    }
}

public class Rectangle extends Shape
 {
    public Rectangle(double length, double width) 
{
        super(length, width);
    }
    
    public double area() 
{
        double rectArea = dimension1 * dimension2;
        System.out.println("Area of rectangle is " + rectArea);
        return rectArea;
    }
}

public class Triangle extends Shape
 {
    public Triangle(double base, double height)
 {
        super(base, height);
    }
    
    public double area()
 {
        double triArea = 0.5 * dimension1 * dimension2;
        System.out.println("Area of triangle is " + triArea);
        return triArea;
    }
}

public class Main
 {
    public static void main(String[] args)
 {
        Shape s1 = new Shape(10, 20);
        s1.area();
        
        Rectangle r1 = new Rectangle(5, 10);
        r1.area();
        
        Triangle t1 = new Triangle(6, 8);
        t1.area();
    }
}