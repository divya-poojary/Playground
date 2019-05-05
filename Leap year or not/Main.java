import java.util.Scanner;
class Main 
{
	public static void main (String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int year = sc.nextInt();
      
      // year is divisible by 4
      // year is divisible by 100, then it is divisible by 400
      if(((year % 4 ==0) && (year % 100!=0)) ||
         ((year % 100 == 0) && (year % 400 == 0)))
      {
        System.out.println("Leap year");
      }
      else
      {
        System.out.println("Non Leap year");
      }	
    }
}