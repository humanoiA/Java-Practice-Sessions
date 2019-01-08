class vehicle
{
	String id;
	int number;
	vehicle(String id,int number)
	{
		this.id=id;
		this.number=number;
		System.out.println(id);
	}
	vehicle(vehicle v)
	{
		id=v.id;
		number=v.number;
		System.out.println(id+" "+number);
	}

	public static void main(String[]args)
	{
		//vehicle k1=new vehicle("rover");
		vehicle k2=new vehicle("rover");
		vehicle k1=new vehicle(k2);
	}
}