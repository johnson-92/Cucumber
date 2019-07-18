package org.cts.testing2.Stepdefinition;

//import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectrepository.AddTariffPage;

public class StepDefinition extends AddTariffPage {
	// static WebDriver driver;
	@Given("The user should be telecom homepage and click the add tariff plan")
	public void the_user_should_be_telecom_homepage_and_click_the_add_tariff_plan() {
		System.out.println("1");
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\PRATHEEP
		// A\\eclipse-workspace\\Testing1\\driver\\geckodriver (2).exe");
		// driver=new FirefoxDriver();
		Hooks.driver.get("http://demo.guru99.com/telecom/index.html");
		Hooks.driver.manage().window().maximize();
		Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("User should fill the required info and click submit {string},{string},{string},{string},{string},{string},{string}")
	public void user_should_fill_the_required_info_and_click_submit(String Rental, String LocMin, String InterMin,
			String SmsPack, String MinCharge, String InterCharge, String SmsCharge) {
		System.out.println("s");
		AddTariffPage atp = new AddTariffPage();
		atp.getAddRental().sendKeys(Rental);
		atp.getAddLocMin().sendKeys(LocMin);
		atp.getAddInterMin().sendKeys(InterMin);
		atp.getAddSmsPack().sendKeys(SmsPack);
		atp.getAddMinCharge().sendKeys(MinCharge);
		atp.getAddInterCharge().sendKeys(InterCharge);
		atp.getAddSmsCharge().sendKeys(SmsCharge);
		atp.getAddSubmit().click();
	}

	@Then("Validate if the tariff is added or not")
	public void validate_if_the_tariff_is_added_or_not() throws InterruptedException {

		System.out.println("given 3 was done");
		Thread.sleep(5000);
		WebElement hometxt = Hooks.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
	String optxt = hometxt.getText();
	System.out.println(optxt);
		System.out.println("f");// Hooks.method2();
	}

}
