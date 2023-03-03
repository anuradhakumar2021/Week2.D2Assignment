package week2.d2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundAssignments {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[1]")).sendKeys("Anuradha"); 
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[2]")).sendKeys(", India");
		boolean enabled = driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[3]")).isEnabled();
		if(enabled==false) {
			System.out.println("text box is disabled");
		}
		else {
			System.out.println("text box is enabled");
		}
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[4]")).clear();
		System.out.println("The typed text Retrieved: "+driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[5]")).getAttribute("value"));
		WebElement findEmail = driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[6]"));
		
		findEmail.sendKeys("anu.kumar.venkatesan@gmail.com");
		findEmail.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//textarea)")).sendKeys("This is Anu from Chennai!");
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='ql-picker-options']/span)[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ql-header'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ql-editor'])[1]")).sendKeys("Testing");
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[9]")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		String textError = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		System.out.println("Just Press Enter and confirm error message* : "+textError);


		
		
		
		//https://www.leafground.com/input.xhtml
			//1. Type your name
			//2. Append Country to this City
			//3. Verify if text box is disabled
			//4. Clear the typed text
			//5. Retrieve the typed text
			//6. Type email and Tab. Confirm control moved to next element
			//7. Type about yourself
			//8. Text Editor
			//9. Just Press Enter and confirm error message*
			//10. Click and Confirm Label Position Changes
			//11. Type your name and choose the third option
			//12. Click and Confirm Keyboard appears
			//13. Custom Toolbar

	}

}
