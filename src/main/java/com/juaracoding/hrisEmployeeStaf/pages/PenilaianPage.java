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
	WebElement btnPA;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[9]/ul/li[2]/a")
	WebElement btnIsiPenilaian;
	
	@FindBy(css = "#table_length > label > select")
	WebElement btnShow; //25
	
	@FindBy(xpath = "//*[@value]")
	List<WebElement> showRange;
	
	@FindBy(css = "#content > h1")
	WebElement txtNilai; //Performance Appraisal || ISI PENILAIAN
	
	@FindBy(css = "#table > tbody > tr:nth-child(1) > td:nth-child(3) > a")
	WebElement btnAction1;
	
	@FindBy(css = "#content > h1 > a")
	WebElement btnPrev;
	
	@FindBy(css = "#table_filter > label > input")
	WebElement inputSearch;
	
	@FindBy(id="btnSearch")
	WebElement btnSearch;
	
	@FindBy(css = "#table_paginate > ul > li:nth-child(3) > a")
	WebElement btnHal2;
	
	@FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[10]/td[3]/a")
	WebElement btnSQA;
	
	@FindBy(css = "#table > tbody > tr:nth-child(6) > td:nth-child(1)")
	WebElement btnData6;
	
	@FindBy(css = "#table > tbody > tr.child > td > ul > li > span.dtr-data > a")
	WebElement btnAction2;
	
	@FindBy(xpath = "//*[@id=\"collapse3\"]/div/form/div/table/tbody/tr/td[2]/textarea")
	WebElement aspir;
	
	@FindBy(xpath = "//*[@id=\"collapse3\"]/div/form/div/button")
	WebElement btnSubmit;
	
	@FindBy(css = "#content > h1")
	WebElement txtBerhasil;
	
//------------------------ Isi Penilaian --------------------------//
	
	public void menuPenilaian() {
		btnPA.click();
		btnIsiPenilaian.click();
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
	
	public void beriNilai(String src) {
		btnShow.click();
		showRange.get(1).click();
		tunggu();
		btnAction1.click();
		tunggu();
		btnPrev.click();
		tunggu();
		inputSearch.sendKeys(src);
		btnSearch.click();
		tunggu();
		btnHal2.click();
		tunggu();
		btnSQA.click();
		tunggu();
		btnData6.click();
		tunggu();
		btnAction2.click();
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
//		formNilai.sendKeys(people);
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
//		fomNilai.get(0).sendKeys(kel);
//		tunggu();
//		ratingB1.click();
//		tunggu();
//		btnSubmit2.click();
		tunggu();
//		scroll(3);
		aspir.sendKeys(aspirasi);
		tunggu();
//		btnSubmit.click();
//		tunggu();
//		btnSimpan.click(); // ini juga di uncomment
	}
//	
	public String getTxtBerhasil() {
		return txtBerhasil.getText();
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
