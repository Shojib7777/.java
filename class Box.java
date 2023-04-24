import java.util.Scanner;
class Box
{
   double w;
   double h;
   double d;
Box()
{
    w=-1;
    h=-1;
    d=-1;
}
Box(double a,double b, double c)
}
   w=a;
   h=b;
   d=c;
}
   Box(double len)
{
   w=h=d=len;
}
   Box(Box ob)
{
    w=ob.w;
    h=ob.h;
    d=ob.d;
}
    double volume()
{
      return w*h*d;
}
}
class BoxWeight extends Box
{
 double weight;
 BoxWeight(double a,double b,double c,double d)
{
w=a;
h=b;
d=c;
weight=d;
}
}
class Inheritance2
{
 public static void main(String args[])
{
BoxWeight b1=new BoxWeight(10,20,30,56);
BoxWeight b2=new BoxWeight(110,120,130,156);

System.out.println("Volume of Box1: "+b1.volume());
System.out.println("Volume of Box1: "+b1.Weight());

System.out.println("Volume of Box2: "+b1.volume());
System.out.println("Volume of Box2: "+b1.Weight());
}
}
class Boxcolour
{
String col;
Boxcolour(double a,double b,double c,String d)
{
W=a;
h=b;
d=c;
col=d;
}
}
Boxcolour b3=new Boxcolour(48.6,15.2,19.8,"Red");
Boxcolour b4=new Boxcolour(5.6,5.9,8.2,"Brown");

System.out.println("Volume of b3:" b3 Volume());
System.out.println("colour of b3:" b3 colour());

System.out.println("Volume of b4:" b4 Volume());
System.out.println("colour of b4:" b4 colour());
}
}



