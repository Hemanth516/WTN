import java.util.*;
class P3_10
{
public static void main(String args[])
{
int i,j,k;
int n=args.length;
k=0;
int a[][]=new int[2][2];
if((n%2)!=0)
System.out.println("Please enter even digit integer numbers");
else
{
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=Integer.parseInt(args[2*i+j]);

}
}
System.out.println("expected array:");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.print("\n");
}
System.out.println("reverse array:");
for(i=1;i>=0;i--)
{
for(j=1;j>=0;j--)
{
System.out.print(a[i][j]+" ");

}
System.out.print("\n");
}
}
}
}
© 2019 GitHub, Inc.
Terms
