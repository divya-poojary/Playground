import java.util.Scanner;
class Main
{
  public static int sum(int n)
  {
    int add=0;
    for(int i=1;i<=n;i++)
    {
     add = add+i;
    }
    return add;
  }
  public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int result = sum(a);
    System.out.println(result);
	}
}