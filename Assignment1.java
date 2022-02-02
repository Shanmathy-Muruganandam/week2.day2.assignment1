package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
         //( A normal click will do for this step) 


public class Assignment1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Baalaajee");
		driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("Balakrushnan");
		driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("9629441875");
		driver.findElement(By.xpath("//input[@id ='password_step_input']")).sendKeys("BagyaLakshmi");
		WebElement day = driver.findElement(By.xpath("//select[@name ='birthday_day']"));
		Select day1 = new Select(day);
		day1.selectByValue("14");
		WebElement month = driver.findElement(By.xpath("//select[@id ='month']"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("Jul");
		WebElement year = driver.findElement(By.xpath("//select[@id ='year']"));
		Select year1 = new Select(year);
		year1.selectByValue("1995");
		driver.findElement(By.xpath("(//input[@name = 'sex'])[2])).click();
		
	}

}
