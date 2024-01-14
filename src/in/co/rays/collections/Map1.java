package in.co.rays.collections;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
		Map m1 = new HashMap();
		m1.put(6, "One");
		m1.put(2, "Two");
		m1.put(3, "Three");
		m1.put(4, "Four");
		m1.put(5, "Five");
		System.out.println("Hashmap after adding elements: " + m1);
		System.out.println("Contains Key (true or false): " + m1.containsKey(6));
		System.out.println("Contains Value (true or false): " + m1.containsValue("Four"));
		System.out.println("Set view is: " + m1.entrySet());
		System.out.println("GetValue of key 3 is: " + m1.get(3));
		System.out.println("Whether it is empty (true or false): " + m1.isEmpty());
		System.out.println("Key Set: " + m1.keySet());
		m1.remove(5);
		System.out.println("Hashmap after removing key 5: " + m1);
		System.out.println("Size of hashmap is: " + m1.size());
		System.out.println("Values of Hashmap is: " + m1.values());
		m1.clear();
		System.out.println("List after clear " + m1);
	}
}
