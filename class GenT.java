class Gen<T>
{
    T num;
    Gen()
  {
  
  }
  Gen(T x)
  {
     num=x;
  }
  T print()
  {
   return num;
  }
}
claa GenericclassDemo
{
  public static void main(String[]args)
  {
    Gen<Integer>obj1=new Gen<Integer>(20);
    System.out.println(obj1.print());
   
   Gen<Integer>obj1=new Gen<Integer>(20);
    System.out.println(obj1.print()); 
   
 }
}


   
