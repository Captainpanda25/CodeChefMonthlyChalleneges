import java.util.*;
import java.lang.*;
import java.io.*;
public class ceq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T,k,n;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		while(T-->0){
			int bal=0,c=0,i,work=0;
			n=in.nextInt();
			k=in.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=in.nextInt();
			}
//			i=0;
//			while(bal>=0)
//			{
//				if(i<n)
//				{
//					if(bal==Integer.MAX_VALUE)
//						bal=a[i]-k;
//					else
//						bal+=a[i]-k;
//					i++;
//				}
//				else
//					bal-=k;
//				c++;
//			}
			int flag=0;
			for(i=0;i<n;i++)
			{
				work=a[i]+bal;
				if(work>=k)
				{
					bal=work-k;
				}
				else if(work<k)
				{
					System.out.println(i+1);
					flag=1;
					break;
				}
				if(i==n-1&&flag==0)
				{
					bal=(int)Math.floor(bal/k);
					c=n+bal+1;
					System.out.println(c);
				}
			}
			//System.out.println(c);
		}
	}

}
