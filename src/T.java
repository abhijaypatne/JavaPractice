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
	public static void main(String[ ] args) {
		new T("main").reproduce( );
	} }