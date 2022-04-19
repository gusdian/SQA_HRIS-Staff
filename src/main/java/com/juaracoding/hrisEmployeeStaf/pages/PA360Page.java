package com.juaracoding.hrisEmployeeStaf.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.hrisEmployeeStaf.drivers.DriverSingleton;

public class PA360Page {

private WebDriver driver;
	
	public PA360Page() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(9)")
	WebElement menuPA;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[9]/ul/li")
	List<WebElement> submenuPA;
	
	@FindBy(css = "#content > div > div > div > div.panel-heading.ui-sortable-handle > h4")
	WebElement txtPA360;
	
	@FindBy(css = "#table_length > label > select")
	WebElement btnRange;
	
	@FindBy(xpath = "//*[@value]")
	List<WebElement> showRange;
	
	@FindBy(css = "#table > thead > tr > th:nth-child(2)")
	WebElement sortAscending;
	
	@FindBy(css = "#table_filter > label > input")
	WebElement inputSearch;
	
	@FindBy(css = "#btnSearch")
	WebElement btnSearch;
	
	public void goToMenuPA360() {
		menuPA.click();
		submenuPA.get(2).click();
	}

	public String getTxtPA360() {
		return txtPA360.getText();
	}
	
	public void showRangeEntries() {
		btnRange.click();
		showRange.get(2).click();
	}
	
	public void TableSorting() {
		sortAscending.click();
	}
	
	public void submitSearch(String search) {
		inputSearch.sendKeys(search);
		btnSearch.click();
	}
	
	
}
