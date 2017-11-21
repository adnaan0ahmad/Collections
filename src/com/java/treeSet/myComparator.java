package com.java.treeSet;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class myComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Employee e1=null;
		if (o1 instanceof Employee) 
			e1 = (Employee) o1;
		
		Employee e2 = (Employee)o2;
		
		if (e1.getEmpId()<e2.getEmpId())
			return -1;
		else if (e1.getEmpId()>e2.getEmpId())
			return 1;
		else		
		return 0;

		
	
	}

}
