class tostr
{
    int a;
    String b;
    tostr(int a,String b)
    {
        this.a=a;
        this.b=b;
     //   System.out.println(a+" "+b);
    }
    public String toString()// thats why we override this method so thata it doesnot return hash value of object
    {
        return a+" "+b;// returning our desired value
    }
    public static void main(String[]args)
    {
        tostr f1 = new tostr(32,"dave");
        tostr f2 = new tostr(12,"lade");
        System.out.println(f1);//automatically calls toStr() method and returns hash value of object
        System.out.println(f2);
    }
}