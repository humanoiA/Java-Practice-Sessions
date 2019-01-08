class morgan
{
    class elijah//non-static inner class or nested class
    {
        int i =5;//declaration of variables 
    }
    void juhu()
    {
        class tre
        {
         {
            System.out.println("I m the CEO,bitch");
         }
        }
    }
}

class jonas//top class can never be static
{   
    int a=34;//instance variable
    static class david//static class or inner class
    {
        static int i2=9;//static variable
        int p=6;//static class can have non-static memebers
    }
}

class klaus
{
    public static void main(String[] args) 
    {
        morgan r = new morgan();//object of parent class
        morgan.elijah r2 = r.new elijah();//object creation of subclass using reference of parent class
        System.out.println(r2.i);
        jonas r3 = new jonas();//to access members we have to make object simply
        jonas.david r4= new jonas.david();//to call nonstatic member of static class we need to create object of static class
        System.out.println(r3.a+" "+jonas.david.i2+" "+r4.p);//to call static member we simply access it by references of parent class then static class and then static member. but to access non-static member of static class we have to make object of static class
    }
}