import java.util.*;

public class candies {

	public static void main(String[] args) {
		int N,K,T,i,j,l,z,c,sum,sum2;
		Scanner in = new Scanner(System.in);
		K=in.nextInt();
		T=in.nextInt();
		Set<Integer> st=new HashSet<>();
		Map<Integer,List<Integer>> map= new HashMap<>();
		for(i=0;i<T;i++)
		{
			c=0;
			sum=0;
			sum2=0;
			N=in.nextInt();		
			z=N;
			int a[] = new int[N];
			for(j=0;j<N;j++)
			{
				a[j]=(int) Math.pow(j+1, K);	
				sum+=a[j];						
			}
			for(l=0;l<z;l++)
			{
				sum2=a[N-1];
				for(j=l;j<=z;j++)
				{
					if(sum2>=sum/2)
					{
						c=sum2-(sum-sum2);
						z=j;
					}
					else
					{
						c=Math.abs((sum2-(sum-sum2)));
						sum2+=a[j];
					}
					st.add((int) c);
					//if(!map.containsKey(c))
					//{
						map.put(c, new LinkedList<Integer>());
						if(!map.containsValue(l))
						map.get(c).add(l);
						map.get(c).add(j);
					//}
					
				}
			}
			
			int min = Collections.min(st);
			System.out.println(min);
			int b,d;
			b=map.get(min).get(0);
			d=map.get(min).get(1);
			for(j=0;j<N;j++)
			{
				if(j>=b&&j<d||j==N-1)
					a[j]=1;
				else
					a[j]=0;
				System.out.print(a[j]);
			}
			System.out.println();
			st.clear();
		 }
		
	}

}




// 1 2 3 4 5 
// 0 1 0 0 1
//d = {c1 : [l, j], c2}; 