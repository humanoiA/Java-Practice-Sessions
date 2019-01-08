class A
{
    static int a=2;
}
class B extends A
{
    static int b=32;
}
class C extends A
{
    static int c=4;
}
class D extends B
{
    static int d=87;
}
class E extends C
{
    static int e=87;
}
class Main
{
    public static void main(String[] args) {

        System.out.print(D.d+ " "+D.b+ " "+D.a+ " "+E.e+" "+E.c+" "+E.a);
    }
}
