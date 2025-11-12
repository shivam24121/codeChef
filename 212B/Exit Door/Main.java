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
		    ArrayList<Integer>list=new ArrayList<>();
		    for(int i=0;i<n;i++){
		        list.add(obj.nextInt());
		    }
		    int ans=0;
		    
		    for(int i=n;i>=1;i--){
		        int x=list.indexOf(i);
		        ans+=Math.min(x,list.size()-x-1);
		        list.remove(x);
		    }
		    System.out.println(ans);
		}

	}
}
