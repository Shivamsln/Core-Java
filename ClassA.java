public class ClassA
 {
  int meth1() 
   {
System.out.println("10");
return new ClassA().meth2()+1;//99+1
  }
  int meth2()//meth1
  {
    System.out.println("20");
    return 99;
  }
  public static void main(String[]args)
  {
    System.out.println(new ClassA().meth1()-99);//100-99
  }
}
