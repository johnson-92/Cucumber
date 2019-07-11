package org.cts.testing2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTariffPage {
	
	public AddTariffPage() {
		PageFactory.initElements(Hooks.driver, this);
		
	}
	@FindBy(id="rental1")
	private WebElement addRental;
	@FindBy(id="local_minutes")
	private WebElement addLocMin;
	@FindBy(id="inter_minutes")
	private WebElement addInterMin;
	@FindBy(id="sms_pack")
	private WebElement addSmsPack;
	@FindBy(id="minutes_charges")
	private WebElement addMinCharge;
	@FindBy(id="inter_charges")
	private WebElement addInterCharge;
	@FindBy(id="sms_charges")
	private WebElement addSmsCharge;
	@FindBy(name="submit")
	private WebElement addSubmit;
	public WebElement getAddRental() {
		return addRental;
	}
	public WebElement getAddLocMin() {
		return addLocMin;
	}
	public WebElement getAddInterMin() {
		return addInterMin;
	}
	public WebElement getAddSmsPack() {
		return addSmsPack;
	}
	public WebElement getAddMinCharge() {
		return addMinCharge;
	}
	public WebElement getAddInterCharge() {
		return addInterCharge;
	}
	public WebElement getAddSmsCharge() {
		return addSmsCharge;
	}
	public WebElement getAddSubmit() {
		return addSubmit;
	}

}
