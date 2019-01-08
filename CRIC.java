import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int countr=0,countw=0,r,w;
        String k;
        String prin="YES";
        while(n--!=0)
        {
            r=sc.nextInt();
            w=sc.nextInt();
            k=(r>countr)?(countr=r):(prin="NO");
            k=(countw<=10)?(countw+=w):(prin="NO");
        }
        System.out.println(prin);
    }
}