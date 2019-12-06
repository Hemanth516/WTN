import java.util.*;
class p3_2
{
public static void main(String argv[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i,max,min;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
max=a[0];
min=a[0];
for(i=0;i<n;i++)
{
if(a[i] > max)
{
 max = a[i];
}
if(a[i] < min)
{
 min = a[i];
}
}
System.out.println("The maximum element in array:"+max);
System.out.println("The minimum element in array:"+min);
}
}