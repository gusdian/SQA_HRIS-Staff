package com.juaracoding.hrisEmployeeStaf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.hrisEmployeeStaf.drivers.DriverSingleton;

public class LoginPageSPV {

	private WebDriver driver;
	
	public LoginPageSPV() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	WebElement inputEmail;
	
	@FindBy(name = "password")
	WebElement inputPassword;	
	
	@FindBy(css = "#page-container > div > div.login-content > form > div.login-buttons")
	WebElement btnLogin;
	
	@FindBy(xpath = "//*[@id='content']/h1")
	WebElement txtWelcomeSPV;

	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/div[1]/small")
	WebElement txtInvalidLogin;
	
	public void submitInvalidLogin(String userNamee, String password_eror) {
		inputEmail.sendKeys(userNamee);
		tunggu();
		inputPassword.sendKeys(password_eror);
		tunggu();
		btnLogin.click();
		tunggu();
	}
	
	public void submitLogin(String userName, String passwordspv) {
		tunggu();
		inputEmail.sendKeys(userName);
		tunggu();
		inputPassword.sendKeys(passwordspv);
		tunggu();
		btnLogin.click();
	}
	
	public String getTxtWelcomeSPV() {
		return txtWelcomeSPV.getText();
	}
	
	public String getTxtInvalidLogin() {
		return txtInvalidLogin.getText();
	}
	
	public void tunggu() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
	
}
