package com.abcd;
public class recursion_test/**This is test for recursion  */
{
    static int n1=0,n2=1,n3=0;
    static void fibo(int count1)/**method declaration */
    {
        if(count1>0)
        {
            
        
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print(" "+n3);
        fibo(count1-1);
        }

    }
    public static void main(String[]args)
    {
        int count1;
        System.out.print(n1+" "+n2);
        fibo(count1-2);
    }
}