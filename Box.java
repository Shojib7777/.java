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
