import java.util.*;
import java.util.List;


public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
    
    public static void main(String[] args){
    	Pair<String, Integer> p1 = new Pair<String, Integer>("Even", 8);
    	Pair<String, String>  p2 = new Pair<String, String>("hello", "world");
    	System.out.println("p1 Key: " + p1.key + "\np1 value: " + p1.value);
    	System.out.println("p2 Key: " + p2.key + "\np2 value: " + p2.value);
    	
    	List<Integer> ints = new ArrayList<Integer>();
    	
    	ints.add(0);
    	ints.add(1);

    	int sum = 0;
    	for (int i : ints) {
    	sum += i;
    	}
    	System.out.println("sum " + sum);
    }
}


/* example in class; for trial purpose
public class Pair<T> {
private final T first;
private final T second;
public Pair(T first, T second) {
this.first = first;
this.second = second; }
public T first( ) {
 return first; }
public T second( ) {
 return second; }
public List<String> stringList( ) {
return Arrays.asList(String.valueOf(first),String.valueOf(second));
}

public static void main(String[ ] args) {
Pair <Object> p = new Pair<Object>(23, "skidoo");
System.out.println(p.first( ) + " " + p.second( ));
for (String s : p.stringList( )) System.out.print(s + " ");
}
}
*/