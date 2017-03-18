package com.example.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


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
class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	public DynamicProxyHandler(Object proxied){
		this.proxied = proxied;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("**** proxy: " + proxy.getClass()+
				"\nmethod:"+ method + "\nargs:" +args);
		if(args!=null){
			for(Object arg : args){
				System.out.println(" "+arg);
			}
		}
		return method.invoke(proxied, args);
	}
	
}

public class SimpleDynamicProxy {
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("bonobono");
	}
	public static void main(String[] args){
		RealObject robj = new RealObject();
		consumer(robj);
		Interface proxy = (Interface)Proxy.newProxyInstance(
				Interface.class.getClassLoader(),
				new Class[]{Interface.class},
				new DynamicProxyHandler(robj));
		consumer(proxy);
	}

}
