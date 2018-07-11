package generics;

public class Genr1 {
	public static void main(String[] args) {
		GenericClass<Integer , String> get = new GenericClass<Integer, String >(5689,"Prasanth");
		System.out.println(get.getT());
	}
}
