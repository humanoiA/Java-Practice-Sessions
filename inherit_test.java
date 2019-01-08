class i
{
   static int h=75;
 //   i=75;
}
class j extends i
{
   // int a=5+h;
    //a=5+h;
    public static void main(String[]args)
    {
        int a;
        a=5+h;//to access superclass in child class we need to declare it static as main methos is static in nature so only static variables are took into consideration
      //  j l=new j();
        System.out.println(a);
        
    }
}
/*class m
{
    public static void main(String[]args)
    {
        j l=new j();
        System.out.println(l.h);
        
    }
}*/