package phptest;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PhpTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Eclipse/MasterSelenium/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[.='http://www.phptravels.net']")).click();
		
		/*Alert simplealert = driver.switchTo().alert();
		simplealert.accept();*/
		
		Set<String>handles = driver.getWindowHandles();
		System.out.println(handles);
		
		//Getting window Handles
		for(String eachhandle : handles){
			driver.switchTo().window(eachhandle);
		}
		
		String str ="//*[text()='Search by Hotel or City Name']";
		driver.findElement(By.xpath(str)).click();
		driver.findElement(By.xpath(str)).sendKeys("Man");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='select2-result-label' and text()='Locations']/parent::*/ul/li/div/span[contains(normalize-space(),'Man')]")).click();
		driver.findElement(By.name("checkin")).click();
		
		// Handling WebTable
		WebElement bele= driver.findElement(By.xpath("//*[@class=' table-condensed']/tbody[1]"));
		List<WebElement> tableRows = bele.findElements(By.tagName("tr"));
		int rwCnt = tableRows.size();
		
		for(int i=0 ; i< rwCnt ; i++){
			List<WebElement> tableCols = tableRows.get(i).findElements(By.tagName("td"));
			for(int j=0 ; j <tableCols.size();j++ ){
				String date =tableCols.get(j).getText();
				System.out.println(date);
			}
		}
	}
	
	
	
}
