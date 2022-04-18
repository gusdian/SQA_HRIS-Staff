package com.juaracoding.hrisEmployeeStaf.step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.hrisEmployeeStaf.config.AutomationFrameworkConfig;
import com.juaracoding.hrisEmployeeStaf.drivers.DriverSingleton;
import com.juaracoding.hrisEmployeeStaf.pages.LoginPage;
import com.juaracoding.hrisEmployeeStaf.pages.PenilaianPage;
import com.juaracoding.hrisEmployeeStaf.utils.ConfigurationProperties;
import com.juaracoding.hrisEmployeeStaf.utils.Constants;
import com.juaracoding.hrisEmployeeStaf.utils.TestCases;
import com.juaracoding.hrisEmployeeStaf.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private static WebDriver driver;
	private LoginPage loginPage;
	private PenilaianPage nilaiPage;
	
	ExtentTest extentTest;
	static ExtentReports reports = new ExtentReports("src/main/resources/TestReport.html");
	
	
	@Autowired
	ConfigurationProperties configProp;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configProp.getBrowser());
		loginPage = new LoginPage();
		nilaiPage = new PenilaianPage();
		
		TestCases[] tests = TestCases.values();
		extentTest = reports.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
		
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	@AfterAll
	public static void closeBrowser() {
		driver.quit();
	}
	
	//----------------------( Login Page )----------------------//
	@Given("User mengakses url")
	public void user_akses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to "+Constants.URL);
	}
	
    @When("User valid klik login button")
    public void user_valid_klik_login() {
    	loginPage.submitLoginValid(configProp.getEmail(), configProp.getPassword());
    	extentTest.log(LogStatus.PASS, "User valid klik login button");
    }
    
    @Then("User berhasil login")
    public void user_berhasil_login() {
    	tunggu(1);
    	assertEquals(configProp.getTxtWelcome(), loginPage.getTxtWelcome());
    	extentTest.log(LogStatus.PASS, "User berhasil login");
    }
	
    @When("User invalid klik login button")
    public void user_invalid_klik_login() {
    	tunggu(1);
    	loginPage.Logout();
    	tunggu(1);
    	loginPage.submitLoginInvalid(configProp.getEmail_wrong(), configProp.getPassword_wrong());
    	extentTest.log(LogStatus.PASS, "User invalid klik login button");
    }
    
    @Then("User gagal login")
    public void user_gagal_login() {
    	tunggu(1);
    	assertEquals(configProp.getTxtWrongEmailPass(), loginPage.getTxtWrongEmailPass());
    	extentTest.log(LogStatus.PASS, "User gagal login");
    	tunggu(2);
    	loginPage.submitLoginValid(configProp.getEmail(), configProp.getPassword());
    }
    
    //----------------------( Penilaian Page )----------------------//
    
    @When("User klik tombol Action")
    public void user_klik_tombol_action() {
    	tunggu(1);
    	nilaiPage.menuPenilaian();;
    	tunggu(1);
    	assertEquals(configProp.getTxtNilai(), nilaiPage.getTxtNilai());
    	extentTest.log(LogStatus.PASS, "User masuk halaman penilaian");
    	tunggu(2);
    }
    
    @Then("User kembali ke halaman sebelumnya")
    public void user_kembali_ke_halaman_sebelumnya() {
    	nilaiPage.penilaianKosong();
    	tunggu(1);
    	assertEquals(configProp.getTxtKosong(), nilaiPage.getTxtKosong());
    	extentTest.log(LogStatus.PASS, "Tabel penilaian kosong");
    	tunggu(1);
    	nilaiPage.Back();
    }
    
    @When("User klik button action")
    public void user_klik_button_action() {
    	nilaiPage.beriNilai();
    	tunggu(2);
    }
    
    @Then("User mengisi penilaian")
    public void user_mengisi_penilaian() {
    	nilaiPage.isiFormNilai(configProp.getActResult1(), configProp.getActResult2(), configProp.getActResult3(), configProp.getActResult4(), configProp.getAspir());
    	extentTest.log(LogStatus.PASS, "User dapat mengisi penilaian");
    }
    
    @Then("User berhasil memberi nilai")
    public void user_berhasil_memberi_nilai() {
    	tunggu(1);
    	assertEquals(configProp.getTxtBerhasil(), nilaiPage.getTxtBerhasil());
    	extentTest.log(LogStatus.PASS, "Berhasil memberi nilai");
    }
    
    public void tunggu(int detik) {
		try {
			Thread.sleep(detik*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
