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
		    int w=obj.nextInt();
		    int p=obj.nextInt();
		    int k=obj.nextInt();
		    int temp=Math.min(w,k);
		    int res=k-temp;
		    System.out.println(temp*2+res);
		}

	}
}
