package com.package1;

public class Constructor
{
void meth1()
{
System.out.println("meth1() called");
return;
}
public Constructor(int i)
{
	System.out.println("Paramaterized ConstructorA:"+i);
	new Constructor();
	return;
}
private Constructor()
{
System.out.println("Default ConstructorA");
return;
}
public static void main(String[] args) 
	{
	Constructor aobj=new Constructor(50);
	aobj.meth1();
	}
	}
	


	


