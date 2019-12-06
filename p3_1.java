import java.util.*;
class p3_1
{
public static void main(String argv[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i,sum=0,avg=0;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
avg=sum/n;
System.out.println("The sum of the array is:"+sum);
System.out.println("The average of the array is:"+avg);
}
}