package com.example.Decorator;

public class Decorator implements Sourceable {

	private Sourceable mSourceable;
	
	public Decorator(Sourceable mSourceable){
		super();
		this.mSourceable = mSourceable;
	}
	
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before decorator!");  
		mSourceable.method();  
        System.out.println("after decorator!");  
	}

}
