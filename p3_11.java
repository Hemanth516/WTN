import java.util.*;
class P3_11
{
public static void main(String args[])
{
int n=args.length;
int a[][]=new int[3][3];
int i,j;
if(n!=9)
System.out.println("Please enter 9 integer numbers ");
else
{
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=Integer.parseInt(args[3*i+j]);

}
}
int max;
max=0;
System.out.println("expected array:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
if(a[i][j]>max)
max=a[i][j];
}
System.out.print("\n");
}
System.out.print("The biggest number in the given array is "+max);
}
}
}
© 2019 GitHub, Inc.
Terms
Privacy
Security
Status
Help
