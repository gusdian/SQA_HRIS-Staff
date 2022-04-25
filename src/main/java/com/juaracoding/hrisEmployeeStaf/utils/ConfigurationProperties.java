package com.juaracoding.hrisEmployeeStaf.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${email_wrong}")
	private String email_wrong;
	
	@Value("${password_wrong}")
	private String password_wrong;

	@Value("${txtWelcome}")
	private String txtWelcome;
	
	@Value("${txtWrongEmailPass}")
	private String txtWrongEmailPass;
	
	@Value("${list1}")
	private int list1;
	
	@Value("${filter1}")
	private String filter1;
	
	@Value("${edit2}")
	private int edit2;
	
	@Value("${list2}")
	private int list2;
	
	@Value("${filter2}")
	private String filter2;
	
	@Value("${name}")
	private String name;
	
	@Value("${starttgl}")
	private String starttgl;
	
	@Value("${endtgl}")
	private String endtgl;
	
	@Value("${listcount}")
	private int listcount;
	
	@Value("${weight}")
	private String weight;
	
	@Value("${param1}")
	private String param1;
	
	@Value("${tar1}")
	private String tar1;
	
	@Value("${param2}")
	private String param2;
	
	@Value("${tar2}")
	private String tar2;

	@Value("${list3}")
	private int list3;
	
	@Value("${filter3}")
	private String filter3;
	
	@Value("${list4}")
	private int list4;
	
	@Value("${filter4}")
	private String filter4;
	
	@Value("${txtAssignTarget}")
	private String txtAssignTarget;
	
	@Value("${txtKosong}")
	private String txtKosong;
	
	@Value("${txtNilai}")
	private String txtNilai;
	
	@Value("${actResult1}")
	private String actResult1;
	
	@Value("${actResult2}")
	private String actResult2;
	
	@Value("${pilih}")
	private String pilih;
	
	@Value("${actResult3}")
	private String actResult3;
	
	@Value("${actResult4}")
	private String actResult4;
	
	@Value("${aspir}")
	private String aspir;
	
	@Value("${src1}")
	private String sqa;
	
	@Value("${txtBerhasil}")
	private String txtBerhasil;
	
	@Value("${txtPA360}")
	private String txtPA360;
	
	@Value("${search}")
	private String search;
	
	@Value("${txtData}")
	private String txtData;
	
	@Value("${txtDataa}")
	private String txtDataa;
//----------------------Declaration Getter-----------------------------------
	
	public String getTxtDataa() {
		return txtDataa;
	}
	
	public String getTxtData() {
		return txtData;
	}

	public String getBrowser() {
		return browser;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail_wrong() {
		return email_wrong;
	}

	public String getPassword_wrong() {
		return password_wrong;
	}

	public String getTxtWelcome() {
		return txtWelcome;
	}

	public String getTxtWrongEmailPass() {
		return txtWrongEmailPass;
	}
	
	public int getList1() {
		return list1;
	}

	public void setList1(int list1) {
		this.list1 = list1;
	}

	public String getFilter1() {
		return filter1;
	}

	public void setFilter1(String filter1) {
		this.filter1 = filter1;
	}

	public int getEdit2() {
		return edit2;
	}

	public void setEdit2(int edit2) {
		this.edit2 = edit2;
	}

	public int getList2() {
		return list2;
	}

	public void setList2(int list2) {
		this.list2 = list2;
	}

	public String getFilter2() {
		return filter2;
	}

	public void setFilter2(String filter2) {
		this.filter2 = filter2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStarttgl() {
		return starttgl;
	}

	public void setStarttgl(String starttgl) {
		this.starttgl = starttgl;
	}

	public String getEndtgl() {
		return endtgl;
	}

	public void setEndtgl(String endtgl) {
		this.endtgl = endtgl;
	}

	public int getListcount() {
		return listcount;
	}

	public void setListcount(int listcount) {
		this.listcount = listcount;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getTar1() {
		return tar1;
	}

	public void setTar1(String tar1) {
		this.tar1 = tar1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getTar2() {
		return tar2;
	}

	public void setTar2(String tar2) {
		this.tar2 = tar2;
	}

	public int getList3() {
		return list3;
	}

	public void setList3(int list3) {
		this.list3 = list3;
	}

	public String getFilter3() {
		return filter3;
	}

	public void setFilter3(String filter3) {
		this.filter3 = filter3;
	}

	public int getList4() {
		return list4;
	}

	public void setList4(int list4) {
		this.list4 = list4;
	}

	public String getFilter4() {
		return filter4;
	}

	public void setFilter4(String filter4) {
		this.filter4 = filter4;
	}

	public String getTxtAssignTarget() {
		return txtAssignTarget;
	}

	public void setTxtAssignTarget(String txtAssignTarget) {
		this.txtAssignTarget = txtAssignTarget;
	}

	public String getTxtNilai() {
		return txtNilai;
	}
	
	public String getTxtKosong() {
		return txtKosong;
	}
	
	public String getActResult1() {
		return actResult1;
	}
	
	public String getActResult2() {
		return actResult2;
	}
	
	public String getPilih() {
		return pilih;
	}
	
	public String getActResult3() {
		return actResult3;
	}
	
	public String getActResult4() {
		return actResult4;
	}
	
	public String getAspir() {
		return aspir;
	}
	
	public String getTxtBerhasil() {
		return txtBerhasil;
	}
	
	public String getTxtPA360() {
		return txtPA360;
	}

	public String getSearch() {
		return search;
	}
	
	public String getSqa() {
		return sqa;
	}

	//----------------------HRIS SPV-----------------------------------
	
	
//	@Value("${browserspv}")
//	private String browserspv;

	@Value("${emailku}")
	private String emailku;
	
	@Value("${password_eror}")
	private String password_eror;
	
	@Value("${txtInvalidLogin}")
	private String txtInvalidLogin;
	
	@Value("${emailspv}")
	private String emailspv;
	
	@Value("${passwordspv}")
	private String passwordspv;
	
	@Value("${txtWelcomeSPV}")
	private String txtWelcomeSPV;
	
	@Value("${filterspv1}")
	private String filterspv1;
	
	@Value("${namee}")
	private String namee;
	
	@Value("${startDate}")
	private String startDate;
	
	@Value("${endDate}")
	private String endDate;
	
	@Value("${weight1}")
	private String weight1;
	
	@Value("${weight2}")
	private String weight2;
	
	@Value("${paramspv1}")
	private String paramspv1;
	
	@Value("${tarspv1}")
	private String tarspv1;
	
	@Value("${filterspv2}")
	private String filterspv2;
	
//	@Value("${param2}")
//	private String param2;

//	@Value("${tar2}")
//	private String tar2;
	
	@Value("${TxtApprovalTarget}")
	private String TxtApprovalTarget;
	
	@Value("${filterspv3}")
	private String filterspv3;
	
	@Value("${txtPenilaianPage}")
	private String txtPenilaianPage;
	
	@Value("${filterspv4}")
	private String filterspv4;
	
	@Value("${txtPA360Page}")
	private String txtPA360Page;
	
	@Value("${src}")
	private String src;
	
	@Value("${target}")
	private String target;
	
	@Value("${start}")
	private String start;
	
	@Value("${end}")
	private String end;
	
	@Value("${persen}")
	private String persen;
	
	@Value("${persen2}")
	private String persen2;
	
	@Value("${diri}")
	private String diri;
	
	@Value("${team}")
	private String team;
	
	@Value("${s}")
	private String s;
	
	@Value("${nama}")
	private String nama;
	
	@Value("${txtTarget}")
	private String txtTarget;
	
	@Value("${txtCekPenilaian}")
	private String txtCekPenilaian;
	
	@Value("${txtActual1}")
	private String txtActual1;
	
	@Value("${txtActual2}")
	private String txtActual2;
	
	@Value("${txtActualRat1}")
	private String txtActualRat1;
	
	@Value("${txtActualRat2}")
	private String txtActualRat2;
	
	@Value("${txtAspiration}")
	private String txtAspiration;
	
	@Value("${txtCekPenilaianBerhasil}")
	private String txtCekPenilaianBerhasil;
	
	@Value("${searchCekPenilaian}")
	private String searchCekPenilaian;
	

	//----------------------Declaration Getter-----------------------------------
	//----------------------Login Page-----------------------------------
	public String getEmailku() {
		return emailku;
	}

	public void setEmailku(String emailku) {
		this.emailku = emailku;
	}

	public String getPassword_eror() {
		return password_eror;
	}

	public void setPassword_eror(String password_eror) {
		this.password_eror = password_eror;
	}

	public String getEmailspv() {
		return emailspv;
	}

	public void setEmailspv(String emailspv) {
		this.emailspv = emailspv;
	}

	public String getPasswordspv() {
		return passwordspv;
	}

	public void setPasswordspv(String passwordspv) {
		this.passwordspv = passwordspv;
	}

	public String getTxtInvalidLogin() {
		return txtInvalidLogin;
	}

	public String getTxtWelcomeSPV() {
		return txtWelcomeSPV;
	}
			
	//----------------------Approve Page-----------------------------------

	public String getFilterspv1() {
		return filterspv1;
	}

	public void setFilterspv1(String filterspv1) {
		this.filterspv1 = filterspv1;
	}

	public String getNamee() {
		return namee;
	}

	public void setNamee(String namee) {
		this.namee = namee;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getWeight1() {
		return weight1;
	}

	public void setWeight1(String weight1) {
		this.weight1 = weight1;
	}

	public String getWeight2() {
		return weight2;
	}

	public void setWeight2(String weight2) {
		this.weight2 = weight2;
	}

	public String getTarspv1() {
		return tarspv1;
	}

	public void setTarspv1(String tarspv1) {
		this.tarspv1 = tarspv1;
	}

	public String getFilterspv2() {
		return filterspv2;
	}

	public void setFilterspv2(String filterspv2) {
		this.filterspv2 = filterspv2;
	}

	public String getTxtApprovalTarget() {
		return TxtApprovalTarget;
	}
	
	//----------------------Approve Page-----------------------------------
	
	public String getFilterspv3() {
		return filterspv3;
	}

	public void setFilterspv3(String filterspv3) {
		this.filterspv3 = filterspv3;
	}

	public String getTxtPenilaianPage() {
		return txtPenilaianPage;
	}

	//----------------------Approve Page-----------------------------------
	
	public String getFilterspv4() {
		return filterspv4;
	}

	public void setFilterspv4(String filterspv4) {
		this.filterspv4 = filterspv4;
	}

	public String getTxtPA360Page() {
		return txtPA360Page;
	}	
	
	//----------------------Approve Page-----------------------------------
	
	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getPersen() {
		return persen;
	}

	public void setPersen(String persen) {
		this.persen = persen;
	}

	public String getPersen2() {
		return persen2;
	}

	public void setPersen2(String persen2) {
		this.persen2 = persen2;
	}

	public String getDiri() {
		return diri;
	}

	public void setDiri(String diri) {
		this.diri = diri;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTxtTarget() {
		return txtTarget;
	}
	
	//----------------------Cek Penilaian Page-----------------------------------
	public String getSearchCekPenilaian() {
		return searchCekPenilaian;
	}

	public void setSearchCekPenilaian(String searchCekPenilaian) {
		this.searchCekPenilaian = searchCekPenilaian;
	}

	public String getTxtCekPenilaian() {
		return txtCekPenilaian;
	}

	public String getTxtActual1() {
		return txtActual1;
	}

	public String getTxtActual2() {
		return txtActual2;
	}

	public String getTxtActualRat1() {
		return txtActualRat1;
	}

	public String getTxtActualRat2() {
		return txtActualRat2;
	}

	public String getTxtAspiration() {
		return txtAspiration;
	}

	public String getTxtCekPenilaianBerhasil() {
		return txtCekPenilaianBerhasil;
	}

}
