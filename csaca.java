// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
        int i,j,count,count2=0;
		for(i=a;i<=b;i++)
		{   count=0;
		    for(j=1;j<=i;j++)
		    {
		        if(i%j==0)
		        count=count+1;
		    }
            if(count%2!=0)
            count2=count2+1;
		}
          
		{
		    System.out.print(count2);
		}
	}
}