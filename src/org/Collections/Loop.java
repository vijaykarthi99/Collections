package org.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Loop {
	private void whil() {
		int i=0;
			while(i<4) {
				System.out.println(i);
				i++;
			}
			System.out.println("*****");
	
		int j=0;
		do {
			System.out.println(j);
			j++;
		}
		while(j<4);
	}
	public static void main(String[] args) {
		Loop l=new Loop();
		l.whil();
		System.out.println("*****");
		List<Integer> li =new ArrayList();
		li.add(10);//0
		li.add(200);//1
		li.add(10);//2
		li.add(400);//3
		li.add(10);//4
		
		System.out.println(li);
		Integer in = li.get(0);
		System.out.println(in);
		System.out.println("**************");
		int count=0;
		for (int i = 0; i < li.size(); ++i) {
			Integer io = li.get(i);
			System.out.println(io);
			
			if (io==10) {
				count=count+i;
				System.out.println("index values of"+count);
							
			}			
		}
		
		
//		System.out.println(clone);
		
		
		
		
		
		
		
		
	}
}