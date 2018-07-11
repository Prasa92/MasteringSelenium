package phptest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ashotScreenshot {
	
	public static RemoteWebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Eclipse/MasterSelenium/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/demos/");
		driver.manage().window().setSize(new Dimension(300,250));		
		Thread.sleep(3000);
		WebElement ele=driver.findElementByXPath("//*[text()='API Documentation']");
		captureelementscreenshot(ele);
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("javascript.enabled", false);
	}
		public static void captureelementscreenshot(WebElement elem) throws IOException{
			File scrnsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			int height= elem.getSize().getHeight();
			int width= elem.getSize().getWidth();
			Point pt= elem.getLocation();
			BufferedImage img = ImageIO.read(scrnsht);
			BufferedImage dest = img.getSubimage(pt.getX(),pt.getY(),width,height);
			ImageIO.write(dest, "png", scrnsht);  
			FileUtils.copyFile(scrnsht, new File("C:\\SeleniumScreenshots.jpeg"));
		}
}