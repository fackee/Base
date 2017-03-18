package com.example.shap;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsShap line = CaculateFactory.Caculate("直线");
		AbsShap circle = CaculateFactory.Caculate("圆形");
		AbsShap rectangle = CaculateFactory.Caculate("矩形");
		System.out.println(circle.CaculateArea()+","+circle.CaculateLength());
		System.out.println(line.CaculateLength()+""+line.CaculateArea());
		System.out.println(rectangle.CaculateLength()+""+rectangle.CaculateArea());
	}

}
