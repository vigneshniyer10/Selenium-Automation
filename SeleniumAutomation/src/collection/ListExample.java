package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l= new ArrayList<Object>();
		l.add("True");
		l.add("TCS");
		l.add("TCS");
		l.add(4.5);
		l.add(4.5235);
		
		List<String> l1= new LinkedList<String>();
		l1.add("Bangalore");
		l1.add("Bangalore");
		l1.add("UttarPradesh");
		l1.add("kolkata");
		l1.add("Haldia");
		
	//	System.out.println("This is my arraylist"+ l);
		//System.out.println("This is my linkedlist"+ l1);
		
		for(Object x:l) {
			System.out.println(x);
			
			for (String y:l1) {
				System.out.println(y);
			}
			
		}
	}

}
