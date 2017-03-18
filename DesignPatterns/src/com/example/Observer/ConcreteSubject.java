package com.example.Observer;

public class ConcreteSubject extends Subject {
	
	private String mState;
	
	public String getState(){
		return mState;
	}
	
	public void change(String newState){
		mState = newState;
		System.out.println("subject状态发生改变:" + newState);
		this.notifyObservers();
	}

}
