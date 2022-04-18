package com.juaracoding.hrisEmployeeStaf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.hrisEmployeeStaf.drivers.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	WebElement inputEmail;
	
	@FindBy(name = "password")
	WebElement inputPassword;
	
	@FindBy(css = "#page-container > div > div.login-content > form > div.login-buttons > button")
	WebElement btnLogin;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(1) > li > a > div.info")
	WebElement txtWelcome;
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/div[1]/small")
	WebElement txtWrongEmailPass;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(14) > a")
	WebElement btnLogout;
	
	public void submitLoginValid(String email, String password) {
		inputEmail.sendKeys(email);
		inputPassword.sendKeys(password);
		btnLogin.click();
	}
	
	public String getTxtWelcome() {
		return txtWelcome.getText();
	}
	
	public String getTxtWrongEmailPass() {
		return txtWrongEmailPass.getText();
	}
	
	public void Logout() {
		btnLogout.click();
	}
	
	public void submitLoginInvalid(String email_wrong, String password_wrong) {
		inputEmail.sendKeys(email_wrong);
		inputPassword.sendKeys(password_wrong);
		btnLogin.click();
	}
	
}
