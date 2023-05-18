package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.Base;

public class SearchCarsSteps {

	@Given("I am on Home Page {string} of Otomoto website")
	public void i_am_on_home_page_of_otomoto_website(String websiteURL) {
	  Base.openPage(websiteURL);
	}

	@And("I click on {string} link")
	public void i_click_on_link(String string) {
	    
	}

	@And("Select carbrand as {string} from MarkaPojazdu dropdown")
	public void select_carbrand_as_from_marka_pojazdu_dropdown(String string) {
	    
	}

	@And("Select carmodel as {string} from ModelPojazdu dropdown")
	public void select_carmodel_as_from_model_pojazdu_dropdown(String string) {
	    
	}

	@And("Select fuel as {string} from RodzajPaliwa dropdown")
	public void select_fuel_as_from_rodzaj_paliwa_dropdown(String string) {
	    
	}

	@And("type price as {string} from CenaDo")
	public void type_price_as_from_cena_do(String string) {
	    
	}

	@And("click on Uzywane button")
	public void click_on_uzywane_button() {
	    
	}

	@Then("i should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
	    
	}

	@Then("the page title should be {string}")
	public void the_page_title_should_be(String string) {
	    
	}

}
