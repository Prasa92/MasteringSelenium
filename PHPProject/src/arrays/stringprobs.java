package arrays;

public class stringprobs {
	public static void main(String[] args) {
		String in="998";
		int sum=0;
		for(int i=0;i<in.length();i++){
			char x= in.charAt(i);
			sum=sum+(int)Character.getNumericValue(x);
		}
		System.out.println(sum);
	}
}
