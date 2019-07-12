package page.classes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;

	@FindBy(id="header-history")
	WebElement headerHistory;
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightsTab;
	
	@FindBy(id="flight-type-roundtrip-label-hp-flight")
	WebElement roundTrip;
	
	@FindBy(id="flight-origin-hp-flight")
	WebElement flightOrigin;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement flightDestination;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departureDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate;
	
	@FindBy(xpath=("//button[@class='btn-primary btn-action gcw-submit']"))
	WebElement searchButton;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
//		PageFactory.initElements(driver, this);					commented out when using grid
	}
	
	
	public void clickFlightsTab() {
		flightsTab.click();
	}
	
	public void clickRoundTrip () {
		roundTrip.click();
	}
	
	public void enterFlightOrigin (String origin) {
		flightOrigin.sendKeys(origin);
	}
	
	public void enterFlightDestination (String destination) {
		flightDestination.sendKeys(destination);
	}

	public void enterDepartureDate (String depdate) {
		departureDate.sendKeys(depdate);
	}
	
	public void clickReturnDate () {
		returnDate.click();
	}
	
	public void clearReturnDate () {
		returnDate.sendKeys(Keys.CONTROL + "a");
		returnDate.sendKeys(Keys.DELETE);
	}
	
	public void enterReturnDate (String retdate) {
		returnDate.sendKeys(retdate);
		returnDate.click();
	}
	
	public void clickSearchButton () {
		searchButton.click();
	}
	
}
