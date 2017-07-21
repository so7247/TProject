package com.tacademy.data;

public class Data {
	private String name;
	private int age;
	private int testingaddress;

	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", testingaddress=" + testingaddress + "]";
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
