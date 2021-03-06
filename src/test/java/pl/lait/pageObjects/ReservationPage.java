package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.przychodnia3.Init;

public class ReservationPage {

	WebDriver driver;

	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/"
			+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/" + "table/tbody/tr[2]/td[2]/b/font/input[1]")

	WebElement roundTrip;

	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/"
			+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/" + "table/tbody/tr[2]/td[2]/b/font/input[2]")

	WebElement oneWay;

	@FindBy(name = "passCount")
	WebElement passCount;

	@FindBy(name = "fromPort")
	WebElement fromPort;

	@FindBy(name = "fromMonth")
	WebElement fromMonth;

	@FindBy(name = "fromDay")
	WebElement fromDay;

	@FindBy(name = "toPort")
	WebElement toPort;

	@FindBy(name = "toMonth")
	WebElement toMonth;

	@FindBy(name = "toDay")
	WebElement toDay;

	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/"
			+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/" + "table/tbody/tr[9]/td[2]/font/input")
	WebElement ecoClass;

	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	WebElement bizClass;

	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")
	WebElement firstClass;

	@FindBy(name = "airline")
	WebElement airline;

	@FindBy(name = "findFlights")
	WebElement continueBtn;

	public ReservationPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void oneWayRadioClik() {
		Init.log("Klikam w oneWay radioButton");
		oneWay.click();
	}

	public void roundTripRadioCklick() {
		Init.log("Klikam w roundTrip radioButton");
		roundTrip.click();
	}

	public void setPassengersCount(String count) {
		Init.log("Ustawiam liczbę pasażerów: "+ count);
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByVisibleText(count);

	}

	public void setDepartingFromDest(String from) {
		Select fromPortSelect = new Select(fromPort);
		fromPortSelect.selectByVisibleText(from);
	}

	public void setFromDate(String month, String day) {
		Select fromMonthSelect = new Select(fromMonth);
		fromMonthSelect.selectByVisibleText(month);

		Select fromDaySelect = new Select(fromDay);
		fromDaySelect.selectByVisibleText(day);
		
	}
		public void setArrivalInDest(String to) {
			Select fromPortSelect = new Select(toPort);
			fromPortSelect.selectByVisibleText(to);
		
	}
	/*
	 * @param month - form month
	 * @param day - form day
	 */
	public void setToDate(String month, String day) {
		Select toMonthSelect = new Select(toMonth);
		toMonthSelect.selectByVisibleText(month);

		Select toDaySelect = new Select(toDay);
		toDaySelect.selectByVisibleText(day);
	}
	
	public void setEconomicClass() {
		ecoClass.click();
	}

	public void setBusinessClass() {
		bizClass.click();
	}

	public void setFirstClass() {
		firstClass.click();
	}
	// sposób 1 - uniwersalny ( przyjmie parametr z nazwą linii lotniczej)
	/**
	 * Example data:
	 * Blue jSkies Airlines
	 * Unified Airlines
	 * Pangea Airlines
	 * @param line
	 */
	
	
	public void setAirline (String line) {
		Select airlineSelect = new Select(airline);
		airlineSelect.selectByVisibleText(line);
		
		
		
	}
	// sposób 2 - każda opcja wybierana jako osobna metoda java
					
	public void setAirline_noPreference() {
			Select  airlineSelect = new Select(airline);
			airlineSelect.selectByVisibleText("No Preference");
		}
		public void setAirline_BlueSkiesAirlines() {
			Select  airlineSelect = new Select(airline);
			airlineSelect.selectByVisibleText("BlueSkiesAirlines");
		}
		
		public void setAirline_UnifiedAirlines() {
			Select  airlineSelect = new Select(airline);
			airlineSelect.selectByVisibleText("UnifiedAirlines");
		}
		
		public void setAirline_PangeaAirlines() {
			Select  airlineSelect = new Select(airline);
			airlineSelect.selectByVisibleText("PangeaAirlines");
		}
		
	
	
	public void continueButtonClick() {
		continueBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
}
