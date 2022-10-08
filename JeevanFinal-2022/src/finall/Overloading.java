package finall;

public class Overloading {
	int result;
	void add (int x,int y)
	{
		result= x+y;
		System.out.println(+result);
	}
	void sub(int x,int y)
	{
		result=x-y;
		System.out.println(+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj=new Overloading();
		obj.add(10,20);
		obj.sub(5, 3);
	
	}

}
