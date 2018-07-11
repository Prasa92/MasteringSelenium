package phptest;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ActionsP{
	
	    //private static final String xpath = null;
		public static RemoteWebDriver driver;
		
		public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/Eclipse/MasterSelenium/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		ActionsP act= new ActionsP();
		driver.get("http://jqueryui.com/demos/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Robot rs= new Robot();
		
		act.ClickElement("xpath","(//*[text()='Slider'])[1]");
		driver.findElement(By.xpath("//*[text()='Range slider']")).click();
		WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement scroll = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", scroll);
		
		Point pt = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']")).getLocation();
		System.out.println(pt.getX());
		int d= pt.getX();
	    js.executeScript("window.scrollBy(500,0)", "");
	}
	
	public void ClickElement(String locator,String ele) throws InterruptedException{
		switch (locator){
		case "id":
			driver.findElement(By.id(ele)).click();
			break;
		case "xpath":
			driver.findElement(By.xpath(ele)).click();
			Thread.sleep(2000);
			break;
		default:
			break;
		}
	}
	
	public void QuitBrowser(){
		driver.quit();
	}
	
}

