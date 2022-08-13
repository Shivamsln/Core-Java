package com.package1;

public class Operators4 
{
void meth1()
{
int a=34;
int b=21;
int c=a++ + ++b;
int d=--a + --b +c--;
int e= a + +b + +c + a--;
int f=-a + b-- + -c - d++ ;
int sum=a+b+c+d+e+f;
System.out.println("sum="+sum);
}
public static void main(String[] args) {
	new Operators4().meth1();
}
}
