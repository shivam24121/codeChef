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
            String s=obj.next();
            
            int ct0=0,ct1=0;
            
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='0' && s.charAt(i+1)=='0')ct0++;
                if(s.charAt(i)=='1' && s.charAt(i+1)=='1')ct1++;
            }
            if(ct1>=ct0)System.out.println(0);
            else{
                System.out.println((ct0-ct1+1)/2);
            }
        }
	}
}
