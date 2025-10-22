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
		    obj.nextLine();
		    String s=obj.nextLine();
		    
		    int ct=0;
		    for(int i=1;i<n;i++){
		        if(s.charAt(i)!=s.charAt(i-1)){
		            ct++;
		        }
		    }
		    System.out.println(ct>=2?"Alice":"Bob");
		}

	}
}
