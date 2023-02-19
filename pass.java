import java.util.Scanner;
class pass{
public static void main(String agrs[])
{
String num = "0123456789";
String lcase = "abcdefghijklmnopqrstuvwxyz";
String ucase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String sp = "!@#$%^&*()-+";

Scanner sc = new Scanner (System.in);
int n ;
n=sc.nextInt();
String pass;
sc.nextLine();
pass=sc.nextLine();
int cn=0,cl=0 ,cu=0 ,cs=0;
int [] arr = new int [5];
if(n>=1 && n<=100)
{
	for(int i=0;i<pass.length();i++)
	{    

       for(int j=0;j<pass.length();j++)
	   {
		 if(pass.charAt(i)==num.charAt(j))
		{
			arr[0]++;
		}
		if(pass.charAt(i)==lcase.charAt(j))
		{
			arr[1]++;
		}
		if(pass.charAt(i)==ucase.charAt(j))
		{
			arr[2]++;
		}
		if(pass.charAt(i)==sp.charAt(j))
		{
			arr[3]++;
		}
		
	   }
	}
	int sum=0;
	for(int i =0;i<4;i++)
	{
		if(arr[i]!=0)
			sum+=arr[i];
		else
			arr[4]++;
		
	}
	
	if(cn>0 && cl>0 && cu>0 && cs>0 && sum!=pass.length())
	{   
         if(pass.length()<6)
			 System.out.println(pass.length()-6);
        
		System.out.println(pass.length()-sum+arr[4]);
	}
	if(cn==0 || cl==0 || cu==0 || cs==0){
		       if(pass.length()<6)
			 System.out.println(pass.length()-6);
         
		System.out.println(pass.length()-sum+arr[4]);
		
	}
		


}


} 
}