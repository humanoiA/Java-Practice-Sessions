class ways_string
{
    public static void main(String[]args)
    {
        String s1="first way to create string";
        char s2[]={'2','w','a','y'};
        String s22 = new String(s2);//conversion of aray into string
        String s3 = new String("third way");
        System.out.println(s1);
        System.out.println(s22);
        System.out.println(s3);
        System.out.println(s2[0]);
    }
}