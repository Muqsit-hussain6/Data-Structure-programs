import java.util.Scanner;
class Dayofprogrammer{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int year ;
year = sc.nextInt();
int date=0;
String s ="";
if(year>=1700  && year <=2700)
{
  if(year>=1700 && year<=1917)
  {
    if(year%4==0)
	{
	date = 256 - 244;
	s = date+".09."+year;
	}
	else
	{
	date = 256-243;
		s = date+".09."+year;
	}
    System.out.println(s);  
  }
  else if(year==1919)
  {
	  date=256+13-243;
	  s= date+".09."+year;
	 System.out.println(s);   
	  
  }
  else if(year>1917 && year<=2700)
  {
  if(year%400==0 || year%4==0 && year%100!=0)
  {
   date =256-244;
   	s = date+".09."+year;
  }
  else 
  {
	  date = 256-243;
	  	s = date+".09."+year;
  }
  System.out.println(s);
  }

}
}
}