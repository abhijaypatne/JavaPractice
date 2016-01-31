public class T {
	private final String name;
	int i = 0;
	T(String name) { this.name = name; }
	public String name( ) { return name; }
//	private String name( ) { return name; }					try removing this comment
	private void reproduce( ) {
		new T("reproduce") {
			void printName( ) {
				System.out.println("i=" + ++i + " inside anonymous " + name( ) + " After i=" + i++);}
			//System.out.println("inside anonymous " + name( ));
		}.printName( ); }

	public void testMethod(){
		synchronized (this) {
			System.out.println("in synchronized block");
		}

	}
	
	public static void main(String[ ] args) {
		
		synchronized (T.class) {
			System.out.println("synchronized block in static method");			
		}
		//new T("main").reproduce( );
	
		System.out.println("In T.java");
		//Test.main(null);;
	//	Test test = new Test();		// Not allowed of constructor of Test is private
	} 


}