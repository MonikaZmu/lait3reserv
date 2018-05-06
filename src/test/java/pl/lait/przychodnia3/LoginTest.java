package pl.lait.przychodnia3;


import static org.junit.Assert.assertTrue;
import static pl.lait.przychodnia3.Init.getDriver;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class LoginTest {

	WebDriver driver = null;
	@Before
	public void openPage() {
		driver =  getDriver();
		
	}
	@Ignore
	@Test
		public void clickOnMenuItems() {
		
			System.out.println(driver.getTitle());
			assertTrue("Nie odnaleziono strony", driver.getTitle().equals("Welcome: Mercury Tours"));
			
			System.out.println("test clickOnMenuItems");
			driver.findElement(By.linkText("SIGN-ON")).click();
			driver.findElement(By.linkText("REGISTER")).click();
			driver.findElement(By.linkText("SUPPORT")).click();
			driver.findElement(By.linkText("CONTACT")).click();
		}
	@Ignore
	
	@Test
		public void logIN() {
			driver.findElement(By.linkText("SIGN-ON")).click();
			assertTrue("Nie odnaleziono strony", driver.getTitle().equals("Sign-on: Mercury Tours"));
			driver.findElement(By.name("userName")).sendKeys("monika_z");
			driver.findElement(By.name("password")).sendKeys("12345");
			driver.findElement(By.name("login")).click();
			driver.findElement(By.linkText("CONTACT")).click();
	}
	
	@After
	
		public void tearDown() {
			Init.endTest();
		
		
		
	}
	
	
	
	
}
