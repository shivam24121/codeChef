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
		    int k=Integer.parseInt(st.nextToken());
		    
		    int extra=0;
		    boolean fl=true;
		    st=new StringTokenizer(br.readLine());
		    for(int i=0;i<n;i++){
		        int x=Integer.parseInt(st.nextToken());
		        
		        if(x>=k){
		            extra+=x-k;
		        }
		        else{
    		        if(x+extra>=k){
    		            extra-=k-x;
    		        }
    		        else{
    		            System.out.println("NO "+(i+1));
    		            fl=false;
    		            break;
    		        }
    		    }
		    }
		    if(fl){
		        System.out.println("YES");
		    }
		}

	}
}
