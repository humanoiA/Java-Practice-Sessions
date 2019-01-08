class te
{   int y,x;
   static int a= 554;
   te(int o)
   {
       y=o;
       a=a;
       System.out.println(y+" "+a);
   }
   te(int o, int l)
   {
     y=o;
     x=l;
     a=a;
     System.out.println(y+" "+x+" "+a);
   }
}
class test2{

 public static void main(String[]args)
    {
        te lol = new te(23);
        te lol2 = new te(56,98);
}
}