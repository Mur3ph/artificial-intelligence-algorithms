package ie.murph.main.a.star;

import java.util.HashMap;
import java.util.Map;

public class GenericAStarAlgorithm {

	private final int[] heuristic = { 7, 6, 2, 1, 0 };
	private final static Map<String, Integer> distanceByRoute = new HashMap<String, Integer>() {
		{
			put("StartToA", 1);
			put("StartToB", 4);
			put("AB", 2);
			put("AC", 12);
			put("AG", 5);
			put("BC", 2);
			put("CG", 3);
		}
	};
	
	private static void run() {
		for (Map.Entry entry : distanceByRoute.entrySet()) {
		    System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}
	
	public static void main(String args[]){
		run();
	}
}
