
public class Util <T extends Number> {

	public <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
		boolean b = true;
		b = p1.getKey().equals(p2.getKey());
		return b;
		}
	
	public static void main(String[] args){
		Pair<Integer, String> p1 = new Pair<>(1, "hello");
		Pair<Integer, String> p2 = new Pair<>(3, "hello");
		Util util = new Util();
		System.out.println(util.compare(p1, p2));
	}
}
