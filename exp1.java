class PK 
{	
	String name;
	int rollno;
	public void munna(String kk,int oo)
	{
		name=kk;
		rollno=oo;
	}

	public static void main(String[]args)
	{
	PK f=new PK();
	f.munna("packard",64);
	System.out.println(f.name+" "+f.rollno);
	}
}