class mathhers
{
    private int i;
    private int j;
    private String s;
    String getname()
    {
        return s;
    }
    int getId()
    {
        return i;
    }
    int getAge()
    {
        return j;
    }
    void setName(String s)
    {
        this.s=s;
    }
    void setId(int i)
    {
        this.i=i;
    }
    void setAge(int j)
    {
        this.j=j;
    }
}
class mathhers2
{
    public static void main(String[]args)
    {
        mathhers m = new mathhers();
        m.setName("Alma Mater");
        m.setId(548746);
        m.setAge(23);
        System.out.println(" "+m.getname()+" "+m.getId()+" "+m.getAge());
    }
}