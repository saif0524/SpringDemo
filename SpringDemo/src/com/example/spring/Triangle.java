package com.example.spring;

public class Triangle {
	
	private String type;
	private int side;
	
	public Triangle(String type, int side){
		this.type = type;
		this.side = side;
	}
	
	public String getType() {
		return type;
	}
	
	public int getSide() {
		return side;
	}
/*
	public void setType(String type) {
		this.type = type;
	}
*/
	public void draw() {
		System.out.println(getType()+" Triangle Drawn with " + side + " sides");
	}
}
