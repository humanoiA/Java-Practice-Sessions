import java.util.Scanner;
public class d2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        while(test--!=0)
        {
            int n,k,i,sum=0,count=0,j,temp=-1;
            n=sc.nextInt();
            k=sc.nextInt();
            int arr []= new int[n];
            int arr2 []= new int[n];
            for(i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(i=0; i<arr.length; i++)
            {
                count=0;
                for(j=0; j<arr.length; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        count = count + 1;
                    }
                }
                if(count > k)
                { ++temp; }
                if(count == k)
                {
                    sum = sum + arr[i];
                    arr[i] = -3;
                }               
            } 
            if(sum>0)
            System.out.println(sum);
            if(sum == 0)
            {
                if(temp!=-1)
                { System.out.println(-1); }
                else
                System.out.println(sum);
            }
           
        }
    }
}