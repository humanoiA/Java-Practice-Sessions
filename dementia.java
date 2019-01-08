import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        while(test--!=0)
        {
            int n,k,i,sum=0,count=0,j,temp;
            n=sc.nextInt();
            k=sc.nextInt();
            int arr []= new int[n];
            int arr2 []= new int[n];
            for(i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(i=0;i<arr.length-1;i++)
            {
                count=0;
                for(j=0;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count=count+1;
                    }
                }
                if(count==k&&arr[i]!=0)
                {
                temp=arr[i];
                for(j=0;j<arr.length;j++)
                {
                    if(arr[i]==temp)
                    {
                        arr[i]=1000000;
                    }
                }
                sum=sum+temp;
                }
            }
            if(sum>=0)
            System.out.println(sum);
            else
            System.out.println(-1);
        }
    }
}