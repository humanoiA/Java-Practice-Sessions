import java.util.Arrays;
import java.io.*;
import java.math.*;
import java.util.*;
class rd
{
static class FastReader
{
BufferedReader br;
StringTokenizer st;

public FastReader()
{
br = new BufferedReader(new
InputStreamReader(System.in));
}

String next()
{
while (st == null || !st.hasMoreElements())
{
try
{
st = new StringTokenizer(br.readLine());
}
catch (IOException e)
{
e.printStackTrace();
}
}
return st.nextToken();
}

int nextInt()
{
return Integer.parseInt(next());
}

long nextLong()
{
return Long.parseLong(next());
}

double nextDouble()
{
return Double.parseDouble(next());
}

String nextLine()
{
String str = "";
try
{
str = br.readLine();
}
catch (IOException e)
{
e.printStackTrace();
}
return str;
}
}
public static void main(String[] args)

{

FastReader sc=new FastReader();
    
    int t;
    t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();  
      int [][] a=new int[n][n];         
      int [] count=new int[n]; 
      long sum=0;  
 m:  {
         for(int row=0; row<n; row++){
         for(int column=0; column<n; column++)
         {
            a [row][column]=sc.nextInt();  }  
            Arrays.sort(a[row]);
         }
        int temp=a[n-1][n-1];

         if(n==1){System.out.println(temp);}
         else{
         sum+=temp;
         for(int rows = n-2;rows>=0; rows--){
         for(int col= n-1;col>=0; col--){
            if(a[rows][col] < temp){
              sum=sum + a[rows][col];
              temp=a[rows][col];
              break;
          }
          if(col==0){
              System.out.println("-1");
              break m;
          }
         }
         }
              System.out.println(sum);
                
         }
     }
   }
}

}