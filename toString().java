class tostr
{
    int a;
    String b;
    tostr(int a,String b)
    {
        this.a=a;
        this.b=b;
    }
    public static void main(String[])
    {
        tostr f1 = new tostr(32,"dave");
        tostr f2 = new tostr(12,"lade");
        System.out.println(f1);
        System.out.println(f2);
    }
}