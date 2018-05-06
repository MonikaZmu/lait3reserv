package pl.lait.przychodnia3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Init {

	static WebDriver driver = null;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monika\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		System.out.println("--------wewnąrz metody getDriver--------------");

		if (driver == null) {
			System.out.println("--------wewnąrz IFa, FF jest już uruchomiony --------------");

			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			driver.get("http://newtours.demoaut.com");
			return driver;
		} else {
			return driver;
		}
	}

	public static void endTest() {
		driver.quit();
		driver = null;
	}

	/**
	 * Usypia wątek na X sekund
	 * 
	 * @param seconds
	 */
	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void log(String tekst) {
		System.out.print("---");
		System.out.print(tekst);
		System.out.println("---");
	}

}
