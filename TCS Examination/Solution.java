import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    int dragon=0,sloth=0;
		    StringTokenizer st=new StringTokenizer(br.readLine());
		    int[] d=new int[3];
		    for(int i=0;i<3;i++){
		        d[i]=Integer.parseInt(st.nextToken());
		        dragon+=d[i];
		    }
		    st=new StringTokenizer(br.readLine());
		    int[] s=new int[3];
		    for(int i=0;i<3;i++){
		        s[i]=Integer.parseInt(st.nextToken());
		        sloth+=s[i];
		    }
		    if(dragon>sloth || dragon==sloth && d[0]>s[0] ||
		       dragon==sloth && d[0]==s[0] &&d[1]>s[1]){
		        System.out.println("DRAGON");
		    }
		    else if(dragon==sloth && d[0]==s[0] && d[1]==s[1] && d[2]==s[2]){
		        System.out.println("TIE");
		    }
		    else{
		        System.out.println("SLOTH");
		    }
		}

	}
}
