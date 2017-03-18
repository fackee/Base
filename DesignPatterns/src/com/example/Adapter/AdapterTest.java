package com.example.Adapter;

public class AdapterTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Targetable target = new Adapter();
		//target.method();
		//target.anotherMethod();
		Targetable wrapper = new Wrapper(new Source());
		wrapper.method();
		wrapper.anotherMethod();

	}

}
