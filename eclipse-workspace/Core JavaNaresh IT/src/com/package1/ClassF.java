package com.package1;

public class ClassF
{
int i;
byte b;
short s;
long l;

float f;
double d;

char c;

boolean flag;
void meth1()
{
System.out.println("Printing the defult value of 8 PDT");
System.out.println("int default value:"+i);
System.out.println("vyte defult value:"+b);
System.out.println("short defult value:"+s);
System.out.println("long defult value:"+l);
System.out.println("float defult value:"+f);
System.out.println("double defult value:"+d);
System.out.println("char defult value:"+c);//u0000===npc
System.out.println("bolean defult value:"+flag);
}
void meth2()
{
System.out.println("meth2()called");
int a=10;
int b=20;
int c=a+b;
System.out.println("value:"+c);
byte b1=10;//byte=====-127to128
byte b2=10;
byte b3=(byte)(b1+b2);//10+10=20
System.out.println("b3 value:"+b3);
float f=10.9F;
System.out.println("float value:"+f);
long x=21474948L;
System.out.println("long value:"+x);

}
public static void main(String[] args) {
	ClassF aobj=new ClassF();
	aobj.meth1();
	System.out.println("============================");
	aobj.meth2();
}
}
