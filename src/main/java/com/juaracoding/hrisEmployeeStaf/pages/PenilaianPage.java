package com.juaracoding.hrisEmployeeStaf.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[9]/a")
	WebElement menuPA;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[9]/ul/li[2]/a")
	WebElement btnIsiNilai;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement txtNilai;
	
	@FindBy(xpath = "//*[@id=\"table_filter\"]/label/input")
	WebElement inputSearch; //SQA
	
	@FindBy(id="btnSearch")
	WebElement btnSearch;
	
	@FindBy(css = "#table > tbody > tr > td:nth-child(3) > a")
	WebElement btnSQA;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1/a")
	WebElement btnPrev;
	
	@FindBy(css = "#table > tbody > tr:nth-child(1) > td:nth-child(3) > a")
	WebElement btnEdit2;
	
	@FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[3]/td/ul/li/span[2]/a")
	WebElement btnNilai2;

	@FindBy(xpath = "//*[@id=\"collapse1\"]/div/form/div/table/tbody[1]/tr/td[3]/textarea")
	WebElement formNilai2;
	
	@FindBy(xpath = "//*[@id=\"table\"]/tbody/tr/td[3]/a")
	WebElement btnNilai1;
	
	@FindBy(xpath = "//*[@id=\"collapse1\"]/div/form/div/table/tbody[1]/tr/td[3]/textarea")
	WebElement actResult1;
	
	@FindBy(id="Score_Process1")
	WebElement scoreP;
	
	@FindBy(id="rating_Process")
	WebElement ratingP;
	
	@FindBy(id = "Actual_Result")
	List<WebElement> actResult2;
	
	@FindBy(id="Score_Financial1")
	WebElement scoreF;
	
	@FindBy(id="rating_Financial")
	WebElement ratingF;
	
	@FindBy(xpath = "//*[@id=\"collapse1\"]/div/form/div/button")
	WebElement btnSubmit;
	
	@FindBy(id = "Actual_Result_Rating")
	List<WebElement> actResult3;
	
	@FindBy(id = "f_star_3_142")
	WebElement ratingB1;
	
	@FindBy(id="f_star_3_143")
	WebElement ratingB2;
		
	@FindBy(id="f_star_3_144")
	WebElement ratingB3;
	
	@FindBy(xpath = "//*[@id=\"collapse2\"]/div/form/div/button")
	WebElement btnSubmit2;
	
	@FindBy(xpath = "//*[@id=\"collapse3\"]/div/form/div/table/tbody/tr/td[2]/textarea")
	WebElement aspir;
	
	@FindBy(xpath = "//*[@id=\"collapse3\"]/div/form/div/button")
	WebElement btnSubmit3;
	
	@FindBy(id="FinalObjRat")
	WebElement txtBerhasil;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/form/button")
	WebElement btnSimpan;
	
	public void menuPenilaian() {
		menuPA.click();
		btnIsiNilai.click();
	}
	
	public String getTxtNilai() {
		return txtNilai.getText();
	}
//	
//	public void penilaianKosong() {
//		btnEdit1.click();
//	}
//	
//	public String getTxtKosong() {
//		return txtKosong.getText();
//	}
//	
//	public void Back() {
//		btnPrev.click();
//	}
	
	public void beriNilai(String filter1) {
		inputSearch.sendKeys(filter1);
		btnSearch.click();
		tunggu();
		btnSQA.click();
		tunggu();
		btnPrev.click();
		tunggu();
		btnSQA.click();
		scroll(1);
		btnEdit2.click();
		tunggu();
		
//		btnNilai2.click();
//		tunggu();
//		scroll(1);
//		btnNilai3.click();
//		tunggu();
//		scroll(1);
//		btnEdit3.click();
//		tunggu();
	}
	
//	public void isiFormNilai(String people, String finance, String kel, String sig, String aspirasi, String pilih) {
//		scroll(1);
//		tunggu();
//		actResult1.sendKeys(people);
//		tunggu();
//		scoreP.sendKeys(pilih);
//		scoreP.sendKeys(Keys.ENTER);
//		tunggu();
//		actResult2.sendKeys(finance);
//		tunggu();
//		scoreF.sendKeys(pilih);
//		scoreF.sendKeys(Keys.ENTER);
//		tunggu();
//		btnSubmit.click();
//		tunggu();
//		tunggu();
//		scroll(1);
//		scroll(2);
//		actResult3.get(0).sendKeys(kel);
//		tunggu();
//		ratingB1.click();
//		tunggu();
//		actResult3.get(1).sendKeys(sig);
//		tunggu();
//		ratingB2.click();
//		tunggu();
//		actResult3.get(2).sendKeys(sig);
//		tunggu();
//		ratingB3.click();
//		tunggu();
//		btnSubmit2.click();
//		tunggu();
//		scroll(3);
//		aspir.sendKeys(aspirasi);
//		tunggu();
//		btnSubmit3.click();
//	}
	
	public void isiFormNilai2(String people, String finance, String kel, String sig, String aspirasi, String pilih) {
//		scroll(2);
//		formNilai2.sendKeys(people);
//		actResult1.sendKeys(people);
//		tunggu();
//		scoreP.sendKeys(pilih);
//		scoreP.sendKeys(Keys.ENTER);
//		tunggu();
//		btnSubmit.click(); //kalo mau run direkam ini di uncomment
//		tunggu();
//		tunggu();
//		scroll(1);
//		scroll(2);
//		actResult3.get(0).sendKeys(kel);
//		tunggu();
//		ratingB1.click();
//		tunggu();
//		btnSubmit2.click();
//		tunggu();
//		scroll(3);
//		aspir.sendKeys(aspirasi);
//		tunggu();
//		btnSubmit3.click();
//		tunggu();
//		btnSimpan.click(); // ini juga di uncomment
	}
	
	public String getTxtBerhasil() {
		return txtBerhasil.getText();
	}
	
	public String getxtNilai() {
		return txtNilai.getText();
	}
	
	public void tunggu() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void scroll(int kali) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
	}

}
