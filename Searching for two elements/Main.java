import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      int index1=-1;
      int index2=-1;
      for(int i=0;i<arr_size;i++)
      {
        if(num1 ==arr[i])
        {
          index1 = i;
        }
        if(num2 == arr[i])
        {
          index2 = i;
        }
      }
      System.out.println(index1);
      System.out.println(index2); 
    }
}