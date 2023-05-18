package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.OtoMotoHomePageLocators;
import utils.Base;

public class OtoMotoHomePageActions {


	OtoMotoHomePageLocators otoMotoHomePageLocators=null;
	
	public OtoMotoHomePageActions() {
		
		this.otoMotoHomePageLocators= new OtoMotoHomePageLocators(); {
			PageFactory.initElements(Base.driver, otoMotoHomePageLocators);
			
		}
	}
	public void clickOnWyszukiwanieZaawansowane() {
		otoMotoHomePageLocators.WyszukiwanieZaawansowane.click();
	}
	}
