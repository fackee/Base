package com.example.shap;

public class Line extends AbsShap {
	private double sx,ex,sy,ey;
	public Line(double sx,double ex,double sy,double ey){
		this.sx = sx;
		this.ex = ex;
		this.sy = sy;
		this.ey = ey;
	}
	public double CaculateLength() {
		return Math.sqrt(Math.pow(Math.abs(ex-sx), 2)
				+Math.pow(Math.abs(ey-sy), 2));
	}

}
