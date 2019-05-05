import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    subseq(arr,n);
  }
   
  public static void subseq(int arr[],int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[j]<arr[i])
        { 
        }
        else
        {
          System.out.println(arr[i]+","+arr[j]);
        }
      }
    }
  }
}
