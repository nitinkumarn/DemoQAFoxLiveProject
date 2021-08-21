package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	public CheckoutPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-payment-address")
	public static WebElement continueButtonofBillingDetails;
	
	@FindBy(id="button-shipping-address")
	public static WebElement continueButtonofDeliverydetailsButton;
	
	
	@FindBy(id="button-shipping-method")
	public static WebElement continueButtonofDeliverymethodButton;
	
	@FindBy(name="agree")
	public static WebElement termsandconditionscheckbox;
	
	@FindBy(id="button-payment-method")
	public static WebElement continuebuttonofpaymentsmethodsection;
	
	
	@FindBy(id="button-confirm")
	public static WebElement confirmorderbutton;
	
	public static void placeAnOrder() {
		Elements.click(continueButtonofBillingDetails);
		Elements.click(continueButtonofDeliverydetailsButton);
		Elements.click(CheckoutPage.continueButtonofDeliverymethodButton);
		Elements.click(CheckoutPage.termsandconditionscheckbox);
		Elements.click(CheckoutPage.continuebuttonofpaymentsmethodsection);
		Elements.click(CheckoutPage.confirmorderbutton);
		
	}
	

}
