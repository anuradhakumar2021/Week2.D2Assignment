package week2.d2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.xpath("//div[contains(@data-iconstates,'ui-icon-closethick')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch-slider')]")).click();
		WebElement verifyTextBox = driver.findElement(By.xpath("//span[@class='ui-chkbox-label ui-state-disabled']"));
		 System.out.println("Verify the text box disabled or not :" + verifyTextBox.getText());
	    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
	    driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div")).click();
	    driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div")).click();
	    driver.findElement(By.xpath("//label[text()='Rome']/preceding-sibling::div")).click();
	    Thread.sleep(3000);
        driver.close();
	}

}
