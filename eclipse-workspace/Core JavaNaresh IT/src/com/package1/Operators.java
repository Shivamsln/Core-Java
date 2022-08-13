package com.package1;

public class Operators
{
int a=10;
void meth1()
{
System.out.println(++a);
a++;
System.out.println(++a);
System.out.println(a++);
System.out.println(--a);
System.out.println(a--);
System.out.println(a);
}
public static void main(String[] args)
{
new Operators().meth1();	
}
}
