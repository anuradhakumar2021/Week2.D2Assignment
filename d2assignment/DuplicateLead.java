package week2.d2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement((By.className("decorativeSubmit"))).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("anu.kumar.venkatesan@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement firstLead = driver.findElement(By.xpath("//a[text()='Anuradha'][1]"));
		String ExpectedLead = firstLead.getText();
		System.out.println("Expected name of the lead is " + ExpectedLead);
		firstLead.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Duplicate Lead")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is wrong");
		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		WebElement firstLeadName = driver.findElement(By.id("viewLead_firstName_sp"));
		String actualLeadName = firstLeadName.getText();
		if(ExpectedLead.equals(actualLeadName)) {
			System.out.println("Both Names Matches");
		} 
		else {
			System.out.println("Both Names not Matches");
		}
		/*http://leaftaps.com/opentaps/control/main
 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
		*/
	}

}
