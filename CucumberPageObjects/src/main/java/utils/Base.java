package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

private static Base base;

public static WebDriver driver;
private Base(){
	
	if(driver==null) {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	
}
}
public static void openPage(String websiteURL) {
	
	driver.get(websiteURL);
}

public static void tearDown() {
	
	if(driver !=null) {
		driver.close();
		driver.quit();
	}
}

public static void setUpBase() {
	if(base==null) {
		base= new Base();
	}
}
}
