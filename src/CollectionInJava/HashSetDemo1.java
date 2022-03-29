package CollectionInJava;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// duplicate not allowed, insertion not preserved
		
		HashSet hs=new HashSet<>();
		hs.add(30);
		hs.add(40);
		hs.add('C');
		hs.add(30);
		hs.add("Java");
		hs.add(null);
		System.out.println(hs); //[null, Java, C, 40, 30]
		System.out.println(hs.add("Python"));// true
		System.out.println(hs);//[null, Java, C, 40, 30, Python]
		
		//System.out.println(hs.addAll());
		

	}

}
