class i
{
   int h=75;//either do operation at initialization or go through instance u\initializer block
}
class j extends i
{
    int a=5+h;//operation not possible through class but through instance initializer block
    
    }
class m
{
    public static void main(String[]args)
    {
        j l=new j();
        System.out.println(l.a);
        
    }
}