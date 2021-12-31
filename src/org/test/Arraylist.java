package org.test;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
								
			ArrayList l = new ArrayList();
			
			
			l.add("kumar");
			l.add("mani");
			l.add(20);
			l.add(123.12);
			l.add(20);
			
			System.out.println(l);
			
			
			//get method
			Object object = l.get(2);
			System.out.println(object);
			
			//index
			int indexOf = l.indexOf(20);
			System.out.println(indexOf);
			
			//last index
			int lastIndexOf = l.lastIndexOf(20);
			System.out.println(lastIndexOf);
			
			
			
		//set(replace)
			l.set(2, 40);
			System.out.println(l);
			
			l.set(0, "ajay");
			System.out.println(l);
			
			
			//for(order)
				for (int i = 0; i<l.size(); i++) {
					System.out.println(l.get(i));
					
				}
			
		
		
		
		
		}	
		
		
		
		
		
		
		
		
		
		

	}


