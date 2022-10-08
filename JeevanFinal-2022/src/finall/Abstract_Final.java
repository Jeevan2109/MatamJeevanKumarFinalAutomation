package finall;

abstract class finall
	{
		abstract void jeevan();
		void m2()
		{
			System.out.println("welcome");
		}
	}
	public class Abstract_Final extends finall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Final obj=new Abstract_Final();
		obj.jeevan();
		obj.m2();
	}
	void jeevan()
	{
		System.out.println("BYE");
	}
	
	}



