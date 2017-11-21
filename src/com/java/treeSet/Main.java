package com.java.treeSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new myComparator());
		
		
		List l = new ArrayList();

		Employee e1 = new Employee("Milind", "Gujarati", 56441, 14_00_000, 48);
		Employee e2 = new Employee("Yogesh", "Inamdar", 56651, 12_00_000, 42);
		Employee e3 = new Employee("Pravin", "Jadhav", 56901, 7_00_000, 32);
		Employee e4 = new Employee("Kiran", "Adhav", 56831, 8_00_000, 33);
		Employee e5 = new Employee("Faisal", "Nakade", 56867, 6_00_000, 34);
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		
		t.addAll(l);
		
		System.out.println(t.size());
		System.out.println(t);
		
		Iterator itr = t.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
