import java.util.*;
public class covid {

	public static void main(String[] args) {
		int N,i,j,k,c,T;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		Set<Integer> st=new HashSet<>();
		for(i=0;i<T;i++)
		{
			N=in.nextInt();
			int a[] = new int[N];
			for(j=0;j<N;j++)
			{
				a[j]=in.nextInt();
			}
			
			for(j=0;j<N;j++)
			{
				c=1;
				for(k=0;k<N;k++)
				{
					if(j!=k)
					{
						if(a[j]>a[k]&&j<k)
						{
							c++;
						}
						else if(j>k&&a[j]<a[k])
						{
							c++;
						}
					}
				}
				if(!st.contains(c))
				st.add(c);
			}
			System.out.println(Collections.min(st)+" "+Collections.max(st));	
			st.clear();
		}
		in.close();
	}

}
