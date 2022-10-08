package Jeevancollections;

import java.util.LinkedList;

public class LinKed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> ll = new LinkedList<String>();
		 
	        // Adding elements to the linked list
	        ll.add("J");
	        ll.add("E");
	        ll.addLast("EE");
	        ll.addFirst("VA");
	        ll.add(2, "N");
	         
	        System.out.println(ll);
	 
	        ll.remove("E");
	        ll.remove(3);
	        ll.removeFirst();
	        ll.removeLast();
	 
	        System.out.println(ll);
	    }
	}


	
