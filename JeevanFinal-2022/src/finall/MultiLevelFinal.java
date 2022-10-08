package finall;
class GrandFather{
	void m1()
	{
		System.out.println("1st");
	}
}
 class Mother extends GrandFather {
	void m2() {
		System.out.println("2nd");
	}
}
public class MultiLevelFinal extends Mother{
	//public class MultiLevelFinal extends Mother,GrandFather{
	void m3()
	{
		System.out.println("3rd");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelFinal obj=new MultiLevelFinal();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
