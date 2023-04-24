import java.util.Scanner;
enum month
{ 
    JANUARY
    FEBRUARY
    MARCH
    APRIL 
    MAY
}
class MainEnum
{
  public static void main(string[]args)
  {
    Month m=Month.JANUARY;
    switch(m)
    {
     case JANUARY
     System.out.println("JANUARY has 31 days");
     break;
    
    case FEBRUARY
     System.out.println("FEBUARY has 28 days");
     break;

     case MARCH
     System.out.println("MARCH has 31 days");
     break;

     case APRIL
     System.out.println("APRIL has 30 days");
     break;
    
     case MAY
     System.out.println("MAY has 31 days");
     break;
     }
  }
}