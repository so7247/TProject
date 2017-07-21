package com.tacademy.test;

public class GitTest {

	private String master;
	private String branch1;
	private String branch2;
	

	@Override
	public String toString() {
		return "GitTest [master=" + master + ", branch1=" + branch1 + ", branch2=" + branch2 + "]";
	}

	public String getBranch1() {
		return branch1;
	}

	public void setBranch1(String branch1) {
		this.branch1 = branch1;
	}

	public String getBranch2() {
		return branch2;
	}

	public void setBranch2(String branch2) {
		this.branch2 = branch2;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}
	
	
}
