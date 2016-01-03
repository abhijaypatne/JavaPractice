public class GenericOuter<St, Pt> {				// Parameterized types				
	public St st1;
	public Pt pt1;
	
	public class GenericInner<A, B>{			// An inner class
		public A a;
		public B b;
		
		public B getB(){
			return b;
		}
		public GenericInner(A a, B b){				// Generic constructor
			this.a = a;
			this.b = b;
		}
		
		public void setValInner(A a1, B b1){
			a = a1;
			b = b1;
		}
		public void printVal(){
			System.out.println("Inner block: Value of type A " + a + " Value of type B " + b);			
		}
	}
	
	public GenericOuter(St st, Pt pt){
		this.st1 = st;
		this.pt1 = pt;
	}
	public void setVal(St a, Pt b){
		st1 = a;
		pt1 = b;
	}
	public void printVal(){
		System.out.println("Outer block: Value of type st1 " + st1 + " Value of type pt1 " + pt1);			
	}
	
	public static void main(String[] args){
		// Type inference using diamonds
		GenericOuter<String, Integer> p1 = new GenericOuter<>("Default outer", 23);
		p1.printVal();
		p1.setVal("modified outer", 222);
		p1.printVal();
		
		GenericOuter<String, Integer>.GenericInner<String, Integer> inner = p1.new GenericInner<>("Default Inner", 15);
		inner.printVal();
		inner.setValInner("modified inner", 111);
		inner.printVal();
		
	}
}
