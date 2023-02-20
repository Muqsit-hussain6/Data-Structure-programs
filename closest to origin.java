import java.lang.Math;
import java.util.Scanner;
class A
{
	public static void Lowest(int n)
	{
	Scanner sc=new Scanner(System.in);
	int x1=0;
	int y1=0;
	
	int[] x=new int[n];
	int[] y=new int[n];
	
	Double[] d= new Double[n];
	
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
		y[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++)
	{
		d[i]=Math.sqrt(((x[i]-x1)*(x[i]-x1))+((y[i]-y1)*(y[i]-y1)));
	
	}
	
		Double low;
		low=d[0];
		for(int i=0;i<n;i++)
		{
		if(low>d[i])
		low=d[i];
		}
	
	for(int i=0;i<n;i++)
	{
		if(low==d[i])
		System.out.println("("+x[i]+","+ y[i]+") of the closest point to (0,0)");
	
	}
	
	
	}		
}


class Distance
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();
	A.Lowest(n);	
	
	}
}