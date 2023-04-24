import java.util.Scanner;
class infer
{
  int num1;
  int num2;
  infer()
  {
    }
int calculate()
{
      int multiply=num1*num2;
      return(multiply);
      }
}
class MainInfer
{
   public static void main(String args[])  
   {
       infer i=new infer();
       int result=calculate();
       System.out.println(result);
