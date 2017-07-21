package com.tacademy.data;

public class Data {
	private String name;
	private int age;
	

	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + "]";
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
