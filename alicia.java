class  alicia
{
    int j;
    int i=3;
    void triangle()
    {   
        
        for(i=0;i<10;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
                System.out.println("");
        }
    }   
}
class alicia2
{
    public static void main(String []args)
    {
        alicia k = new alicia();    //creating object of classs alicia
        k.triangle();               //calling method
    }
}