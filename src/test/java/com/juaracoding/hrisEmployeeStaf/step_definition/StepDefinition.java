package com.juaracoding.hrisEmployeeStaf.step_definition;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.hrisEmployeeStaf.pages.ApprovalPage;
import com.juaracoding.hrisEmployeeStaf.pages.CekPenilaianPage;
import com.juaracoding.hrisEmployeeStaf.pages.IsiPenilaianPage;
import com.juaracoding.hrisEmployeeStaf.pages.SetTargetPage;
import com.juaracoding.hrisEmployeeStaf.config.AutomationFrameworkConfig;
import com.juaracoding.hrisEmployeeStaf.drivers.DriverSingleton;
import com.juaracoding.hrisEmployeeStaf.pages.LoginPage;
import com.juaracoding.hrisEmployeeStaf.pages.LoginPageSPV;
import com.juaracoding.hrisEmployeeStaf.pages.PA360Page;
import com.juaracoding.hrisEmployeeStaf.pages.PA360PageSPV;
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
import io.cucumber.java.en.And;
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
	private LoginPageSPV loginPageSPV;
	private SetTargetPage SettargetPage;
	private ApprovalPage approvalPage;
	private IsiPenilaianPage isiPenilaianPage;
	private PA360PageSPV pa360PageSPV;
	private CekPenilaianPage cekPenilaianPage;

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
		loginPageSPV = new LoginPageSPV();
		SettargetPage = new SetTargetPage();
		approvalPage = new ApprovalPage();
		isiPenilaianPage = new IsiPenilaianPage();
		pa360PageSPV = new PA360PageSPV();
		cekPenilaianPage = new CekPenilaianPage();
		
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
//		driver.quit();
	}
	
	//----------------------( Web Downline )----------------------//
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
    	targetPage.IndexTarget(configProp.getList1(), configProp.getFilter1(), configProp.getList2(), configProp.getEdit2(), configProp.getFilter2());
    	extentTest.log(LogStatus.PASS, "Staff Memilih Template Target");
    }
    
    @Then("Staff Set Target")
    public void staff_set_target() {
    	tunggu(1);
    	targetPage.addTarget(configProp.getName(), configProp.getStarttgl(), configProp.getEndtgl(), configProp.getListcount(), configProp.getWeight(), configProp.getParam1(), configProp.getTar1(), configProp.getParam2(), configProp.getTar2(), configProp.getList3(), configProp.getFilter3(), configProp.getList4(), configProp.getFilter4());
    	extentTest.log(LogStatus.FAIL, "Staff Set Target");
    	assertEquals(configProp.getTxtData(), targetPage.getTxtData());
    	//extentTest.log(LogStatus.PASS, "Staff Set Target");
    }
    
    @Then("Staff Berhasil Mengisi Target")
    public void staff_berhasil_mengisi_target() {
    	tunggu(1);
    	assertEquals(configProp.getTxtAssignTarget(), targetPage.getTxtassignTarget());
    	extentTest.log(LogStatus.FAIL, "Staff Berhasil Mengisi Target");
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
    
	//----------------------( Web Upline )----------------------//
	//----------------------( Login Page )----------------------//
		@When("SPV invalid login")
		public void spv_invalid_login() {
	    	loginPage.Logout();
			loginPageSPV.submitInvalidLogin(configProp.getEmailku(), configProp.getPassword_eror());
			extentTest.log(LogStatus.PASS, "SPV invalid login");
		}
		
		@Then("SPV gagal login")
		public void spv_gagal_login() {
			assertEquals(configProp.getTxtInvalidLogin(), loginPageSPV.getTxtInvalidLogin());
			extentTest.log(LogStatus.PASS, "SPV gagal login");
		}
		
		@When("SPV valid login")
		public void spv_valid_login() {
			loginPageSPV.submitLogin(configProp.getEmailspv(), configProp.getPasswordspv());
			extentTest.log(LogStatus.PASS, "SPV valid login");
		}
		
		@Then("SPV berhasil login")
		public void spv_berhasil_login() {
			assertEquals(configProp.getTxtWelcomeSPV(), loginPageSPV.getTxtWelcomeSPV());
			extentTest.log(LogStatus.PASS, "SPV berhasil login");
		}    
		
		//----------------------( Set Target Page )----------------------//
		
			@When("SPV mengakses halaman set target")
		    public void spv_mengakses_halaman_set_target() {
		    	tunggu(1);
		    	SettargetPage.menuPA();
		    	extentTest.log(LogStatus.PASS, "SPV mengakses halaman set target");
		    }
			
			@Then("SPV set target")
			public void spv_set_target() {
				tunggu(1);
				SettargetPage.setTarget(configProp.getSrc(), configProp.getTarget(), configProp.getStart(), configProp.getEnd(), configProp.getPersen(), configProp.getPersen2());
				extentTest.log(LogStatus.FAIL, "SPV melakukan set target");
				assertEquals(configProp.getTxtDataa(), SettargetPage.getTxtDataa());
			}
			
			@Then("SPV set objective")
			public void spv_set_objective() {
				tunggu(1);
				SettargetPage.setObj(configProp.getTarget(), configProp.getPersen(), configProp.getPersen2(), configProp.getDiri(), configProp.getTeam(), configProp.getS(), configProp.getNama());
				extentTest.log(LogStatus.FAIL, "SPV melakukan set objective");
			}
			
			@Then("SPV berhasil set target")
		    public void spv_berhasil_set_target() {
		    	tunggu(1);
		    	assertEquals(configProp.getTxtTarget(), SettargetPage.getTxtTarget());
		    	extentTest.log(LogStatus.FAIL, "Staff Berhasil Mengisi Target");
		    }
		
		//----------------------( Approval Target Page )----------------------//
		@When("Spv Klik Menu Approval Target")
			public void spv_klik_menu_approval_target() {
			tunggu(1);
	    	driver.navigate().back();
			approvalPage.MenuPA();
			tunggu(2);
			approvalPage.indexApproval(configProp.getFilterspv1());
			extentTest.log(LogStatus.PASS, "Spv Klik Menu Approval Target");
		}
		
		@Then("Spv Melihat Dan Mengubah Data Jika Diperlukan")
		public void spv_melihat_dan_mengubah_data_jika_diperlukan() {
			approvalPage.EditDataApproval(configProp.getNamee(), configProp.getStartDate(), configProp.getEndDate(), configProp.getWeight1(), configProp.getWeight2(), configProp.getParam1(), configProp.getTarspv1(), configProp.getFilterspv2());
			extentTest.log(LogStatus.PASS, "Spv Melihat Dan Mengubah Data Jika Diperlukan");
			assertEquals(configProp.getTxtSuccessApprove(), approvalPage.getTxtApprovalTarget());
		}
		
//		@Then("Spv Berhasil Approval Target")
//		public void spv_berhasil_approval_target() {
//			assertEquals(configProp.getTxtInvalidLogin(), approvalPage.getTxtApprovalTarget());
//			extentTest.log(LogStatus.FAIL, "Spv Berhasil Approval Target");
//		}
		
		@Then("Spv Berhasil Approval Target")
		public void spv_berhasil_approval_target() {
			assertEquals(configProp.getTxtInvalidLogin(), approvalPage.getTxtApprovalTarget());
			extentTest.log(LogStatus.PASS, "Spv Berhasil Approval Target");
		}
		
		//----------------------( Isi Penilaian Page )----------------------//
		
		@When("SPV Klik Menu Isi Penilaian")
		public void spv_klik_menu_isi_penilaian() {
			tunggu(1);
	    	driver.navigate().back();
			isiPenilaianPage.MenuPA();
			tunggu(2);
			extentTest.log(LogStatus.PASS, "SPV Klik Menu Isi Penilaian");
		}
		
		@Then("SPV Melihat Data")
		public void spv_melihat_data() {
			isiPenilaianPage.indexIsiPenilaian(configProp.getFilterspv3());
			assertEquals(configProp.getTxtPenilaianPage(), isiPenilaianPage.getTxtPenilaianPage());
			extentTest.log(LogStatus.PASS, "SPV Melihat Data");
		}
		
		//----------------------( Cek Penilaian Page )----------------------//
		
		@When("SPV klik menu Cek Penilaian")
		public void klik_cek_penilaian() {
			tunggu(2);
			cekPenilaianPage.goToMenuCekPenilaian();
			extentTest.log(LogStatus.PASS, "SPV klik menu Cek Penilaian");
		}
		
	    @Then("Menampilkan Data Cek Penilaian")
		public void tampil_cek_penilaian() {
	    	tunggu(2);
	    	assertEquals(configProp.getTxtCekPenilaian(), cekPenilaianPage.getTxtCekPenilaian());
	    	extentTest.log(LogStatus.PASS, "Menampilkan Data Cek Penilaian");
	    }
	    
	    @When("SPV klik button Action")
	    public void klik_action() {
	    	cekPenilaianPage.goToBtnAction();
	    	extentTest.log(LogStatus.PASS, "SPV klik button Action");
	    }
	    
	    @And("SPV klik Quantity Aspect")
	    public void klik_quantity_aspect() {
	    	tunggu(2);
	    	cekPenilaianPage.collapseQuantityAspect();
	    	extentTest.log(LogStatus.PASS, "SPV klik Quantity Aspect");
	    }
	    
	    @Then("SPV Update Penilaian Quantity Aspect")
		public void update_penilaian_quantity() {
	    	tunggu(2);
	    	cekPenilaianPage.editQuantityAspect(configProp.getTxtActual1());
	    	extentTest.log(LogStatus.PASS, "SPV Update Penilaian Quantity Aspect");
	    }
	    
	    @And("SPV Cancel Penilaian Quantity Aspect")
	    public void cancel_penilaian_quantity() {
	    	tunggu(2);
	    	cekPenilaianPage.cancelQuantityAspect();
	    	extentTest.log(LogStatus.PASS, "SPV Cancel Penilaian Quantity Aspect");
	    }
	    
	    @When("SPV klik Quality Aspect")
	    public void klik_quality_aspect() {
	    	tunggu(2);
	    	cekPenilaianPage.collapseQualityAspect();
	    	extentTest.log(LogStatus.PASS, "SPV klik Quality Aspect");
	    }
	    
	    @Then("SPV Update Penilaian Quality Aspect")
	    public void update_penilaian_quality() {
	    	tunggu(2);
	    	cekPenilaianPage.editQualityAspect(configProp.getTxtActualRat1());
	    	extentTest.log(LogStatus.PASS, "SPV Update Penilaian Quality Aspect");
	    }
	    
	    @And("SPV Cancel Penilaian Quality Aspect")
	    public void cancel_penilaian_quality() {
	    	tunggu(2);
	    	cekPenilaianPage.cancelQualityAspect();
	    	extentTest.log(LogStatus.PASS, "SPV Cancel Penilaian Quality Aspect");
	    }
	    
	    @When("SPV klik Aspiration")
	    public void klik_aspiration() {
	    	tunggu(2);
	    	cekPenilaianPage.collapseAspiration();
	    	extentTest.log(LogStatus.PASS, "SPV klik Aspiration");
	    }
	    
	    @Then("SPV Update Penilaian Aspiration")
	    public void update_penilaian_aspiration() {
	    	tunggu(2);
	    	cekPenilaianPage.editAspiration(configProp.getTxtAspiration());
	    	extentTest.log(LogStatus.PASS, "SPV Update Penilaian Aspiration");
	    }
	    
	    @And("SPV Cancel Penilaian Aspiration")
	    public void cancel_penilaian_aspiration() {
	    	tunggu(2);
	    	cekPenilaianPage.cancelAspiration();
	    	extentTest.log(LogStatus.PASS, "SPV Cancel Penilaian Aspiration");
	    }

	    @When("SPV klik Final Rating")
	    public void klik_final_rating() {
	    	tunggu(2);
	    	cekPenilaianPage.collapseFinalRating();
	    	extentTest.log(LogStatus.FAIL, "SPV klik Final Rating");
	    }
	    
	    @Then("SPV Simpan Data Penilaian")
	    public void klik_simpan_data_penilaian() {
	    	tunggu(2);
	    	cekPenilaianPage.simpanDataPenilaian();
	    	extentTest.log(LogStatus.PASS, "SPV Simpan Data Penilaian");
	    }
	    
	    @And("Menampilkan notifikasi Berhasil! dan Data tersimpan")
	    public void tampil_data_cek_penilaian() {
	    	tunggu(3);
	    	assertEquals(configProp.getTxtCekPenilaianBerhasil(), cekPenilaianPage.getTxtBerhasil());
	    	extentTest.log(LogStatus.FAIL, "Menampilkan notifikasi Berhasil! dan Data tersimpan");
	    }
	    
	    @When("SPV klik Next Page and Previous Page")
	    public void klik_next_page_cek_penilaian() {
	    	cekPenilaianPage.PagingCekPenilaian();
	    	extentTest.log(LogStatus.PASS, "SPV klik Next Page and Previous Page");
	    }
	    
	    @And("SPV klik Show Entries")
	    public void klik_show_cek_penilaian() {
	    	driver.navigate().refresh();
	    	tunggu(2);
	    	cekPenilaianPage.ShowPageCekPenilaian();
	    	extentTest.log(LogStatus.PASS, "SPV klik Show Entries");
	    }
	    
		@Then("Menampilkan data Cek Penilaian sesuai banyaknya data yang dipilih")
		public void tampil_show_entries_cek_penilaian() {
			extentTest.log(LogStatus.PASS, "Menampilkan data Cek Penilaian sesuai banyaknya data yang dipilih");
		}
		
		@When("SPV klik sorting pada Tabel Detail")
		public void klik_sorting_cek_penilaian() {
			cekPenilaianPage.SortCekPenilaian();
			extentTest.log(LogStatus.PASS, "SPV klik sorting pada Tabel Detail");
		}
		
		@Then("Menampilkan data Cek Penilaian secara ascending")
		public void tampil_sorting_cek_penilaian() {
			tunggu(2);
			extentTest.log(LogStatus.PASS, "Menampilkan data Cek Penilaian secara ascending");
		}
		
		@When("SPV search data")
		public void search_cek_penilaian() {
			tunggu(2);
			cekPenilaianPage.SearchCekPenilaian(configProp.getSearchCekPenilaian());
			extentTest.log(LogStatus.PASS, "SPV search data");
		}
		
		@Then("Menampilkan data search yang dicari")
		public void tampil_search_cek_penilaian() {
			tunggu(2);
			extentTest.log(LogStatus.FAIL, "Menampilkan data yang dicari");
		}
		
		
		//----------------------( PA360 Page )----------------------//
		@When("SPV Klik Menu PA 360")
		public void spv_klik_menu_PA_360() {
			pa360PageSPV.MenuPA();
			tunggu(2);
			extentTest.log(LogStatus.PASS, "SPV Klik Menu PA 360");
		}
		
		@Then("SPV Melihat Data Dan Sesuai")
		public void spv_melihat_data_dan_sesuai() {
			pa360PageSPV.indexPA360(configProp.getFilterspv3());
			assertEquals(configProp.getTxtPA360Page(), pa360PageSPV.getTxtPA360Page());
			extentTest.log(LogStatus.PASS, "SPV Melihat Data Dan Sesuai");
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
