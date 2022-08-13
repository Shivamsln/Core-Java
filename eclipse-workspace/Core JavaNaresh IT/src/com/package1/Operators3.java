package com.package1;

public class Operators3
{
void meth1()
{
int a=10;
int b=a++ + ++a;
System.out.println("a value:"+a);
System.out.println("b valu:"+b);
}
public static void main(String[] args) {
	new Operators3().meth1();
}
}
