import java.util.*;
import java.lang.*;
class P3_3
{
public static void main(String args[])
{
int a[]={1,4,34,56,7};
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("the search element is "+n);
int f,i;
f=0;
for(i=0;i<a.length;i++)
{
if(n==a[i])
{
f=1;
break;
}
}
if(f==1)
System.out.println(i+1);
else
System.out.println("-1");
}
}