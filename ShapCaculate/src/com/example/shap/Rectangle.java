package com.example.shap;

public class Rectangle extends AbsShap {

	private double width,height;
	public Rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}
	public double CaculateLength() {
		return 2*(width+height);
	}
	public double CaculateArea(){
		return width*height;
	}

}
