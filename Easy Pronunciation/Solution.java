import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    String s=br.readLine();
		    System.out.println(solve(s,n)?"YES":"NO");
		}
	}
	public static boolean solve(String s, int n){
	    int ct=0;
	    String v="aeiou";
	    for(int i=0;i<n;i++){
	        char c=s.charAt(i);
	        if(v.indexOf(c)!=-1){
	            ct=0;
	        }
	        else{
	            ct++;
	            if(ct>=4)return false;
	        }
	    }
	    return true;
	}
}
