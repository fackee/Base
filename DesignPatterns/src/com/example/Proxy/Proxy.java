package com.example.Proxy;

public class Proxy implements Sourceable {
	
	private Sourceable mSourceable;
	
	public Proxy(Sourceable mSourceable){
		this.mSourceable = mSourceable;
	}
	
	public void method() {
		// TODO Auto-generated method stub
		before();
		mSourceable.method();
		after();
	}
	
	private void before(){
		System.out.println("Before");
	}
	private void after(){
		System.out.println("After");
	}

}
