import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		int commonKeys = 0;
		
		for(String a : hashmap1.keySet()) {
			for(String b : hashmap2.keySet()) {
				if(a==b && hashmap1.get(a) == hashmap2.get(b))
					commonKeys++;
			}
		}
		
		return commonKeys;
	}

}
