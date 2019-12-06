mport java.lang.*;
class Calculator
{
public static void main(String args[])
{
Calculator cal=new Calculator();
double r=c.powerInt(2,5);
System.out.println(r);
double d=cal.powerDouble(2.5f,5.5f);
System.out.printf("%.2f",d);
}
double powerInt(double n1,int n2)
{
return (Math.pow(n1,n2));
}

double powerDouble(double num1,double num2)
{
return (Math.pow(num1,num2));
}
}
