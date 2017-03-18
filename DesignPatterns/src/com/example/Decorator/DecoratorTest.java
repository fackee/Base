package com.example.Decorator;

public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable decorator = new Decorator(new Source());
		decorator.method();
	}

}
