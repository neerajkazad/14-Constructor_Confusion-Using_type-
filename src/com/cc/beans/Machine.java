package com.cc.beans;

public class Machine {
	private int id;
	private String name;

	//Case1:
/*	public Machine(int id) {
		super();
		this.id = id;
	}

	public Machine(String name) {
		super();
		this.name = name;
	}*/
	//Case2:
	
	public Machine(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", name=" + name + "]";
	}


	
}
