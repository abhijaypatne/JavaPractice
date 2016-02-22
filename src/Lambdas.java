import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String separator = ",";
//		separator = "+";	// This will not work, because: 
		//Local variable separator defined in an enclosing scope must be final or effectively final
		Arrays.asList( "a", "b", "d" ).forEach( 
		    ( String e ) -> System.out.print( e + separator ) );
		
		List<String> listOfStrings = new ArrayList<String> ( Arrays.asList( "a", "b", "d" )
																   .stream()
																   .sort( ( e1, e2 ) -> e1.compareTo( e2 ) )
																   .collect());

		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
		    int result = e1.compareTo( e2 );
		    return result;
		} );
		System.out.println(10.0/2);
	}

}
