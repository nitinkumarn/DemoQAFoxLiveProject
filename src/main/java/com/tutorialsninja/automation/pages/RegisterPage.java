package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	public RegisterPage() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id="input-firstname")
	public static WebElement firstname;
	
	@FindBy(id="input-lastname")
	public static WebElement lastname;
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-telephone")
	public static WebElement telephone;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(name="agree")
	public static WebElement privacyPolicy;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement continueButton;
	
	public static void enterAllDetails(DataTable datatable) {
		
Map<String,String> map =datatable.asMap(String.class, String.class);
		
	    Elements.TypeText(RegisterPage.firstname, map.get("Firstname"));
	    Elements.TypeText(RegisterPage.lastname, map.get("Lastname"));
	    Elements.TypeText(RegisterPage.email, System.currentTimeMillis()+map.get("Email"));
	    Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
	    Elements.TypeText(RegisterPage.password, map.get("Password"));
	    Elements.TypeText(RegisterPage.confirmPassword, map.get("Password"));
	}

}
