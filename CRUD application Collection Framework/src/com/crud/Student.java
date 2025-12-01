package com.crud;

public class Student {

	private int id;
	private String name;
	private String cource;
	private double fees;

	public Student(int id, String name, String cource, double fees) {
		this.id = id;
		this.name = name;
		this.cource = cource;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
}
