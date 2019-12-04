import java.util.*;
class p20
{
public static void main(String a[])
{
int n,m,t,r=0;
Scanner sc=new Scanner(System.in);
do{
System.out.println("1.Add\n2.Sub");
n=sc.nextInt();
System.out.println("Entre the numbers:");
m=sc.nextInt();
t=sc.nextInt();
if(n==1)
System.out.println("The selected option is Addtion and Result is:"+ (m+t));
else
{
if(m>t)
{
r=m-t;
System.out.println("The selected option is Substraction and Result is:"+ r);
}
else
r=t-m;
System.out.println("The selected option is Substraction and Result is:"+ r);
}
}while(n!=0&&n<=2);
}
}