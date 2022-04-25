package com.juaracoding.hrisEmployeeStaf.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.hrisEmployeeStaf.drivers.DriverSingleton;

public class TargetPage {
private WebDriver driver;
	
	public TargetPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[9]/a")
	WebElement ListMenu;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[9]/ul/li[1]/a")
	WebElement ListSubMenu;
	
	@FindBy(css = "#table_length > label > select")
	WebElement Entries1;
	
	@FindBy(xpath = "//*[@id='table_length']/label/select/option")
	List<WebElement> ListEntries1;
	
	@FindBy(css = "#table_filter > label > input")
	WebElement Filter1;
	
	@FindBy(css = "#table > tbody > tr > td:nth-child(3) > a")
	WebElement EditData1;
	
	@FindBy(xpath = "//*[@class='btn btn-danger']")
	WebElement Mundur1;
	
	@FindBy(xpath = "//*[@title='Edit Data']")
	List<WebElement>EditData2;
	
	@FindBy(css = "#table_length > label > select")
	WebElement Entries2;
	
	@FindBy(xpath = "//*[@id='table_length']/label/select/option")
	List<WebElement> ListEntries2;
	
	@FindBy(css = "#table_filter > label > input")
	WebElement Filter2;
	
	@FindBy(xpath = "//*[@class='btn btn-primary']")
	WebElement AddTgt;
	
	@FindBy(id = "Temp_Name")
	WebElement TargetName;
	
	@FindBy(id = "Period_Start_Date")
	WebElement StartDate;
	
	@FindBy(id = "Period_End_Date")
	WebElement EndDate;
	
	@FindBy(id = "Review_Count")
	WebElement ReviewCount;
	
	@FindBy(xpath = "//*[@id='Review_Count']/option")
	List<WebElement>ListReviewCount;
	
	@FindBy(id = "btnSubmit")
	WebElement Submit_1;
	
	@FindBy(id = "Weight")
	WebElement Weight;
	
	@FindBy(css = "#tab-category > div > div > div > form > div.row > div > button")
	WebElement Submit_2;
	
	@FindBy(xpath = "/html/body")
	WebElement data0;
	
	@FindBy(xpath = "//*[@class='btn btn-danger']")
	WebElement Mundur2;
	
	@FindBy(xpath = "//*[@class='btn btn-primary']")
	WebElement Submit_3;
	
	@FindBy(id = "Objective_Name")
	WebElement Parameter1;
	
	@FindBy(id = "Objective_Description")
	WebElement Target1;
	
	@FindBy(xpath = "//*[@class='btn btn-primary']")
	WebElement Submit_4;
	
	@FindBy(css = "#table > tbody > tr > td:nth-child(4) > a")
	WebElement Delete;
	
	@FindBy(css = "#content > div:nth-child(8) > div > ul > li:nth-child(2)")
	WebElement NextTarget;
	
	@FindBy(id = "Objective_Name")
	WebElement Parameter2;
	
	@FindBy(id = "Objective_Description")
	WebElement Target2;
	
	@FindBy(xpath = "//*[@class='btn btn-primary']")
	WebElement Submit_5;
	
	@FindBy(css = "#table_length > label > select")
	WebElement Entries3;
	
	@FindBy(xpath = "//*[@id='table_length']/label/select/option")
	List<WebElement> ListEntries3;
	
	@FindBy(css = "#table_filter > label > input")
	WebElement Filter3;
	
	@FindBy(css = "#tab-category > div > div:nth-child(5) > div > a")
	WebElement Submit_6;
	
	@FindBy(css = "#table1_length > label > select")
	WebElement Entries4;
	
	@FindBy(xpath = "//*[@id='table1_length']/label/select/option")
	List<WebElement> ListEntries4;
	
	@FindBy(css = "#table1_filter > label > input")
	WebElement Filter4;
	
	@FindBy(css = "#btnRefresh > i")
	WebElement Refressh;
	
	@FindBy(xpath = "//*[@class='btn btn-danger']")
	WebElement Mundur3;
	
	@FindBy(css = "#tab-category > div > div:nth-child(5) > div > a")
	WebElement Submit_7;
	
	@FindBy(xpath = "//*[@class='btn btn-block btn-primary']")	
	WebElement Submit_8;
	
	@FindBy(css = "#tab-category2 > div > div > div > table > tbody > tr:nth-child(2) > td:nth-child(2)")
	WebElement txtAssignTarget;
	
	public void menuPA() {
		tunggu();
		ListMenu.click();
		ListSubMenu.click();
	}
	
	public void IndexTarget(int list1, String filter1, int edit2, int list2, String filter2) {
		tunggu();
		Entries1.click();
		tunggu();
		EditData1.click();
		tunggu();
		Mundur1.click();
		tunggu();
		ListEntries1.get(list1).click();
		Filter1.sendKeys(Keys.chord(Keys.CONTROL+"a"));
		Filter1.sendKeys(filter1);
		Filter1.sendKeys(Keys.ENTER);
		tunggu();
		EditData2.get(edit2).click();
		tunggu();
		Entries2.click();
		ListEntries2.get(list2).click();
		Filter2.sendKeys(Keys.chord(Keys.CONTROL+"a"));
		Filter2.sendKeys(filter2);
		Filter2.sendKeys(Keys.ENTER);
		tunggu();
	}
	
	public void addTarget(String name, String starttgl, String endtgl, int listcount, String weight, String param1, String tar1, String param2, String tar2, int list3, String filter3, int list4, String filter4) {
		tunggu();
		AddTgt.click();
		TargetName.sendKeys(name);
		StartDate.sendKeys(Keys.chord(Keys.CONTROL+"a", starttgl));
		StartDate.sendKeys(starttgl);
		StartDate.sendKeys(Keys.ENTER);
		EndDate.sendKeys(Keys.chord(Keys.CONTROL+"a", endtgl));
		EndDate.sendKeys(endtgl);
		EndDate.sendKeys(Keys.ENTER);
		ReviewCount.click();
		ListReviewCount.get(listcount).click();
		Submit_1.click();
		tunggu();
		Weight.sendKeys(weight);
		Submit_2.click();
		tunggu();
		Mundur2.click();
		Submit_3.click();
		Parameter1.sendKeys(param1);
		Target1.sendKeys(tar1);
		tunggu();
		Submit_4.click();
		scroll();
		tunggu();
		Delete.click();
		NextTarget.click();
		Parameter2.sendKeys(param2);
		Target2.sendKeys(tar2);
		Submit_5.click();
		scroll();
		tunggu();
		Entries3.click();
		ListEntries3.get(list3).click();
		Filter3.sendKeys(Keys.chord(Keys.CONTROL+"a"));
		Filter3.sendKeys(filter3);
		Filter3.sendKeys(Keys.ENTER);
		tunggu();
		Submit_6.click();
		tunggu();
		Entries4.click();
		ListEntries4.get(list4).click();
		Filter4.sendKeys(Keys.chord(Keys.CONTROL+"a"));
		Filter4.sendKeys(filter4);
		Refressh.click();
		Mundur3.click();
		Submit_7.click();
		tunggu();
		Submit_8.click();
	}
	
	public String getTxtData() {
		return data0.getText();
	}
	
	public String getTxtassignTarget() {
		return txtAssignTarget.getText();
	}
	
	public void tunggu() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void scroll() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
	}
}
