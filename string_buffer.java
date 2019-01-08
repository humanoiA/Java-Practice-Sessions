class lipa
{
    
    public static void main(String[]args)
    {
        StringBuffer dua = new StringBuffer("scared");//creating string buffer object
        dua.append(" to be lonely ");
        dua.insert(20,"ft. Garrix");
        dua.delete(20,30);
        System.out.println(dua);
        System.out.println(dua.capacity());
    }
}
//this is not thread safe
//less efficient and secure than string builder
