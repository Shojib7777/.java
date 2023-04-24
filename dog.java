import java.util.Scanner;
public class Dog
{
    protected String name;
Dog(String n)
{
name=n;
}
String getname()
{
return name;
}
String speaks()
{
return "bark";
}
}
public class Labrador extends Dog
{
   private String color;
   private int weight;
   Labrador(String n,String c, int w)
{
String speak() 
{
return "Woof";
}

int breedWeight()
 {
return weight;
}

String printColor()
 {
return color;
}
   