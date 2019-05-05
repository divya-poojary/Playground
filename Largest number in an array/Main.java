import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      int large=arr[0];
      
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=sc.nextInt();
      }
      
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]>large)
        {
          large=arr[i];
        }
      }
      System.out.println(large); 
    }
}