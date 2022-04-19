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
	
	@Value("${list}")
	private int list;
	
	@Value("${listSub}")
	private int listSub;
	
	@Value("${list1}")
	private int list1;
	
	@Value("${filter1}")
	private String filter1;
	
	@Value("${edit1}")
	private int edit1;
	
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
	
	@Value("${txtNilai}")
	private String txtNilai;
	
	@Value("${txtKosong}")
	private String txtKosong;
	
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
	
	@Value("${txtBerhasil}")
	private String txtBerhasil;
	
	@Value("${txtPA360}")
	private String txtPA360;
	
	@Value("${search}")
	private String search;
	
//----------------------Declaration Getter-----------------------------------
	
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
	
	public int getList() {
		return list;
	}

	public void setList(int list) {
		this.list = list;
	}

	public int getListSub() {
		return listSub;
	}

	public void setListSub(int listSub) {
		this.listSub = listSub;
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

	public int getEdit1() {
		return edit1;
	}

	public void setEdit1(int edit1) {
		this.edit1 = edit1;
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
}
