class dua2
{
    public static void main(String[]args)
    {
        StringBuilder lipa = new StringBuilder("scared ");
        lipa.append("to be lonely ");
        lipa.insert(20,"Ft. Garrix");
        lipa.delete(20,30);
        System.out.println(lipa);
        System.out.println(lipa.capacity());
    }
}
//string builder and string buffer are mutable i.e. they can change stack value of string ,
//resulting in less use of memory and much faster response time
//string builder is thread safe and much faster than string buffer and strin class