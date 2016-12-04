
public class Test
{
	String brand="xyz";
//public static void main(String[]args)

	String getBrand()
	{
		return brand;
	}
	void setBrand(String aBrand)
	{
		brand=aBrand;
		System.out.println(brand);
	}
	
	
}


class Test1 extends Test
{
	public static void main(String[]args)
	{
	Test t1=new Test();
	t1.setBrand("vvv");
}
}