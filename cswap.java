/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		long N,j,k,m,n,sum,c,T,i;
		Scanner in = new Scanner(System.in);
		T=in.nextLong();
	    for(i=0;i<T;i++)
	    {
	    	n=0;
	    	N=in.nextLong();
	    	if(N<3)
	    		c=0;
	    	else {
	    	for(j=1;j<=N;j++)
	    	{
	    		n+=j;
	    	}
	    	n/=2;
	    	c=0;
	    	sum=0;
	    	for(j=N;j>0;j--)
	    	{
	    		sum+=j;
	    		if(n-sum<N)
	    		{
	    			m=n-sum;
	    			j=j-1;
	    			if(m<j)
	    			{
	    				c=N-j+1;
	    			}
	    			else if(m==j)
	    			{
	    				k=N-m;
	    				while(k>0)
	    				{
	    					c+=k;
	    					k--;
	    				}
	    			}
	    		}
	    		if(c>0)
	    			break;
	    	}
	    	}
	    	System.out.println(c);
	    }
	}
}
