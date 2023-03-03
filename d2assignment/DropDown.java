package week2.d2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//select[@class='ui-selectonemenu']/parent::div")).click();
		driver.findElement(By.xpath("//option[text()='Playwright']")).click();
		/*WebElement findElementDD = driver.findElement(By.xpath("//div[@class='grid formgrid']//select[@class='ui-selectonemenu']"));
		  Select uiAutoDD = new Select(findElementDD );
		  uiAutoDD.selectByIndex(2);*/
	    driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	    driver.findElement(By.xpath("//li[text()='India']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//label[text()='Select City']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div/button[contains(@class,'ui-autocomplete-dropdown')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//li[text()='Playwright']")).click();
	    driver.findElement(By.xpath("//label[text()='Select Language']")).click();
	    driver.findElement(By.xpath("//li[text()='English']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//label[text()='Select Values']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[text()='Two']")).click();
        driver.close();
		  
	}

}
