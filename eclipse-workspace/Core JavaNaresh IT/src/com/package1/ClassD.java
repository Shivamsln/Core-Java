package com.package1;

public class ClassD
{
int meth1()
{
System.out.println( "meth1() called");
return 100;
}
public static void main(String[] args)
{
	ClassD aobj1=new ClassD();
	ClassD aobj2=new ClassD();
	//int aobj1 Object hashCode = aobj1.hashCode();
	//int aobj2 Object hashCode = aobj2.hashCode();
	//System.out.println("aobj1 hashCode:"+aobj1 hash code);
	//System.out.println("aobj2 hashCode:" +aobj hash code);
	System.out.println("=====================================================================================================");
	System.out.println("aobj1.equals(aobj2)");//false
	System.out.println("aobj1.equals(aobj1)");//true
    System.out.println("aobj1.equals(aobj1)");//true
    System.out.println("====================================================================================================");
    System.out.println(aobj1.getClass());
    System.out.println(aobj2.getClass());
    System.out.println("======================================================================================================");
    System.out.println(aobj1.toString());
    System.out.println(aobj2.toString());
    
}
}
