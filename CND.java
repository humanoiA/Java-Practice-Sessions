import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int n,largest1,i,largest2;
            n=sc.nextInt();
            int a[] = new int[n];
            int arr2[]= new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
                arr2[i]=sc.nextInt();
            }
            largest1 = a[0];
            for (i = 0; i < n; i++) {
                if (a[i] < largest1) {
                    largest1 = a[i];
                }
            }
            largest2 = a[1];
            for (i = 1; i < n; i++) {
                if (a[i] < largest2 && a[i] > largest1)
                    largest2 = a[i];
            }
            System.out.println(largest1+largest2);
        }
    }
}