package collection;

import java.util.HashSet;
import java.util.Set;

public class SetClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String>set= new HashSet();
		set.add("one");
		set.add("Two");
		set.add("Three");
		set.add("Three");
		set.add("Five");
		
		for(String y:set)
		{
			System.out.println(set);
		}
		
			}

}
