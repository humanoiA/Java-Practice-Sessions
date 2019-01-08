import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int test = sc.nextInt();
        while(test--!=0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int i,count2=0,count3=0,count5=0,count7=0;
            long arr[] =new long [n];
            for(i=0;i<n;i++)
            {
                arr[i]= sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                count2=count2+1;
                if(arr[i]%3==0)
                count3=count3+1;
                if(arr[i]%5==0)
                count5=count5+1;
                if(arr[i]%7==0)
                count7=count7+1;
            }
            i=0;
           // if(count2==n||count3==n||count5==n||count7==n){
            while(count2!=n&&count3!=n&&count5!=n&&count7!=n&&i<n)
            {
                if(count2==n)
                {
                    while(arr[i]%2!=0)
                    arr[i]/=2;
                }
                if(count3==n)
                {
                    while(arr[i]%3!=0)
                    arr[i]/=3;
                }
                if(count5==n)
                {
                    while(arr[i]%5!=0)
                    arr[i]/=5;
                }
                if(count7==n)
                {
                    while(arr[i]%7!=0)
                    arr[i]/=7;
                }
                    i++;
            }
            count2=0;
            count3=0;count5=0;count7=0;
            for(i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                count2=count2+1;
                if(arr[i]%3==0)
                count3=count3+1;
                if(arr[i]%5==0)
                count5=count5+1;
                if(arr[i]%7==0)
                count7=count7+1;
            }
             System.out.println(count2+" "+count3+" "+count5+" "+count7);
            }
    }
}