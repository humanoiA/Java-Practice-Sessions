class test
{
    static int a= 554;
   
}
class test2
{
     public static void main(String[]args)
    {
        test ui=new test();
        System.out.println(test.a); //static variable is invoked with the help of class name
    }
}