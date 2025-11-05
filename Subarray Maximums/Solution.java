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
		    String s=obj.next();
		    
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=i+1;
		    }
		    if(s.charAt(0)=='0' || s.charAt(n-1)=='0'){
		        System.out.println("-1");
		        continue;
		    }
		    for(int i=0;i<n;i++){
		        char c=s.charAt(i);
		        if(c=='0'){
		            int temp=a[i];
		            a[i]=a[i+1];
		            a[i+1]=temp;
		        }
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		}
	}
}
