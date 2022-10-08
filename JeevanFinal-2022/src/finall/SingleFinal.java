//SINGLE INHERITANCE
package finall;
class Father
{
	void m1()
	{
		System.out.println("Father");
	}

}


public class SingleFinal extends Father{
	void m2()
	{
		System.out.println("child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleFinal obj=new SingleFinal();
		obj.m1();
		obj.m2();
		

	}

}
