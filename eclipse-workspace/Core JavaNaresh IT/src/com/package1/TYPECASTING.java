package com.package1;

public class TYPECASTING 
{
void implicit()
{
System.out.println("Performing implicit Type Casting");
byte b=20;
int i=b;
System.out.println("byte value:"+b);
System.out.println("int value:"+i);
System.out.println("----------------------------------");
char c='A';
int x=c;
System.out.println("char value:"+c);//A
System.out.println("int value:"+x);//65
}
int meth1()
{
System.out.println("meth1 ()called");
System.out.println("int & char both are compatable");
return'A';//65=====ASCI value of A
}
void explicit()
{
System.out.println("Implementing Explicit Typecasting");
int i=50;
byte b1=(byte)i;
System.out.println("int value:"+i);//50
System.out.println("byte value:"+b1);//50
System.out.println("--------------------------------------");
int x=500;
byte b2=(byte)x;
System.out.println("int value:"+x);//500
System.out.println("byte value:"+b2);//-12
//minimum range+(result-maximum range-1)
//-128+(500-127-1)=244
//-128+(244-127-1)=-12
System.out.println("-------------------------------------");
float f=10.9999f;
byte b3=(byte)f;
System.out.println("float value:"+f);//10.0007
System.out.println("byte value:"+b3);//10
}
public static void main(String[] args) 
{
	TYPECASTING aobj=new TYPECASTING();
	aobj.implicit();
	System.out.println(aobj.meth1()+'A');
	System.out.println("---------------------------------");
	System.out.println(aobj.meth1()+'A');
	System.out.println("----------------------------------");
	aobj.explicit();
}
}

