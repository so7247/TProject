package com.tacademy.test;

public class GitTest {

	private String master;
	private String branch2;
	
	
	@Override
	public String toString() {
		return "GitTest [master=" + master + ", branch2=" + branch2 + "]";
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
