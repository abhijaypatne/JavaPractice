

// create singleton class 
public class MySingleton {

	private static MySingleton singleton = null;
	private static void MySingleton(){
		System.out.println("singleton object instantiated");
	}
	
	public static MySingleton getInstance(){
		if( singleton == null ){
			singleton = new MySingleton();
		}
		return singleton;
	}
	
	
}
