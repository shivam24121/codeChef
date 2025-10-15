import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		System.out.println((a*30)+(b*60));
	}
}
