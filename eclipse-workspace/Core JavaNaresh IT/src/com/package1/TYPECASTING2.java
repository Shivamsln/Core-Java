package com.package1;

public class TYPECASTING2
{
void Implicit()
{
byte b=10;
System.out.println("byte value is"+b);//10
short s=b;
System.out.println("short value is"+s);//10
s++;//10==11
int i=s++;//11===12
System.out.println("int value is"+i);//11
System.out.println("short values is"+s);
long l=i;
System.out.println("long value is"+(--l));
float f=l;
System.out.println("The value of float is"+(f+b));
double d=(--f);
System.out.println("The value of double is"+d);
show();
if(!(d==f))
{
System.out.println("equal");	
}
else
{
System.out.println("not equal");

}
}
public static void main(String[] args)
{
TYPECASTING2 a=new TYPECASTING2();
a.Implicit();

}
static void show()
{
char c='A';
int a=++c;
System.out.println(a);
TYPECASTING2 obj=new TYPECASTING2();
String s=obj.meth1();
System.out.println(s);
}
String meth1()
{
String s="Implicit casting is done by the compiler automatically";
return s;
}
}
