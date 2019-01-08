import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        while(test--!=0)
        {
            int sum=0;
            int n = sc.nextInt();
            int i,n1=0,n2=0,n3=0;
            n=n-1;
            n1=n/3;
            n2=n/5;
            n3=n/15;
            sum=(n1*(3+n1*3)+n2*(5+n2*5)-n3*(15+n3*15))/2;
            System.out.println(sum);
        }
    }
}