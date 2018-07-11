package arrays;
public interface Arr1 {

	public static void main(String[] args){
		int arr[]= method();	
		for(int i=0;i<arr.length;i++){
			System.out.println("Array values at location "+i+" are :"+arr[i]);
		}
	}
	
	public static int[] method(){
		return new int[]{1,2,3,5};
	}
}
//Returning array values from the methods*****