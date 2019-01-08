class vehicle
{
	String id;
	int number;
	vehicle(String id)
	{
		this.id=id;
		System.out.println(id);
	}
	vehicle(String id,int number)
	{
		this.id=id;
		this.number=number;
		System.out.println(id+" "+number);
	}
	public static void main(String[]args)
	{
		//vehicle k1=new vehicle("rover");
		vehicle k2=new vehicle("rover",1996);
	}
}