class blood
{
    public int a=3;
   /* private int b=4;
*/    protected int c=5;
    int d=6;
}
class blood2
{
    public static void main(String [] args)
    {
        blood k = new blood();
        System.out.printf(k.a+" "+k.c+" "+k.d);
    }
}