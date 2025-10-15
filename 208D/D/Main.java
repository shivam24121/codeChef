import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        int n=Integer.parseInt(br.readLine());
	        StringTokenizer st=new StringTokenizer(br.readLine());
	        int[] a=new int[n];
	        int m1=-1,m2=-1;
	        int max=0;
	        
	        for(int i=0;i<n;i++){
	            int x=Integer.parseInt(st.nextToken());
	            a[i]=x;
	            max=Math.max(max,x);
	        }
	        
	        int ct1=0,ct2=0;
	        for(int i:a){
	            if(i==max)ct1++;
	            if(i==max-1)ct2++;
	        }
	        
	        int ans=0;
	        if(ct1>=2)ans=ct1-1;
	        else if(ct2==n-1)ans=max-2;
	        else ans=max-1;
	            
	        System.out.println(ans);
	    }
	}
}
