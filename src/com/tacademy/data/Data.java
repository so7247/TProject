package com.tacademy.data;

public class Data {
	private String name;
	private int age;
	private int testingaddress;
	private String masteraddress;
	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", testingaddress=" + testingaddress + ", masteraddress="
				+ masteraddress + "]";
	}

	public String getMasteraddress() {
		return masteraddress;
	}

	public void setMasteraddress(String masteraddress) {
		this.masteraddress = masteraddress;
	}

	public int getTestingaddress() {
		return testingaddress;
	}

	public void setTestingaddress(int testingaddress) {
		this.testingaddress = testingaddress;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
