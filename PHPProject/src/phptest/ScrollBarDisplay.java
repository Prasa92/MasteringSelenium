package phptest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class ScrollBarDisplay {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		/*System.setProperty("webdriver.chrome.driver", "C:/Eclipse/MasterSelenium/drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/demos/");
		driver.manage().window().maximize();*/
		
		// Property Files Usage
		Properties prop = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\object.properties");
		prop.load(objfile);
		System.out.println(prop.getProperty("one"));
		System.out.println(prop.getProperty("two"));
		System.out.println(prop.getProperty("prasanth"));
		System.out.println(prop.getProperty("one"));
		System.out.println(prop.getProperty("one"));
		
		/*Thread.sleep(3000);
		//JavaScriptExecutor
		JavascriptExecutor jsscript= (JavascriptExecutor) driver;
		jsscript.executeScript("alert('Test Case Execution Is started Now..');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();*/
		
		
		/*JavascriptExecutor javascript = (JavascriptExecutor) driver;
		  //Check If horizontal scroll Is present or not.
		 Boolean b1 = (Boolean) javascript.executeScript("return document.documentElement.scrollWidth>document.documentElement.clientWidth;");
		 Boolean b2 = (Boolean) javascript.executeScript("return document.documentElement.scrollHeight>document.documentElement.clientHeight;");
		 if(b2){
			 System.out.println(b2);
		 }else{
			 System.out.println(b2);
		 }*/
	}
}
