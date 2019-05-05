import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	  Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int temp=num;
      int sum=0;
      while(num>0)
      {
        int rem=num%10;
        int fact=1;
        for(int c=1;c<=rem;c++)
        {
          fact*=c;
        }
        sum+=fact;
        num/=10;
      }
      if(temp==sum)
      {
        System.out.println("Yes");
      }
      else
      {
         System.out.println("No");
      }
	}
}