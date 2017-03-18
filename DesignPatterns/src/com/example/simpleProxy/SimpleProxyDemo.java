package com.example.simpleProxy;



interface Interface{
	void doSomething();
	void somethingElse(String args);
}

class RealObject implements Interface{

	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("do something");
	}

	public void somethingElse(String args) {
		// TODO Auto-generated method stub
		System.out.println("something else :"+args);
	}
	
}

class SimpleProxy implements Interface{
	private Interface proxied;
	
	public SimpleProxy(Interface proxied){
		this.proxied = proxied;
	}
	
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxy do something");
		proxied.doSomething();
	}

	public void somethingElse(String args) {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxy something else :"+args);
		proxied.somethingElse(args);
	}
}
public class SimpleProxyDemo {
	
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("balabala");
	}
	public static void main(String[] args){
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}
}
