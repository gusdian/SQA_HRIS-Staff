package com.juaracoding.hrisEmployeeStaf.utils;

public enum TestCases {

	T1("Testing Login Downliner Valid"),
	T2("Testing Login Downliner Invalid");
	
	private String testName;
	
	TestCases(String value) {
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
