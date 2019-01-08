import java.util.Scanner;
class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test--!=0)
        {
            double n=sc.nextDouble();
            int w=sc.nextInt();
            int l1,l2,t1=0,t2=0,sum=0,rem=0,dif=0,i,count=0;
            l1=(int)Math.pow(10,n-1);
            l2=(int)Math.pow(10,n)-1;
            for(i=l1;i<=l2;i++)
            {  
                sum=0;
                rem=0;
                dif=0;  
                while(i!=0)
                { 
                rem=i%10;
                t1=rem;
                i=i/10;
                rem=i%10;
                t2=rem;
                dif=t1-t2;
                sum=sum+dif;
                }
                if(sum==w)
                {
                    count=count+1;
                }
            }
            System.out.print(count);
        }
    }
}