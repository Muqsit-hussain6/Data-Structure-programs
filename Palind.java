class Palind
{

	public static void Palindrome(int[] arr)
	{
	int check=0;
	int j=arr.length-1;
	for(int i=0;i<arr.length/2;i++)
	{
		if(arr[i]!=arr[j])
		{
		check=1;
		break;
		}
		else
		j--;
	}
	if(check==0)
	System.out.println("Palindrome");
	else
	System.out.println("Not Palindrome");
	}
	


public static void main(String[] args)
{
	int []a={0,1,0,1,0};
	Palind.Palindrome(a);
}
}