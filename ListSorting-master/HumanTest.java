package io.naztech.Collection_sort;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class HumanTest extends TestCase {
	@Test
	public void testCompareTo() {
	    
	    List<Human> hlist22= new ArrayList<Human>();
	    hlist22=unsortedList();
	    List<Human> expected= new ArrayList<Human>();
	    expected=salarySortedList();
	    List<Human> actual = new ArrayList<Human>(hlist22);
	    Collections.sort(actual);
	    int count=0;
	    int count1=0;
	   
	    assertEquals(expected.toString(),actual.toString());
	   
	    
	}

	private List<Human> salarySortedList() {
		// TODO Auto-generated method stub
		 List<Human> hlist= new ArrayList<Human>();
		 hlist.add(new Human(24,"lipi",500));
		 hlist.add(new Human(21,"kona",1000));
		 hlist.add(new Human(20,"nisha",2000));
		 hlist.add(new Human(22,"mithila",3000));
		 hlist.add(new Human(23,"mim",6000));
		 
		
		 
		 return (List<Human>)hlist;

	}

	private List<Human> unsortedList() {
		 List<Human> hlist2= new ArrayList<Human>();
		 hlist2.add(new Human(20,"nisha",2000));
		 hlist2.add(new Human(22,"mithila",3000));
		 hlist2.add(new Human(21,"kona",1000));
		 hlist2.add(new Human(24,"lipi",500));
		 hlist2.add(new Human(23,"mim",6000));
		 return (List<Human>)hlist2;
	}
} 
