import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int e=sc.nextInt();
    System.out.println(power(b,e));
  }
  
  public static int power(int x,int y)
  {
    int result=1;
    while(y>0)
    {
      result = result*x;
      y=y-1;
    }
    return result;
  }
}
