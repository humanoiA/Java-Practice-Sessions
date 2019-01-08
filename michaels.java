import java.util.Scanner;
class michaels
{
    void prime()
    {
        int count=0,j;
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                count=count+1;
                
            }
        }
        if(count==2)
        {
            System.out.println("Prime");
        }
        else
        {
                System.out.println("Not Prime");
        }
    }
}
class michaels2
{
    public static void main(String[]args)
    {
        michaels m = new michaels();
        m.prime();
    }
}