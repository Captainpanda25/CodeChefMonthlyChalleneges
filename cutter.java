import java.util.*;
public class cutter {

	public static void main(String[] args) {
		long T,N,i,j,c;
		Scanner in =new Scanner(System.in);
		T=in.nextLong();
		for(i=0;i<T;i++)
		{
			c=0;
			N=in.nextLong();
			long[] a=new long[(int) N];
			for(j=0;j<N;j++)
			{
				a[(int) j]=in.nextLong();
			}
			Arrays.sort(a);
			for(j=N-1;j>0&&a[(int) j]!=0;j--)
			{
				if(a[(int) j]!=a[(int) (j-1)])
					c++;
			}
			if(a[0]!=0)
			c++;
			System.out.println(c);
		}
	
	}

}
