import java.util.Scanner;
class cms{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
int n;
n=sc.nextInt();
String []num={"021","051","031","163","013"};
String []dep={"Computer Science","Software Engineering","Electrical Engineering","Agribusiness","Business Administration"};
sc.nextLine();
if(n>0)
{
String arr[]=new String [n];
   for(int i=0;i<n;i++)
   {
   arr[i]=sc.nextLine();
   }
   String check="";
   for(int i=0;i<n;i++)
   {
   for(int j=0;j<3;j++)
   check+=arr[i].charAt(j)+"";
   }
   
for(int i=0;i<arr.length;i++)
{
	if(num[i].equals(check))
	{
		System.out.println("student"+(i+1));
		for(int j=0;j<arr[i].length();j++)
	   {
		if(j==3 || j==5)
	   System.out.print("-");
	   System.out.print(arr[i].charAt(j));
	   }
	   System.out.println("\nDept: "+dep[i]);
	   System.out.println("Year: 20"+arr[i].substring(3,5));
       System.out.println("ID: "+arr[i].substring(5,arr[i].length()));	
	check="";
	}

}	
}

}
}