package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection {
	
	
	public HeadersSection() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//span[.='My Account']")
	public static WebElement myAccountLink;
	
	
	@FindBy(linkText="Register")
	public static WebElement Register;
	
	@FindBy(linkText="Login")
	public static WebElement Login;
	
	@FindBy(name="search")
	public static WebElement SearchBoxField;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement SearchButton;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement viewShoppingCart;
	
	public static void navigateToLoginPage() {
		
		Elements.click(myAccountLink);
		Elements.click(Login);
		
	}
	
	public static void searchProduct() {
		Elements.TypeText(SearchBoxField, Base.reader.getProduct());
		Elements.click(SearchButton);
		
	}
	
	public static void navigateToShoppingCartPage() {
		Elements.click(viewShoppingCart);
	}

}
