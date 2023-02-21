import java.util.Scanner;
class hackerankTask{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = 0;
n=sc.nextInt();
String detn[]={"030","031","032","033","034"};
String det[]={"Mobilink","Zong","Warid","Ufone","Telenor"};
if(n>0){
String arr []= new String [n] ;
sc.nextLine();
String check="";

for(int i =0;i<n;i++)
{
	arr[i]=sc.nextLine();
}
for(int i=0;i<n;i++){
for(int j=0;j<3;j++)
{	check+=arr[i].charAt(j)+"";
}
for(int p=0;p<5;p++)
{
	if(check.equals(detn[p]))
	{
	for(int k=0;k<11;k++)
	{
      if(k==4)
		  System.out.print("-");
	
		  System.out.print(arr[i].charAt(k));
	}
	System.out.println(" belongs to "+det[p]+" Network.");
	}
}
check="";
}

}
else
	System.out.println("no output");

}
}

      