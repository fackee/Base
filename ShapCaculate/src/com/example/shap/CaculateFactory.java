package com.example.shap;

public class CaculateFactory {
	
	public static AbsShap Caculate(String type){
		if(type.equals("直线")){
			return new Line(3,4,5,6);
		}else if(type.equals("圆形")){
			return new Circle(10);
		}else if(type.equals("矩形")){
			return new Rectangle(10,5);
		}else{
			System.out.println("please input corret type");
			return null;
		}
	}
}
