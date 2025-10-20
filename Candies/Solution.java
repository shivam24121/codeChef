import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n*2];
            for(int i=0;i<n*2;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            boolean fl=true;
            Map<Integer,Integer>map=new HashMap<>();
            for(int i:a){
                map.put(i,map.getOrDefault(i,0)+1);
                if(map.get(i)>2){
                    fl=false;
                    break;
                }
            }
            System.out.println(fl?"Yes":"No");
        }

	}
}
