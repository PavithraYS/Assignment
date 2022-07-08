package training;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {
		
		        String str = "ABC has completed Engineering in Nov 2021 and ABC started working as software engineer from Dec 2021";
		        //splitting inputstring into words
		        String[] words = str.toLowerCase().trim().split(" ");
		        //create one hashmap 
		        // string are inserted as keys and the respective count inserted as value
		        Map<String, Integer> duplicateString = new HashMap<>();
		        int count = 1;
		        //to check each word
		        for (String x : words) {
		        	//whether it is present in dublicateString
		            if (duplicateString.containsKey(x)) {
		            	//if it is present,incrementing it's count by 1
		                duplicateString.put(x, duplicateString.get(x) + 1);
		            } else {
		            	//if it is not present,put that word into dublicatrString with 1 as its value
		                duplicateString.put(x, count);
		            }
		        }
		        System.out.println("Duplicate Words in a String : ");
		        //using entryset()to get the entry of map
		        for (Map.Entry a : duplicateString.entrySet()) {
		        	//using the getvalue to get the value of the a element
		            int val = (Integer) a.getValue();
		            //if word count is greter than 1
		            if (val > 1) {
		                System.out.println(a);
		                System.out.println("hii");
		            }
		        }
		    }
		

	}


