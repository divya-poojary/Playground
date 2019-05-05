import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      //take user input
      int n = sc.nextInt();
      //initialise count
      int count = 1;
      while(count <= n)
      {
        System.out.println("I am a Java Developer");
        //incrementing count 
        count = count + 1;
      }   
	}
}