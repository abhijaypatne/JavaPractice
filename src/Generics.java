import java.util.*;


public class Generics<St, Pt> {
	public St st1;
	public Pt pt1;
	
	public class Pair<A, B>{
		public A a;
		public B b;
		
		public B getB(){
			return b;
		}
		public Pair(A a, B b){
			this.a = a;
			this.b = b;
		}
		
		public void setValInner(A a1, B b1){
			a = a1;
			b = b1;
		}
		public void printVal(){
			System.out.println("value of type A " + a + " Value of type B " + b);			
		}
	}
	
	public Generics(St st, Pt pt){
		this.st1 = st;
		this.pt1 = pt;
	}
	public void setVal(St a, Pt b){
		st1 = a;
		pt1 = b;
	}
	
		
	
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		System.out.println(list);
		String s = (String) list.get(0);
		System.out.println(s);
		Generics<String, Integer> p1 = new Generics<String, Integer>("abhijay", 23);
		p1.setVal("abhijay", 23);
		
		Generics<String, Integer>.Pair<String, Integer> inner = p1.new Pair<>("Inner", 15);
		inner.setValInner("modified inner", 111);
		inner.printVal();
		
	}
}
