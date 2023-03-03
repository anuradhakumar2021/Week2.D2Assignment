package week2.d2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Anuradha");
		driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("CSK");
		driver.findElement(By.name("departmentName")).sendKeys("Physiotherapy");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Handling rehabilitation patients");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("k_anu_bpt@yahoo.co.in");
		driver.findElement(By.name("generalStateProvinceGeoId")).click();
        driver.findElement(By.xpath("//option[text()='New York']")).click();
        driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.xpath("//textarea[text()='Handling rehabilitation patients']")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Inpatients needed rehabilitation care treatments.");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Contact")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is wrong");
		}
		driver.close();
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 
		 * 6. Click on Create Contact
		 *  
		 * 7. Enter FirstName Field Using id Locator
		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button 
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.
         */
	}

}
