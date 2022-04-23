package com.juaracoding.hrisEmployeeStaf.utils;

public enum TestCases {

	T1("Testing Login Downliner Valid"),
	T2("Testing Login Downliner Invalid"),
	T3("Testing Staff Set Target"),
	T4("User dapat mengisi penilaian"),
	T5("Testing Menu PA360"),
	T6("Testing Login Upliner Valid"),
	T7("Testing Login Upliner Invalid"),
	T8("Testing Set Target SPV"),
	T9("Testing SPV Approval Target"),
	T10("Testing SPV Isi Penilaian"),
	T11("Testing SPV Cek Penilaian"),
	T12("Testing SPV PA360");	
	private String testName;
	
	TestCases(String value) {
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
