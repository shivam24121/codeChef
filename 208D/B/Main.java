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
	        int temp=n;
	        for(int i=1;i<n;i++){
	           int jump=n-i;
	           if(i%2==0){
	               temp+=jump;
	           }
	           else{
	               temp-=jump;
	           }
	        }
	        System.out.println(temp);
	    }
	}
}
