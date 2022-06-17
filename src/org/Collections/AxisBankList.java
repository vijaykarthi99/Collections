package org.Collections;

import java.util.LinkedList;

import java.util.List;


public class AxisBankList {
	

	public static void main(String[] args) {
		
		List li = new LinkedList<>();
		//add valeus
		li.add(11);        //0  
		li.add("mani");   //1
		li.add('A');       //2
		li.add("Vijay");    //3
		li.add(2334455664.455f);//4
		li.add(645546623322l);  //5
		li.add("true");         //6
		System.out.println(li);
		//find size
		int size = li.size();
		System.out.println(size);
		// get index value particularly
		Object object = li.get(5);
		System.out.println(object);
		// to remove
		li.remove(4);
		System.out.println(li);
		// to add index based
		li.add(2, "Jack");
		System.out.println(li);
		//replace the values
		li.set(0, "vijay(11)");
		System.out.println(li);
		
		
		
		
		
		
		
	}

}
