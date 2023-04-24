import java.util.Scanner;
class ExceptionHandling
{
  public static void main(String args[])
 {
  try
   {   
     int x=125/0;
     System.out.println(x);
}
 catch(NullpointerException e)
{
  System.out.println("Exception");
 }
 finally 
  {
    System.out.println("Done");
   }
}
}
 