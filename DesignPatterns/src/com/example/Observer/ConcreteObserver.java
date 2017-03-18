package com.example.Observer;

public class ConcreteObserver implements Observer {
	
	private String mObserverState;

	public void update(Subject subject) {
		// TODO Auto-generated method stub
		mObserverState = ((ConcreteSubject)subject).getState();
		System.out.println("观察者状态为："+mObserverState);
	}

}
