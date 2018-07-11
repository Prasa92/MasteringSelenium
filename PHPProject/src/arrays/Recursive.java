package arrays;

public class Recursive {
	
	static class Test{  
		 public static void printName(Object obj){  
		  Class c=obj.getClass();    
		  System.out.println(c.getName());  
		  }  
		
		  public static void main(String args[]){  
			  Recursive s=new Recursive();  
			  Test.printName("obj");
		   /*Test t=new Test();  
		   t.printName(s);  */
		 }
		  
	}
}