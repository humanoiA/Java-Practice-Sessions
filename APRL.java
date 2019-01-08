import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,temp1=100001,temp2=100001,temp3=100001;
        n=sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        for(i=0;i<arr2.length;i++)
        {
         if(arr2[i]==1)
         {
            if(arr[i]<temp1)
            {
                temp1=arr[i];
            }
         }
         if(arr2[i]==2)
         {
            if(arr[i]<temp2)
            {
                temp2=arr[i];
            }
         }
         if(arr2[i]==3)
         {
            if(arr[i]<temp3)
            {
                temp3=arr[i];
            }
         }
        }
        
        if((temp1+temp2)<=(temp3))
        System.out.println(temp1+temp2);
        else
        System.out.println(temp3);
    }
}