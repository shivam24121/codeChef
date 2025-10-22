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
		    
		    boolean fl=true;
		    String[] str=s.split("0");
		    
		    int block=0;
		    String res="";
		    
		    for(String i:str){
		        if(!i.isEmpty()){
		            block++;
		            res=i;
		        }
		    }
		    if(block==1 && (res.length()==2 ||res.length()==3)){
		        fl=false;
		    }
		    System.out.println(fl?"YES":"NO");
		}

	}
}
