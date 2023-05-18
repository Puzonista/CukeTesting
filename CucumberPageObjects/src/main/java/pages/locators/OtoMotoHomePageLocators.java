package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OtoMotoHomePageLocators {
	
	@FindBy(how=How.LINK_TEXT,using="Wyszukiwanie zaawansowane")
	public WebElement WyszukiwanieZaawansowane;

	
}