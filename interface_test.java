interface car//only abstract method possible and static,final keyword applicable for variables
{
    void engine();//by default it is public and abstract
    void acceleration();
    void top_speed();
}
//we can define a method in interface with the help of dealault and static keyword
//we can operate with a variable at the the of declaration in interface
interface electric_car extends car//inherirance in interface
{
    void electric_power();
}
interface exotic_car 
{
    void engine();
}
abstract class mycar implements exotic_car,electric_car//multiple inheritance achieved through class
{
    public void engine()//no ambiguity possible as definition is available in only class and nowhere else
    {
       System.out.println("V12 Engine");
    }
}
abstract class mycar2 extends mycar//class needs to be abstract because methods are abstract else error will occur
{
    public void electric_power()
    {
        System.out.println("Battery Powered");
    }
    public void acceleration()
    {
        System.out.println("0-100 in 1.3 sec");
    }
}
class mycar3 extends mycar2
{
    public void top_speed()
    {
        System.out.println("356kmph");
    }
}
class exec
{
    public static void main(String[]args)
    {
        mycar3 dot=new mycar3();
        dot.electric_power();
        dot.top_speed();
        dot.acceleration();
        dot.engine();
    }
}
 /** 
Abstract class	Interface
1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
6) Example:
public abstract class Shape{
public abstract void draw();
}	Example:
public interface Drawable{
void draw();
}*/