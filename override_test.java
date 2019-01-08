class animal
{
    void sound()
    {
        System.out.println("voice");
    }
}
class dog extends animal
{
    void sound()
    {   
        super.sound();//super keyword is used inside method
        System.out.println("Bark");
    }
}
class cat extends animal
{
    void sound()
    {
        System.out.println("meow");
    }
}
class imp
{
    public static void main(String[]args)
    {
        dog d=new dog();
        cat c=new cat();
        d.sound();//invoking specific method using
        c.sound();
    }
}