import java.util.Scanner;
public class ChefScore
{
  public static void main(String []args)
  {
    
    int t;
    Scanner sc=new Scanner(System.in);
    t=sc.nextInt();
    while(t!=0)
    {
      int n=sc.nextInt();  
      int [][] a=new int[n][n];         
      int [] count=new int[n]; 
      long sum=0;  
         for(int row=0; row<n; row++){
         for(int column=0; column<n; column++)
         {
            a [row][column]=sc.nextInt();  }  
         } 
         for(int rows = 0; rows < n; rows++){
         for(int col= 0; col < a[rows].length; col++){
            if(a[rows][col] > count[rows]){
               count[rows] = a[rows][col]; } 
          }
              sum=sum + count[rows]; 
         }
         System.out.println(sum);
         t=t-1;
     }
  }
}