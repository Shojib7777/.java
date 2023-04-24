impot java.utill.Scanner;
class StringMain
{
public static voidmain(Stringargs[])
 {
   String Builder s1=new String Builder();
   String Builder s2=new String Builder("java");
   String Builder s3=new String Builder(20);
   s1.append("Language");
   System.out.println(s1);
   s1.insert(1,"xyz");
   System.out.println(s1);
   s1.replace(1,3,".");
   System.out.println(s1);
   s1.delete(1,3);
   System.out.println(s1);
   s1.reverse();
   System.out.println(s1);
  }
}



