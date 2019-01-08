class blueprint
{
	String k;
	void display(String k)
	{
		
		System.out.println(k);
	}
	
}
class B{
	public static void main(String []args)
	{
	blueprint v=new blueprint();
	blueprint c=new blueprint();
	v.display("toyota");
	c.display("maruti");
	System.out.println(c.k);
	System.out.println(v.k);
	}
}
	