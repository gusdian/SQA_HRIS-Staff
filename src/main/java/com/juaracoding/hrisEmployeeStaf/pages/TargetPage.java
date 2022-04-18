package com.juaracoding.hrisEmployeeStaf.pages;

import java.util.ArrayList;
import java.util.List;

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
	
	@FindBy(xpath = "//*[@class='nav'][2]/li/a")
	List<WebElement>ListMenu;
	
	@FindBy(xpath = "//*[@class='nav'][2]/li/ul/li")
	List<WebElement>ListSubMenu;
	
	@FindBy(css = "#table_length > label > select")
	WebElement Entries1;
	
	@FindBy(xpath = "//*[@id='table_length']/label/select/option")
	List<WebElement> ListEntries1;
	
	@FindBy(css = "#table_filter > label > input")
	WebElement Filter1;
	
	@FindBy(xpath = "//*[@title='Edit Data']")
	List<WebElement>EditData1;
	
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
	
	@FindBy(xpath = "//*[@class='btn btn-primary']")
	WebElement Submit_2;
	
	@FindBy(xpath = "//*[@class='btn btn-danger']")
	WebElement Mundur2;
	
	@FindBy(xpath = "//*[@class='btn btn-primary']")
	WebElement Submit_3;
	
	@FindBy(id = "Objective_name")
	WebElement Parameter1;
	
	@FindBy(id = "Objective_Description")
	WebElement Target1;
	
	@FindBy(xpath = "//*[@class='btn btn-primary']")
	WebElement Submit_4;
	
	@FindBy(xpath = "btn btn-danger btn-icon btn-circle")
	WebElement Delete;
	
	@FindBy(css = "#content > div:nth-child(7) > div > ul > li:nth-child(2) > a > span.d-sm-block.d-none")
	WebElement NextTarget;
	
	@FindBy(id = "Objective_name")
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
	
	@FindBy(xpath = "//*[@class='btn btn-success]")
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
	
	@FindBy(xpath = "//*[@class='btn btn-success]")
	WebElement Submit_7;
	
	@FindBy(xpath = "//*[@class='btn btn-block btn-primary']")	
	WebElement Submit_8;
	
	@FindBy(css = "#tab-category2 > div > div > div > table > tbody > tr:nth-child(2) > td:nth-child(2)")
	WebElement txtAssignTarget;
	
//	D6190874 | ADITYA RIDWAN NUGRAHA
	
	public void menuPA(int list, int listSub) {
		tunggu();
		ListMenu.get(list).click();
		ListSubMenu.get(listSub).click();
	}
	
	public void IndexTarget(int list1, String filter1, int edit1, int edit2, int list2, String filter2) {
		tunggu();
		Entries1.click();
		ListEntries1.get(list1).click();
		Filter1.sendKeys(Keys.chord(Keys.CONTROL+"a"));
		Filter1.sendKeys(filter1);
		EditData1.get(edit1).click();
		Mundur1.click();
		EditData2.get(edit2).click();
		Entries2.click();
		ListEntries2.get(list2).click();
		Filter2.sendKeys(Keys.chord(Keys.CONTROL+"a"));
		Filter2.sendKeys(filter2);
	}
	
	public void addTarget(String name, String starttgl) {
		AddTgt.click();
		TargetName.sendKeys(name);
		StartDate.sendKeys(Keys.chord(Keys.CONTROL+"a", starttgl));
		StartDate.sendKeys(starttgl);
		StartDate.sendKeys(Keys.ENTER);
		EndDate.click();
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
