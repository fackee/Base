package com.example.Adapter;

public class Wrapper implements Targetable {
	
	private Source mSource;

	public Wrapper(Source mSource){
		this.mSource = mSource;
	}
	
	public void method() {
		// TODO Auto-generated method stub
		mSource.method();
	}

	public void anotherMethod() {
		// TODO Auto-generated method stub
		System.out.print("this is another method");
	}

}
