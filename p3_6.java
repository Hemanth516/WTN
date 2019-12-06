import java.lang.*;
class P3_6
{
public static void main(String args[])
{
int a[]={5,6,3,2,0};
int i,j;
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
System.out.println(a[i]);
}
}
}