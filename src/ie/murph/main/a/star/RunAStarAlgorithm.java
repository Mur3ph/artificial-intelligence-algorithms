package ie.murph.main.a.star;

public class RunAStarAlgorithm {
	
	private final static int start = 0;
	private final static int Start_Heuristic = 7;
	private final static int A_Heuristic = 6;
	private final static int B_Heuristic = 2;
	private final static int C_Heuristic = 1;
	private final static int G_Heuristic = 0;
	
	private final static int distanceStart_AndA = 1;
	private final static int distanceStart_AndB = 4;
	private final static int distanceA_And_B = 2;
	private final static int distanceA_And_G = 12;
	private final static int distanceA_And_C = 5;
	private final static int distanceB_And_C = 2;
	private final static int distanceC_And_G = 3;
	
	public static void main(String[] args){
		int S = (start + start) + Start_Heuristic;
		
		int SA = ((start + start) + distanceStart_AndA) + A_Heuristic;
		int SB = ((start + start) + distanceStart_AndB) + B_Heuristic;
		
		int SAB = ((start + start + distanceStart_AndA) + distanceA_And_B) + B_Heuristic;
		int SAC = ((start + start + distanceStart_AndA) + distanceA_And_C) + C_Heuristic;
		int SAG = ((start + start + distanceStart_AndA) + distanceA_And_G) + G_Heuristic;
		
		int SBC = ((start + start + distanceStart_AndB) + distanceB_And_C) + C_Heuristic;
		
		int SABC = ((start + start + distanceStart_AndA + distanceA_And_B) + distanceB_And_C) + C_Heuristic;
		int SACG = ((start + start + distanceStart_AndA + distanceA_And_C) + distanceC_And_G) + G_Heuristic;
		int SBCG = ((start + start + distanceStart_AndB + distanceB_And_C) + distanceC_And_G) + G_Heuristic;
		
		int SABCG = ((start + start + distanceStart_AndA + distanceA_And_B + distanceB_And_C) + distanceC_And_G)  + G_Heuristic;
		
		System.out.println("SAG: " + SAG);
		System.out.println("SACG: " + SACG);
		System.out.println("SBCG: " + SBCG);
		System.out.println("SABCG: " + SABCG);
	}
	
	
	
//	A* Java code Resource: https://codereview.stackexchange.com/questions/38376/a-search-algorithm
//	Pseudocode wiki: https://en.wikipedia.org/wiki/A*_search_algorithm#Pseudocode
//	https://www.youtube.com/watch?v=DhtSZhakyOo
}
