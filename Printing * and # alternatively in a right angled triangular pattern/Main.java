import java.util.Scanner;
class Main 
{ 
	public static void main(String[] args)
    {
  	  Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int a=0;
      for(int r=1;r<=n;r++)
      {
        for(int c=1;c<=r;c++)
        {
          if(a==0)
          {
            System.out.print("*");
            a=1;
          }
          else
          {
            System.out.print("#");
            a=0;
          }
        }
        System.out.println(" ");
      }
    }
}
      
  		
  