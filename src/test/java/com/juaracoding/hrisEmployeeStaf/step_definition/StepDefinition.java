package com.juaracoding.hrisEmployeeStaf.step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.hrisEmployeeStaf.config.AutomationFrameworkConfig;
import com.juaracoding.hrisEmployeeStaf.drivers.DriverSingleton;
import com.juaracoding.hrisEmployeeStaf.pages.LoginPage;
import com.juaracoding.hrisEmployeeStaf.pages.PA360Page;
import com.juaracoding.hrisEmployeeStaf.pages.PenilaianPage;
import com.juaracoding.hrisEmployeeStaf.pages.TargetPage;
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
	private TargetPage targetPage;
	private PenilaianPage nilaiPage;
	private PA360Page pa360Page;
	
	ExtentTest extentTest;
	static ExtentReports reports = new ExtentReports("src/main/resources/TestReport.html");
	
	
	@Autowired
	ConfigurationProperties configProp;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configProp.getBrowser());
		loginPage = new LoginPage();
		targetPage = new TargetPage();
		nilaiPage = new PenilaianPage();
		pa360Page = new PA360Page();
		
		TestCases[] tests = TestCases.values();
		extentTest = reports.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
		
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
//	@AfterAll
//	public static void closeBrowser() {
//		driver.quit();
//	}
	
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

  //----------------------( Target Page )----------------------//
    @When("Staff Memilih Menu PA")
    public void staff_memilih_menu_pa() {
    	tunggu(1);
    	targetPage.menuPA();
    	extentTest.log(LogStatus.PASS, "Staff Memilih Menu PA");
    }
    
    @Then("Staff Memilih Template Target")
    public void staff_memilih_template_target() {
    	tunggu(1);
    	targetPage.IndexTarget(configProp.getList1(), configProp.getFilter1(), configProp.getEdit2(), configProp.getList2(), configProp.getFilter2());
    	extentTest.log(LogStatus.PASS, "Staff Memilih Template Target");
    }
    
    @Then("Staff Set Target")
    public void staff_set_target() {
    	tunggu(1);
    	targetPage.addTarget(configProp.getName(), configProp.getStarttgl(), configProp.getEndtgl(), configProp.getListcount(), configProp.getWeight(), configProp.getParam1(), configProp.getTar1(), configProp.getParam2(), configProp.getTar2(), configProp.getList3(), configProp.getFilter3(), configProp.getList4(), configProp.getFilter4());
    	assertEquals("data1", targetPage.getTxtData());
    	extentTest.log(LogStatus.PASS, "Staff Set Target");
    }
    
//    @Then("Staff Berhasil Mengisi Target")
//    public void staff_berhasil_mengisi_target() {
//    	tunggu(1);
//    	assertEquals(configProp.getTxtAssignTarget(), targetPage.getTxtassignTarget());
//    	extentTest.log(LogStatus.PASS, "Staff Berhasil Mengisi Target");
//    }
    //----------------------( Penilaian Page )----------------------//
    
    
    @When("User klik button action")
    public void user_klik_button_action() {
    	tunggu(1);
    	driver.navigate().back();
    	nilaiPage.menuPenilaian();
    	tunggu(1);
    	assertEquals(configProp.getTxtNilai(), nilaiPage.getTxtNilai());
    	extentTest.log(LogStatus.PASS, "User masuk halaman penilaian");
    	tunggu(2);
    	nilaiPage.beriNilai(configProp.getFilter1());
    	tunggu(2);
    }
    
    @Then("User mengisi penilaian")
    public void user_mengisi_penilaian() {
    	nilaiPage.isiFormNilai2(configProp.getActResult1(), configProp.getActResult2(), configProp.getActResult3(), configProp.getActResult4(), configProp.getAspir(), configProp.getPilih());
    	extentTest.log(LogStatus.PASS, "User dapat mengisi penilaian");
    }
    
    @Then("User berhasil memberi nilai")
    public void user_berhasil_memberi_nilai() {
    	tunggu(1);
    	assertEquals(configProp.getTxtBerhasil(), nilaiPage.getTxtBerhasil());
    	extentTest.log(LogStatus.PASS, "Berhasil memberi nilai");
    }
    
    //----------------------( PA360 Page )----------------------//
    
    @When("User klik menu PA360")
    public void user_klik_menu_PA360() {
    	tunggu(2);
    	pa360Page.goToMenuPA360();
    	extentTest.log(LogStatus.PASS, "User klik menu PA360");
    }
    
    @Then("Menampilkan data PA360")
    public void menampilkan_data_PA360() {
    	assertEquals(configProp.getTxtPA360(), pa360Page.getTxtPA360());
    	extentTest.log(LogStatus.PASS, "Menampilkan data PA360");
    }
    
    @When("User klik Show Entries")
    public void user_klik_showEntries_PA360() {
    	tunggu(2);
    	pa360Page.showRangeEntries();
    	extentTest.log(LogStatus.PASS, "User klik Show Entries");
    }
    
	@Then("Menampilkan data PA360 sesuai banyaknya data yang dipilih")
	public void tampil_showEntries_PA360() {
    	extentTest.log(LogStatus.PASS, "Menampilkan data PA360 sesuai banyaknya data yang dipilih");
    }
    
	@When("User klik sorting pada Tabel Detail")
	public void user_klik_sorting_PA360() {
    	pa360Page.TableSorting();
    	extentTest.log(LogStatus.PASS, "User klik sorting pada Tabel Detail");
    }
	
	@Then("Menampilkan data PA360 secara ascending")
	public void tampil_ascending_PA360() {
    	tunggu(2);
    	extentTest.log(LogStatus.PASS, "Menampilkan data PA360 secara ascending");
    }
	
	@When("User search data")
	public void user_search_PA360() {
    	tunggu(2);
    	pa360Page.submitSearch(configProp.getSearch());
    	extentTest.log(LogStatus.PASS, "User search data");
    }
	
	@Then("Menampilkan data yang dicari")
	public void tampil_search_PA360() {
    	tunggu(2);
    	extentTest.log(LogStatus.FAIL, "Menampilkan data yang dicari");
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
