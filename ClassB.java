public class ClassB
 {
  int meth1(int a,int b)
  {
    System.out.println(a);
    System.out.println(a-b);
    return new ClassB().meth4(a-1,"HI");//199
  }
  String meth2(int x)
  {
    System.out.println(x-new ClassB().meth1(200,199));
    System.out.println(x);
    return"Java";
  }
  String meth3(int a,int b,String s)
  {
    System.out.println(a);
   System.out.println(a+a);
   System.out.println(a+b);
    return s;//30
  }
  int meth4(int a,String s)
  {
    System.out.println(a);
    System.out.println(s);
    return a+a;//199+199=398
  }
  String meth5(String s)
  {
    return s;
  }
  public static void main(String[]args)
  {
    System.out.println(new ClassB().meth5(new ClassB().meth3(15,25,new ClassB().meth2(500))));
  }

}
