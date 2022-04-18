package com.juaracoding.hrisEmployeeStaf.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.hrisEmployeeStaf.drivers.DriverSingleton;

public class PenilaianPage {
	
private WebDriver driver;
	
	public PenilaianPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[9]/a")
//	List<WebElement> menuPA;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[9]/ul/li[2]/a")
	WebElement btnNilai;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement txtNilai;
	
	@FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[1]/td[3]/a")
	WebElement btnEdit1;
	
	@FindBy(xpath = "//*[@id=\"table\"]/tbody/tr/td")
			WebElement txtKosong;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1/a")
	WebElement btnPrev;
	
	public void menuPenilaian() {
		btnNilai.click();
	}
	
	public String getTxtNilai() {
		return txtNilai.getText();
	}
	
	public void penilaianKosong() {
		btnEdit1.click();
	}
	
	public String getTxtKosong() {
		return txtKosong.getText();
	}
	
	public void Back() {
		btnPrev.click();
	}
	

}
