package arraylistAndHashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapsDemo {
	public static void main(String args[]) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "One");
		map.put(2, "Two");
		
		for(Entry m : map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
	}
}
