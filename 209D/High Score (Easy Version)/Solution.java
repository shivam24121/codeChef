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
		    int m=obj.nextInt();
		    
		    Map<Integer,Integer>map=new HashMap<>();
		    long aa=0,bb=0;
		    int[] a=new int[n];
		    int[] b=new int[n];
		    
		    for(int i=0;i<n;i++){
		        a[i]=obj.nextInt();
		        aa+=a[i];
		        map.put(a[i],map.getOrDefault(a[i],0)+1);
		    }
		    
		    for(int i=0;i<n;i++){
		        b[i]=obj.nextInt();
		        bb+=b[i];
		        map.put(b[i],map.getOrDefault(b[i],0)+1);
		    }
		    
		    System.out.println(solve(n,a,b,aa,bb,map));
		}

	}
	public static long solve(int n,int[] a,int[] b,
	                       long aa,long bb,Map<Integer,Integer>map){
	    int key=0;
	    int val=0;
	    
	    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
	        if(entry.getValue()>val){
	            key=entry.getKey();
	            val=entry.getValue();
	        }
	    }
	    int temp=Math.max(val-n,0);
	    return temp==0?aa+bb:(aa+bb)-2L*temp*key;
	}
}
