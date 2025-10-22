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
		    int a=obj.nextInt();
		    int b=obj.nextInt();
		    int even=0,odd=0;
		    
		    for(int i=a;i<=b;i++){
		        if(i%a==0){
		            if(i%2==0){
		                even+=i;
		            }
		            else{
		                odd+=i;
		            }
		        }
		    }
		    System.out.println(even>=odd?"YES":"NO");
		}

	}
}
