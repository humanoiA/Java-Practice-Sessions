class p
{
	int R;
	string name;
	void insert(int roll,string n)
{
	R=roll;
	name=n;
}
void display()
{
	System.out.println(R+" "+name);
}
public static void main(String[]args)
{
	p k=new p();
	p o=new p();
	k.insert(125,"heyyyy");
	k.display();
	o.insert(250,"another");
	o.display();
}
}