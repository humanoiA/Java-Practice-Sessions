class youth
{
   static int arr[];
    public static void main(String[]args)
    {
    //   meth()
           {
        
        int a,b,c;
        try
        {
            int i=0;
            for(i=0;i<3;i++)
            {
                    arr[i]=i;
                    System.out.println(arr[i]);
            }
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Exception handled");
        }
            try{
                    a=0;
            b=5;
            c=0;
            a=b/c;
            }
            catch(ArithmeticException e2)
            {
                System.out.println("Can't divide by zero");
            }
        catch(Exception e2)
        {
            System.out.println(e2);
        }
           }
       
    }
}