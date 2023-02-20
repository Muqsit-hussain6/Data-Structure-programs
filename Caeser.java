import java.util.Scanner;
class Caeser
{
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=0,k=0,count=0,z=0;
	char a;
	String s="",d="";

	
		n=sc.nextInt();
		if(1<=n && n<=100)
		{
		sc.nextLine();
		s=sc.nextLine();
		for(int j=0;j<s.length();j++)
	{
		if(s.charAt(j)==' ')
		count++;	
	}
	if(count==0)
	{
		k=sc.nextInt();
		if(0<=k && k<=100)
		{
	

	for(int j=0;j<s.length();j++)
	{
		z=s.charAt(j);
		if(97<=z && z<=122)
		{
			z=z+k;
			if(z>122)
			z=z-26;
		}	
		if(65<=z && z<=90)
		{
		z=z+k;
			if(z>90)
			z=z-26;
		}
		
		a=(char)z;
		d=d+a+"";
			
		}}
	}}
	
	System.out.print(d);


	}



}