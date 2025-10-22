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
		    
		    if(n%2==0){
		        System.out.println("YES");
		    }
		    else if(x%2==1){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
