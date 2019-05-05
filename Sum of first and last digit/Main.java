import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int first_dig=0,last_dig,sum=0;
      last_dig=n % 10;
      while(n>0)
      {
        first_dig=n%10;
        n=n/10;
      }
      sum = first_dig + last_dig;
      System.out.println(sum);  
	}
}
