class a{
	static int b=10;
	static
	{
	b=20;
	}
public static void main(String[] args){
a test=new a();
//a.overwrite();
System.out.println(test.b);
}
	}

