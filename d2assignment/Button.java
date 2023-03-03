package week2.d2assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Button {

	public static void main(String[] args) {
		/*https://www.leafground.com/button.xhtml
1. Click and Confirm title
2. Confirm if the button is disabled
3. Find the position of the Submit button
*/
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title2 = driver.getTitle();
		System.out.println("Click and confirm title : " + title2);
		driver.navigate().back();
		boolean isDisabledBut = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled();
		if(isDisabledBut!=true) {
			System.out.println("Confirm if the button is disabled: Yes button is disabled");
		}else {
			System.out.println("Confirm if the button is disabled: Yes button is enabled");

		}
		
		//WebElement verifyDisable = driver.findElement(By.xpath("//span[text()='Disabled']"));
		//System.out.println("Verify the text box disabled or not :" + verifyDisable.getText());
		Point location = driver.findElement(By.xpath("//span[text()='Save']")).getLocation();
			System.out.println("Find the position of the submit button : "+location);
			String subBtnClr = driver.findElement(By.xpath("(//button[@role='button'])[4]")).getCssValue("background-color");
			System.out.println("Save the button color : " + subBtnClr);
        int subwdth = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize().getWidth();
           System.out.println("The width of the button is :" + subwdth);
		int buttonHeight = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize().getHeight();
			   System.out.println("The height of the button is :" +buttonHeight);
	}

}
