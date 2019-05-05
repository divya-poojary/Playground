import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int max_id;
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    if(arr[0]>arr[1])
    {
      max_id=0;
    }
    else
    {
      max_id=1;
    }
    for(int i=2; i<=(n-1); i++)
    {
      if(arr[max_id] < arr[i])
      {
        max_id=i;
      }
    }
     System.out.println(max_id);
  }
}