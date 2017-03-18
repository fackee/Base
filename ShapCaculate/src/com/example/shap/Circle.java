package com.example.shap;

public class Circle extends AbsShap {
	private double r;
	
	public Circle(double r){
		this.r = r;
	}

	public double CaculateLength() {
		return 2*Math.PI*r;
	}
	
	public double CaculateArea(){
		return Math.PI*r*r;
	}

}
