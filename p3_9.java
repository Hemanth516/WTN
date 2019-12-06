import java.lang.*;
import java.util.*;
class P3_9
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
int s,d,sum;
s=0;
d=0;
sum=0;
for(i=0;i<n;i++)
{
if(a[i]==6)
	{s=i;
}
if(a[i]==7)
{	d=i;
}
}


for(i=0;i<n;i++)
{
if(s<d)
{
if(i<s||i>d)
sum=sum+a[i];
}
if(s>d)
sum=sum+a[i];
}
System.out.println(sum);
}
}
© 2019 GitHub, Inc