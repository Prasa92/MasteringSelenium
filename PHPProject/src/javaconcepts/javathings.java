package javaconcepts;

public class javathings {
	
 public static int x=10;
 static int y=20;
 static String p="wixx";
 int j;
 public javathings(){
	 
	 System.out.println("This is Constructor");
 }
 
 public static void main(String[] args) {
	 System.out.println(x);
	 System.out.println(y);
	 System.out.println(p);
	 javathings gr= new javathings();
	 gr.nonstatic();
}
 
public void nonstatic(){
	System.out.println(j);
	 System.out.println(x);
	 System.out.println(y);
	 System.out.println(p);
}
}
