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
		    int[][] a=new int[n][n];
		    
		    StringBuilder sb=new StringBuilder();
		    
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            a[i][j]=obj.nextInt();
		            
		            if(i==j){
		                sb.append(a[i][i]/2+" ");
		            }
		        }
		    }
		    System.out.println(sb.toString());
		}
	}
}
