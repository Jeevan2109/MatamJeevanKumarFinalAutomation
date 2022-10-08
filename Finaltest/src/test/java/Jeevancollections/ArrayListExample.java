package Jeevancollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values=new ArrayList();
		values.add("JEEVAN");
		values.add(21);
		values.add(21.22);
		Iterator i= values.iterator();
		//System.out.println(i.next());
		//System.out.println(i.next());
		//System.out.println(i.next());
		// using hasNext method
		while(i.hasNext())
		{
			System.out.println(i.next());
	
		}
		values.remove(21.22);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		values.add(2);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		
		// as we have seen out put it's adding at the last. What if I have to add element in between? Can I use below code?
		//values.add(1,2)// it's not possible add number in between using Arraylist class so we have to go for using LinkedList 



	}
}
