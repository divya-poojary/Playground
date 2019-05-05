import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int r=0;r<n;r++)
      {
        for(int c=0;c<n;c++)
        {
          if( r==c || (r+c)==n-1)
          {
             System.out.print("*");
          }
          else
          {
             System.out.print(" ");
          }
        }
        System.out.println(" "); 
      }
	}
}