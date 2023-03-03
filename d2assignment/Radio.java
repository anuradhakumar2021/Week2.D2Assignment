package week2.d2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//h5[text()='Your most favorite browser'])/following::table[1]//tr[1]/td[1]")).click();
		driver.findElement(By.xpath("(//h5[text()='UnSelectable'])/following::label[2]")).click();
		WebElement radiobtn = driver.findElement(By.xpath("(//h5[text()='Find the default select radio button'])/following::table[1]//tr[1]/td[3]"));
		System.out.println("The default radiobutton is " + radiobtn.getText());
		WebElement defAgeGrp = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		System.out.println("The default age group is " + defAgeGrp.getText());
        driver.close();
	}

}
