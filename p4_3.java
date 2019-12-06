import java.util.*;
class p4_3
{
double w,h,d;
Box(double w,double h,double d){
this.w=w;
this.h=h;
this.d=d;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double wi=sc.nextDouble();
double de=sc.nextDouble();
double he=sc.nextDouble();
Box b=new Box(wi,he,de);
double r=b.vol(b.w,b.h,b.d);
System.out.println("the volume of box "+r);
}
double vol(double w,double h,double d)
{

return (w*d*h);
}
}