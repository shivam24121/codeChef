import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0){
		    int n=obj.nextInt();
		    
		    int neg=0;
		    int idx=-1;
		    
		    int[] a=new int[n];
		    
		    for(int i=0;i<n;i++){
		        a[i]=obj.nextInt();
		        if(a[i]<0)neg++;
		        if(idx==-1){
		            idx=i;
		        }
		    }
		    
		    if(neg==0){
		        System.out.println("Bob");
		        continue;
		    } 
		    if(neg%2==1){
		        System.out.println("Alice");
		        System.out.println(idx+1+" "+n);
		    }
		    else{
		        System.out.println("Bob");
		    }
		}

	}
}
