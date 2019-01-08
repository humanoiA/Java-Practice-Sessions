class P
{	
	String name;
	int rollno;
	public void munna(String kk,int oo)
	{
		name=kk;
		rollno=oo;
		System.out.println(name+" "+rollno);
	}

	public static void main(String[]args)
	{
	P t=new P();
	t.munna("packard",64);
	
	}
}