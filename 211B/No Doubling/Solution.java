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
		    StringBuilder sb=new StringBuilder();
		    int n=obj.nextInt();
		    TreeMap<Long,Integer> map=new TreeMap<>();
		    for(int i=0;i<n;i++){
		        long val=obj.nextLong();
		        map.put(val,map.getOrDefault(val,0)+1);
		    }
		    long sum=0;
		    
		    for(int i=0;i<n;i++){
		        Long curr;
		        Long max=map.lastKey();
		        
		        if(!max.equals(sum)){
		            curr=max;
		        }
		        else{
		            Long min=map.lowerKey(sum);
		            curr=(min!=null)?min:max;
		        }
		        sb.append(curr).append(" ");
		        
		        int ct=map.get(curr);
		        if(ct==1)map.remove(curr);
		        else{
		            map.put(curr,ct-1);
		        }
		        sum+=curr;
		    }
		    System.out.println(sb.toString());
		}
	}
}
