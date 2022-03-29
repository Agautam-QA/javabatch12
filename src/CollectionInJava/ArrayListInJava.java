package CollectionInJava;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.30f);
		al.add("ScriptQA");
		al.add(10);
		al.add(10.30f);
		al.add(null);
		System.out.println(al);
		
//result prints "[10, 10.3, ScriptQA, 10, 10.3, null]
		// different data types and duplicate all allowed here
		
		// we also can resolve with for loop as below
		for(Object element:al) {
			System.out.println(element);
		}
	}

}
