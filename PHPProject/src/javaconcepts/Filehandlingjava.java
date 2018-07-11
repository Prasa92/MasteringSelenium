package javaconcepts;

import java.io.File;
import java.io.IOException;

public class Filehandlingjava {

	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.home");
	    File dir=new File(path+"/new folder");
	    String pat=dir.toString();
		//String fi= "C://temp.txt";
		File fs = new File("pat");
		System.out.println(pat);
		System.out.println(fs);
	//	fs.mkdir();
		Boolean flag=fs.createNewFile();
		try {
			if(flag) {
				System.out.println("file created successfully");
			}else {
				System.out.println("file not created successfully");
			}
		} catch (Exception e){
			e.getMessage();
		}
		
	}

}
