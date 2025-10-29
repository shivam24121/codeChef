import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static class Pair{
        int data;
        int idx;
        Pair(int x,int y){
            this.data=x;
            this.idx=y;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0){
		    int n=obj.nextInt();
		    Pair[] a=new Pair[n];
		    for(int i=0;i<n;i++){
		        a[i]=new Pair(obj.nextInt(),i);
		    }
		    Arrays.sort(a,Comparator.comparingInt(x->x.data));
		    
		    long[] res=new long[n];
		    res[a[0].idx]=-1;
		    res[a[n-1].idx]=-1;
		    
		    for(int i=1;i+1<n;i++){
		        long l=((long)a[i-1].data+a[i].data)/2;
		        long r=((long)a[i].data+a[i+1].data)/2;
		        
		        long ll=l+1;
		        long rr=r;
		        
		        long temp=rr-ll+1;
		        if(temp<0){
		            temp=0;
		        }
		        res[a[i].idx]=temp;
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(res[i]+" ");
		    }
		    System.out.println();
		}

	}
}
