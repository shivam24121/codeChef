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
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=obj.nextInt();
		    }
		    Set<Integer>set=new HashSet<>();
		    int res=0;
		    
		    for(int i:a){
		        if(set.contains(i)){
		            res++;
		            set.clear();
		        }
		        set.add(i);
		    }
		    System.out.println(res);
		}

	}
}
