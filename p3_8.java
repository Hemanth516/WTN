import java.util.*; 
  
class P3_8 
{   
public static void main (String[] args) {  
Scanner sc=new Scanner(System.in);
int i;
        int n =sc.nextInt(); 
int arr[]=new int[n];
for(i=0;i<n;i++)
arr[i]=sc.nextInt();;       
        Arrays.sort(arr); 
        int mc = 1, r = arr[0]; 
        int cc = 1;
          
        for (i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                cc++; 
            else 
            { 
                if (cc > mc) 
                { 
                    mc=cc; 
                    r = arr[i - 1]; 
                } 
                cc = 1; 
            } 
        } 
      
        
        if (cc > mc) 
        { 
            mc = cc; 
            r = arr[n - 1]; 
        } 
      
   System.out.println(r);
 }
} 
