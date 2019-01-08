import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
class Main
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    } 
    public static void main(String[]args) 
    {
		FastReader sc=new FastReader();
        int test;
        test=sc.nextInt();
        while(test--!=0)
        {
            int n,m,x,k,p=1;
		int i,counte=0,counto=0;
		 n=sc.nextInt();
          m=sc.nextInt();
           x=sc.nextInt();
            k=sc.nextInt();
        String s1=sc.next();
        counte = s1.split("E", -1).length - 1;
        counto = s1.split("O", -1).length - 1;
		while(n>=0&&counte>=0&&counto>=0)
		{
			if(p%2==0)
			{
				{
					n=n-x;
					counte=counte-x;
				}
			}
			if(p%2!=0)
			{
				
				{
					n=n-x;
					counto=counto-x;
				}
			}
			p=p+1;
		}
		if(p<=m)
		System.out.println("yes");
		else
        System.out.println("no");
        }
    }
}