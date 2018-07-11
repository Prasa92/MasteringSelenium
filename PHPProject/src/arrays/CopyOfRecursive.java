package arrays;

public class CopyOfRecursive {
	
	static class Test{  
		 public static void printName(Object obj){  
		  Class c=obj.getClass();    
		  System.out.println(c.getName());  
		  }  
		
		  public static void main(String args[]){  
			  CopyOfRecursive s=new CopyOfRecursive();  
			  Test.printName("obj");
		   /*Test t=new Test();  
		   t.printName(s);  */
		 }
		  
	}
}