import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        StringTokenizer st=new StringTokenizer(br.readLine());
	        int n=Integer.parseInt(st.nextToken());
	        int x=Integer.parseInt(st.nextToken());
	        int k=Integer.parseInt(st.nextToken());
	        Integer[] a=new Integer[n];
	        st=new StringTokenizer(br.readLine());
	        for(int i=0;i<n;i++){
	            a[i]=Integer.parseInt(st.nextToken());
	        }
	        int potential=x+100*k;
	        int ct=0;
	        Arrays.sort(a,Collections.reverseOrder());
	        for(int i=k;i<n;i++){
	            if(a[i]>potential){
	                ct++;
	            }
	        }
	        System.out.println(ct+1);
	    }
	}
}
