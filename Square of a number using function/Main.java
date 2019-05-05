import java.util.Scanner;
class Main
{
  public static int multiply(int n)
  {
    int res=n*n;
    return res;
  }
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int square=multiply(n);
      System.out.println(square);   
	} 
}