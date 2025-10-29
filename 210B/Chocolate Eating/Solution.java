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
		    long a=obj.nextLong();
		    long b=obj.nextLong();
		    System.out.println((a!=b)?a+b:a+b-1);
		}

	}
}
