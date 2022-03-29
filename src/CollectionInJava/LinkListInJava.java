package CollectionInJava;

import java.util.LinkedList;

public class LinkListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		
		ll.add(30);
		ll.add(30.34);
		ll.add("java");
		ll.add("java");
		ll.add(null);
		ll.add(10);
		System.out.println(ll);// [30, 30.34, java, java, null, 10]

	}

}
