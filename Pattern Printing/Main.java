import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i1 = 1; i1 <= r; i1++)
        {
            for(int i2 = c; i2 > c - i1 ; i2--)
            {
                System.out.print(i2);
            }
            for(int i2 = 1; i2 <= c - i1; i2++)
            {
                System.out.print(r - i1 + 1);
            }
            System.out.println();
        }
    }
}
