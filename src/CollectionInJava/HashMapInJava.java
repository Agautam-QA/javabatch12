package CollectionInJava;

import java.util.HashMap;

public class HashMapInJava {

	public static void main(String[] args) {
		// This can be hertogeneous , key and value allowed
		// key can't be duplicate but value can be
		
		//HashMap<Integer,String> map=new HashMap<>();or
		HashMap map=new HashMap();
		map.put(1001, "Tom");// 1001 is key and Tom is value
		map.put(1002, "Ajay");
		map.put(1003, "Amit");
		map.put(1005, "Java");
		System.out.println(map);//{1001=Tom, 1002=Ajay, 1003=Amit, 1005=Java}
		
		//to get the value of key
		System.out.println(map.get(1001));//Tom
		
		//contains
		System.out.println(map.containsValue(1010));

	}

}
