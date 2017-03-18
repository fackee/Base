package com.example.Observer;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject subject = new ConcreteSubject();
		Observer observer = new ConcreteObserver();
		subject.attach(observer);
		subject.change("NEW STATE");
	}

}
