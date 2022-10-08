package finall;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]=new int[6];
		try
		{
			x[7]=10/1;
			
		}
		
		catch (ArithmeticException e)
		
		{
			System.out.println("exception code");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception code bro");
		}
			 catch (Exception e)
				
				{
					System.out.println("exception code");
				}
		finally {
			System.out.println("try catch");
		}

	}

}
