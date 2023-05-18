package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OtoMotoWZPageLocators {
	

	@FindBy(how=How.XPATH,using="//*[@id=\"page-header\"]/div/div[2]/div/div/div/button[1]")
	public WebElement MenuDropdown;

	@FindBy(how=How.XPATH,using="//form/section/div/div[1]/div/div/input")
	public WebElement MarkaPojazduDropDown;
	
	@FindBy(how=How.XPATH,using="//div/form/section/div/div[2]/div/fieldset/input")
	public WebElement ModelPojazduDropDown;
	
	@FindBy(how=How.XPATH,using="//div[2]/div[1]/div/form/section/div/div[7]/div/fieldset/input")
	public WebElement RodzajPaliwaDropDown;
	
	@FindBy(how=How.XPATH,using="//form/section/div/div[1]/div/div/input")
	public WebElement CenaDo;
	
	@FindBy(how=How.XPATH,using="//div[3]/div[1]/div[1]/a[2]")
	public WebElement UzywaneBtn;
	
	@FindBy(how=How.XPATH,using="//div[3]/div[1]/div[1]/a[1]")
	public WebElement WszystkieBtn;
	
	@FindBy(how=How.XPATH,using="//div[3]/div[1]/div[1]/a[3]")
	public WebElement NoweBtn;
}

