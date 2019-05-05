import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int option=sc.nextInt();
      switch(option)
      {
        case 1: int side=sc.nextInt();
          int area1=side*side;
          System.out.println(area1);
          break;
        case 2: int l=sc.nextInt();
          int b=sc.nextInt();
          int area2=l*b;
          System.out.println(area2);
          break;
        case 3: int base=sc.nextInt();
          int h=sc.nextInt();
          int area3=(base*h)/2;
          System.out.println(area3);
          break;
        case 4: int r=sc.nextInt();
          double area4=3.14*r*r;
          System.out.println(area4);
          break;
        default:
          System.out.println("Invalid option");
          break;
      }                      
    }
}