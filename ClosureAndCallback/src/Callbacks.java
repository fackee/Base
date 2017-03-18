interface Incrementable{
	void increment();
}

class Callee1 implements Incrementable{
	private int i = 0;
	public void increment(){
		i++;
		System.out.println(i);
	}
}

class MyIncrement{
	public void increment(){
		System.out.println("other oprating");
	}
	static void f(MyIncrement mi){
		mi.increment();
	}
}

class Callee2 extends MyIncrement{
	private int i = 0;
	public void increment(){
		super.increment();
		i++;
		System.out.println(i);
	}
	private class Closure implements Incrementable{
		public void increment(){
			Callee2.this.increment();
		}
	}
	Incrementable getCallBackReference(){
		return new Closure();
	}
}
class Caller{
	private Incrementable callbackREference;
	Caller(Incrementable it){
		callbackREference = it;
	}
	void go(){
		callbackREference.increment();
	}
}
public class Callbacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallBackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}

}
