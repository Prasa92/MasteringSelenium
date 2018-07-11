package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class testfileReadOnly {
	/*public static void main(String[] args) {	
	Scanner in= new Scanner(System.in);
	String i = in.nextLine();
	String outpt = i.replaceAll("[AEIOUaeiou]", "");
	System.out.println(outpt);
	}*/
	
	public static void main(String[] args) {
		getmostfreqelement(new int[] {5,4,1,5,5,6,9,3,2,1,5,5,6,9,5});
	}
	
	static void getmostfreqelement(int[] arr){
		HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
		
		for(int i : arr){
			if(elementCountMap.containsKey(i)){
				elementCountMap.put(i,elementCountMap.get(i)+1);
			}else
				elementCountMap.put(i,1);
		}
		int element =0;
		int frequency =1;
		Set<Entry<Integer, Integer>> entrySet = elementCountMap.entrySet();
		 for (Entry<Integer, Integer> entry : entrySet) 
	        {
	            if(entry.getValue() > frequency)
	            {
	                element = entry.getKey();
	                frequency = entry.getValue();
	            }
	        }
	        //Printing the most frequent element in array and its frequency
	        if(frequency > 1)
	        {
	            System.out.println("Input Array : "+Arrays.toString(arr));
	             
	            System.out.println("The most frequent element : "+element);
	             
	            System.out.println("Its frequency : "+frequency);
	             
	            System.out.println("========================");
	        }
	        else
	        {
	            System.out.println("Input Array : "+Arrays.toString(arr));
	             
	            System.out.println("No frequent element. All elements are unique.");
	             
	            System.out.println("=========================");
	        }
	}
	
}
