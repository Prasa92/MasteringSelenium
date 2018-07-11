package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidation {
	
	public Pattern pattern;
	public Matcher matcher;
	private static final String USERNAME_PATTERN = "[a-zA-Z0-9_-]{3,15}$";
	
	public UserNameValidation(){
		pattern = Pattern.compile(USERNAME_PATTERN);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the User Name");
		String username = in.nextLine();
		UserNameValidation regx = new UserNameValidation();
		boolean flag= regx.UserValidator(username);
		if(flag){
		   System.out.println("User name is valid");
		}
		else{
		   System.out.println("User name is not valid");
		}
		in.close();
	}
	
	public Boolean UserValidator(String name){
		matcher= pattern.matcher(name);
		return matcher.matches();
	}
	
}
