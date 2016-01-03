
public class Method {
	static int i = 1;

	public static void test(){
		System.out.println("hello");
		i++;
		System.out.println(i);
	}

	public static void main(String[] args){
		System.out.println(i);
		Method.test();
		//Method method = new Method();
		System.out.println(i);
		Method.test();
		System.out.println(i);
		
	}
}
