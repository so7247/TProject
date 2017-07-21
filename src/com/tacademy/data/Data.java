package com.tacademy.data;

public class Data {
	private String name;
	private int age;
	private int testingaddress;
	private String masteraddress;
	private String hotfix;
	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", testingaddress=" + testingaddress + ", masteraddress="
				+ masteraddress + ", hotfix=" + hotfix + "]";
	}

	public String getHotfix() {
		return hotfix;
	}

	public void setHotfix(String hotfix) {
		this.hotfix = hotfix;
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
