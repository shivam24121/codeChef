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
	        int money=Integer.parseInt(st.nextToken());
	        StringBuilder sb=new StringBuilder();
	        st=new StringTokenizer(br.readLine());
	        for(int i=0;i<n;i++){
    	        int x=Integer.parseInt(st.nextToken());
    	        if(x>money){
    	            sb.append(0);
    	        }
    	        else{
    	            sb.append(1);
    	            money-=x;
    	        }
	        }
	        System.out.println(sb.toString());
	    }
	}
}
