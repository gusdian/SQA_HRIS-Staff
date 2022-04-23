package com.juaracoding.hrisEmployeeStaf.utils;

public enum TestCases {

	T1("Testing Login Downliner Valid"),
	T2("Testing Login Downliner Invalid"),
	T3("Testing Staff Set Target"),
	T4("User dapat mengisi penilaian"),
	T5("Testing Menu PA360");
	
	private String testName;
	
	TestCases(String value) {
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
