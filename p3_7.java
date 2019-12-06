import java.util.*;
class P3_7
{
public static void main(String args[])
{
int a[]={2,2,4,5,1,0,4,1};
int i,j;
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
a[j]=0;
}
if(a[i]!=0)
System.out.print(+a[i]+",");
}
}
}