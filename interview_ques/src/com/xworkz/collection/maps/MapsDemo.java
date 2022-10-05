package com.xworkz.collection.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsDemo {
	
	//methods inside Map
	
	//put(Object key, Object value): Object (returns the value, that replaced if the key is already
	//present or else null
	
	//void(Map map): Object
	//get(Key) :Object
	//remove(Key): Object
	//containsKey(key): booleans
	//containsValue(value): boolean
	//isEmpty(): boolean
	//size(): int
	//clear(): void

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(12, "akash");
		map.put(13, "adi");
		map.put(14, "adi");
		map.put(15, "hads");
		map.put(16, "wewe");
		
		System.out.println(map);
		
		System.out.println(map.keySet());//to get set of keys
		
		System.out.println(map.values());//to get all values
		
		Set s = map.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> m = (Map.Entry) itr.next();
			System.out.println(m.getKey());
		}
		
	}
}
