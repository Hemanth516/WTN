import java.util.*;
class P3_5
{
public static void main(String args[])
{
int a[]={120,7,90,23,670,4,8};
int i,min1,min2,max1,max2;
max1=a[0];
max2=a[1];
min1=a[0];
min2=a[1];
for(i=1;i<a.length;i++)
{
if(a[i]>max1)
{
max2=max1;
max1=a[i];
}
else if (a[i] >max2 && a[i]!=max1)
			{
				max2 = a[i];
			}


if(a[i]<min1)
{
min2=min1;
min1=a[i];
}
else if(a[i]<min2&&a[i]!=min1)
{
min2=a[i];
}

}
System.out.println("the max and min are "+max1+" "+max2+" "+min1+" "+min2);
}
}
© 2019 GitHub, Inc.
Terms
Privacy
