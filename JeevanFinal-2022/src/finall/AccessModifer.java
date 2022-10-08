package finall;
class Access{
	private int x = 0;
	protected int y = 9;
	public int z = 99;	
	int jk = 13;
}
public class AccessModifer extends Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifer obj=new AccessModifer();
		 System.out.println(obj.y);//Protected can be accessed by 
         //object 
		 //System.out.print(obj.x); gives error
         System.out.println(obj.z);
         System.out.println(obj.jk);
         System.out.println("jeevan");
}

	}


