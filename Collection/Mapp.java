package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		m.put(1, "java");
		m.put(2, null);
		m.put(3, null);
		m.put(5, "python");
		m.put(4, "java");
		m.put(null, "hello");
		m.put(null, "c++");
		//System.out.println(m.computeIfAbsent(6, null));
		System.out.println(m);
		m.clear();
		System.out.println(m); 
		
		int arr[]= {1,2,3,2,5,7,3,4,4,2,8};
		calculateFrequencyOfElementInArray(arr);
		
		String s="geekforgeek";
		System.out.println(calculateFrequencyOfElementInString(s));

	}
	
	static void calculateFrequencyOfElementInArray(int arr[]) {
		HashMap<Integer, Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(h.containsKey(arr[i]))
			{
				int previous=h.get(arr[i]);
				h.put(arr[i], previous+1);
			}
			else
			{
				h.put(arr[i], 1);
			}
		}
		System.out.println(h);
		//find the duplicates
		for(Map.Entry<Integer, Integer>m:h.entrySet()) {
			//System.out.println(m.getKey());
			if(m.getValue()>1) {
				System.out.println(m.getKey());
			}
		}
	}
	
	static String calculateFrequencyOfElementInString(String s) {
		
		String ans="$";
		LinkedHashMap<String, Integer> h=new LinkedHashMap<String,Integer>();
		for(int i=0;i<s.length();i++) {
			String key = Character.toString(s.charAt(i));  // Key is always a String
			if(h.containsKey(key))
			{
				int previous=h.get(key);
				h.put(key, previous+1);
			}
			else
			{
				h.put(key, 1);
			}
		}
		System.out.println(h);
		//Find the First Non repeating character
		for(Map.Entry<String, Integer>m:h.entrySet()) {
			//System.out.println(m.getKey());
			if(m.getValue()==1) {
				ans=m.getKey();
				break;
			}
		}
		return ans;
	}
	

}
