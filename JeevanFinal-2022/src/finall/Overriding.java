package finall;
class Name{
	void name()
	{
		System.out.println("Matam");
	}
}

public class Overriding extends Name{
void lastname(){
	System.out.println("kumar");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Overriding obj=new  Overriding();
		 obj.name();
		 obj.lastname();

	}
	void name()
	{
		super.name();
		System.out.println("Jeevan");
	}

}
