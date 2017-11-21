package com.java.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.java.treeSet.Employee;
import com.java.treeSet.myComparator;

@SuppressWarnings({"rawtypes","unused","unchecked"})
public class HashDemo {
	
	
	public static void main(String[] args) {
		
	Employee e1 = new Employee("Milind", "Gujarati", 56441, 14_00_000, 48);
	Employee e2 = new Employee("Yogesh", "Inamdar", 56651, 12_00_000, 42);
	Employee e3 = new Employee("Pravin", "Jadhav", 56901, 7_00_000, 32);
	Employee e4 = new Employee("Kiran", "Adhav", 56831, 8_00_000, 33);
	Employee e5 = new Employee("Faisal", "Nakade", 56867, 6_00_000, 34);
	
	HashMap <Integer, Employee> hmap = new HashMap();
	
	hmap.put(1, e1);
	hmap.put(2, e2);
	hmap.put(4, e4);
	hmap.put(5, e5);
	hmap.put(3, e3);
	
	
	
	//-----------Assign Manager to last Name of Employee with highest salary------------//
	
	/*Set s1 = hmap.entrySet();
	
	TreeSet t = new TreeSet(hmap.values());
	Employee e = (Employee)t.last();
	String s = (String)e.getEmpLName();
	
	e.setEmpLName(s.concat(" Manager"));
	
	System.out.println(s1);*/
	
	
	//-----------Remove Employee with lowest salary------------//
	
	Set s1 = hmap.entrySet();
	TreeSet t = new TreeSet(hmap.values());
	//Employee el = (Employee)t.first();

	Iterator itr = s1.iterator();
	while (itr.hasNext())
	{	
		Map.Entry m = (Map.Entry)itr.next();
		Employee e = (Employee) m.getValue();
		
		if (e.equals(t.first()))
		{
			//Object key = m.getKey();
			hmap.remove(m.getKey());
		}
		
	}
	System.out.println(s1);
	
	//-----------Change Salary of a particular Employee------------//

	 /* Set s1 = hmap.entrySet();
	
	Iterator itr = s1.iterator();
	while (itr.hasNext())
	{	
		Map.Entry m = (Map.Entry)itr.next();
		
		if (m.getKey().equals(2))
		{
			Employee e = (Employee) m.getValue();
			e.setEmpSal(15_00_000);
		}
		System.out.println(m.getKey()+"..."+m.getValue());
		
	}*/
	
	

}
	
}
