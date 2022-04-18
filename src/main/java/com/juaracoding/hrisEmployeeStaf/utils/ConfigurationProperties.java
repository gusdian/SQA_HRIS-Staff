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
	
	@Value("${txtNilai}")
	private String txtNilai;
	
	@Value("${txtKosong}")
	private String txtKosong;
	
	@Value("${actResult1}")
	private String actResult1;
	
	@Value("${actResult2}")
	private String actResult2;
	
	@Value("${actResult3}")
	private String actResult3;
	
	@Value("${actResult4}")
	private String actResult4;
	
	@Value("${aspir}")
	private String aspir;
	
	@Value("${txtBerhasil}")
	private String txtBerhasil;
	
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
}
