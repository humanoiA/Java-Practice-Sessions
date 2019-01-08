abstract class laptop// object of abstract class cant be made it can only be extended
{
    abstract void display();//abstract method cannot have any body
//its method need to be defined, whether it be any definition or a blank block
    abstract void processor();//yet it can have body when it is inherited
    void memory()
    {
        System.out.println("SSD");
    }
}
//if we extend an abstract class which has abstract method then we need to provide an implementation of the abstract method
abstract class razer extends laptop// abstract class needs to be extended
{
    public void display()//if there is any abstract method in any class then the class needs to be abstract
    {
        System.out.println("4k");

    }
    void processor()//its method needs to be implemented
    {
        System.out.println("i9 Extreme");
    }
}

class polka extends razer
{
//automatic creation of default constructor 
public void display()//if there is any abstract method in any class then the class needs to be abstract
    {
        System.out.println("8k UHD");

    }
}   
 class abstract_test
 {
     public static void main(String[]args)
     {
         polka dot = new polka();// object of non-abstract class is created which is the extension of parent abstract class
         dot.display();
         dot.processor();
         dot.memory();
     }
 }