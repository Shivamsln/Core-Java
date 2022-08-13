package com.package1;

public class ClassE
{
int a=10;//Instance Variable
int x;//
static int y;//static variable

boolean flag;//
void meth1()
{
System.out.println("meth1()called");
int c=30;//
System.out.println("instance variable a:"+a);
System.out.println("Static variable a:"+y);//inspite of calling y you called b
System.out.println("Local variable:"+c);
}
void meth2()
{
System.out.println("meth2() called");
int c;//Local Variable
System.out.println("Instance variable x:"+x);
System.out.println("instance variable flag:"+flag);
System.out.println("Static variable:"+y);
}
void meth3()// no semocolon is neeeded after method
{
System.out.println("meth3()called");
int a=100;
int b=200;
int c=30;
System.out.println("Instance Variable a:"+ new ClassE().a);//intance vaeiable cant be called by the class name
System.out.println("Static Variable b:"+ClassE.y);//inspite of calling y you called b
System.out.println("Local Variable a:"+a);
System.out.println("Local Variable b:"+b);
System.out.println("Local Variable c:"+c);
}
public static void main(String[] args)
{
ClassE aobj=new ClassE();
aobj.meth1();
System.out.println("=========================");
aobj.meth2();
System.out.println("=========================");
aobj.meth3();
}
}
