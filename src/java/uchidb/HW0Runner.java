package uchidb;
import java.util.*;


/**
 * @author aelmore
 */
public class HW0Runner<T, S> extends ContainersImplementation<T, S> {

	//TODO you likely will need to add member variable
	private static Containers<Integer, String> instance = null;
	private HW0Runner() {
		//just chillin'
	}
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
		if(instance == null) {
			instance = new HW0Runner<Integer, String>();
		}
		return instance;
	}

	public static void main(String[] args){

	}
}