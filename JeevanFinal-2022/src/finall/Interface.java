package finall;

	interface Jeevan{
		void m1();
		void m2();
	}
	
public class Interface implements Jeevan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj=new Interface();
		obj.m1();
		obj.m2();

	}
	public void m1() 
	{
		System.out.println("its coming for submain1 ");
	}
	public void m2() 
	{
		System.out.println("its working for submain2 ");
	}

}
