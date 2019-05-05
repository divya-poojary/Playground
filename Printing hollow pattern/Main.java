import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int r=1;r<=n;r++)
      {
          for(int c=1;c<=n;c++)
          {
            if(r>=2 && c>=2 && r<=(n-1) && c<=(n-1))
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");  
            }
          }
        System.out.println(" ");
      }    
	}
}
