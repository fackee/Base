package com.example.shap;

public abstract class AbsShap implements Shap {

	public abstract double CaculateLength();

	public double CaculateArea() {
		System.out.print("Don't Support");
		return 0;
	}

}
