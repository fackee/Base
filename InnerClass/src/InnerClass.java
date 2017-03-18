//通过内部类实现“多重继承”
	class D{
		void f(){
			System.out.print("D");
		}
	}
	abstract class E{
		abstract void f();
	}
	class Z extends D{
		E makeE(){
			return new E(){
				void f(){
					System.out.print("E");
				}
			};
		}
	}
public class InnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z = new Z();
		z.f();
		z.makeE().f();
	}

}
