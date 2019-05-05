import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++)
    {
      arr[i]=sc.nextInt();
    }
    perfect_batch(arr,n);
  }
  
  public static void perfect_batch(int arr[],int n)
  {
    boolean is_perfect = true;
    int batch_sum = arr[0]+arr[1]+arr[2];
    for(int i=3;i<=(n-1);i=i+3)
    {
      int cur_sum = arr[i]+arr[i+1]+arr[i+2];
      if(cur_sum != batch_sum)
      {
        is_perfect = false;
      }
    }
    if(is_perfect == true)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
}
}
