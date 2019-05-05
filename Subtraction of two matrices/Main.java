import java.util.Scanner;
class Main
{ 
  public static void main(String args[]) 
  { 
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int matrix1[][]=new int[r][c];
    {
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          matrix1[i][j]=sc.nextInt();
        }
      }
    int matrix2[][]=new int[r][c];
      {
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
          {
            matrix2[i][j]=sc.nextInt();
          }
        }
        
        int result[][]=new int[r][c];
        int m,n;
        for(m=0;m<r;m++)
        {
          for(n=0;n<c;n++)
          {
            result[m][n]=matrix1[m][n]-matrix2[m][n];
          }
        }
        
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
          {
            System.out.print(result[i][j]+" ");
          }
          System.out.println(" ");
        }
      }
    }
  }
}
   