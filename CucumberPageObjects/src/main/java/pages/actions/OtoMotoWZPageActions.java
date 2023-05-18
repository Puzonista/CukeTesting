package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import pages.locators.OtoMotoWZPageLocators;
import utils.Base;

public class OtoMotoWZPageActions {

	OtoMotoWZPageLocators otoMotoWZPageLocators=null;
	
	public OtoMotoWZPageActions() {
		
		this.otoMotoWZPageLocators= new OtoMotoWZPageLocators(); {
			PageFactory.initElements(Base.driver, otoMotoWZPageLocators);
			
		}
	}
	public void clickOnMarkaPojazdu(String carBrand) {
		otoMotoWZPageLocators.MarkaPojazduDropDown.click();
		Base.driver.findElement(By.tagName(carBrand)).click();
	}
	public void clickOnModelPojazdu(String carModel) {
		otoMotoWZPageLocators.ModelPojazduDropDown.click();
		Base.driver.findElement(By.tagName(carModel)).click();
		
	}
	public void clickOnRodzajPaliwa(String fuel) {
		otoMotoWZPageLocators.RodzajPaliwaDropDown.click();
		Base.driver.findElement(By.tagName("fuel")).click();
		
	}
	public void clickOnCenaDo(String price) {
		otoMotoWZPageLocators.CenaDo.click();
		Base.driver.findElement(By.tagName("200 000")).click();
		
	}
	public void clickOnUzywane() {
		otoMotoWZPageLocators.UzywaneBtn.click();
		
	}
	public void clickOnNowe() {
		otoMotoWZPageLocators.NoweBtn.click();
		
	}
	public void clickOnWszystkie() {
		otoMotoWZPageLocators.WszystkieBtn.click();
		
	}
}
