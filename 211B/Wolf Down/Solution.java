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
		    
		    int res=0;
		    
		    for(int i=0;i<s.length();i++){
		        char c=s.charAt(i);
		        if(c!='1'){
		            res++;
		        }
		        else{
		            break;
		        }
		    }
		    System.out.println(res);
		}
		

	}
}
