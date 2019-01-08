import java.util.Scanner;
class euler 
{
    public static void main(String[]args)
    {       
        Scanner sc=new Scanner(System.in);

        int test=sc.nextInt();
        while(test--!=0)
        {
           long sum=0,n;
        n=sc.nextInt();
        while(n!=0)
        {
            --n;            
           if(n%3==0||n%5==0)
           {
               sum+=n;
           }   
             
        }
        System.out.println(sum);
        sum=0;
    
        }
    }
}