package steps;

import io.cucumber.java.en.And;

public class LoginProsSteps {

	@And("user validates capcha image")
	public void user_validates_capcha_image() {
	   System.out.println("@And --- user validate captcha image");
	}
}
