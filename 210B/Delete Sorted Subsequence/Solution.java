import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner obj=new Scanner(System.in);
        int tt=obj.nextInt();
        //StringBuilder sb=new StringBuilder();
        while(tt-->0){
            int n=obj.nextInt();
            String s=obj.next();
            
            int mid=0;
            int temp=0;
            
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                if(c=='0'){
                    mid++;
                }
                else{
                    if(mid>0)mid--;
                    else{
                        temp++;
                    }
                }
            }
            int t=mid;
            int res=0;
            if(temp==0 && t==0){
                res=0;
            }
            else if(temp==0 || t==0){
                res=1;
            }
            else{
                res=2;
            }
            System.out.println(res);
        }
                //temp=Math.min(temp,mid);
        //     }
        //     if(mid==0 && temp==0){
        //         sb.append(0);
        //     }
        //     else if(temp==0 || mid<0){
        //         sb.append(1);
        //     }
        //     else{
        //         sb.append(2);
        //     }
        //     //int res=Math.max(-temp,0)+ Math.max(0,mid);
        //     //System.out.println(res);
        //     sb.append("\n");
        // }
        //System.out.println(sb.toString());
	}
}
