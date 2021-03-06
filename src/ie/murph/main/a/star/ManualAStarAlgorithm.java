package ie.murph.main.a.star;

public class ManualAStarAlgorithm {
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

	private final static int calcOne = start + start + distanceStart_AndA;
	private final static int calcTwo = start + start + distanceStart_AndB;

	public static void run() {
		// Possible paths
		int S = (start + start) + Start_Heuristic;
		System.out.println("S: " + S);

		int SA = calcOne + A_Heuristic;
		int SB = calcTwo + B_Heuristic;
		System.out.println("SA: " + SA + "\nSB: " + SB);

		int SAB = (calcOne + distanceA_And_B) + B_Heuristic;
		int SAC = (calcOne + distanceA_And_C) + C_Heuristic;
		int SAG = (calcOne + distanceA_And_G) + G_Heuristic;
		System.out.println("SAB: " + SAB + "\nSAC: " + SAC);

		int SBC = (calcTwo + distanceB_And_C) + C_Heuristic;
		System.out.println("SBC: " + SBC);

		int SABC = ((calcOne + distanceA_And_B) + distanceB_And_C) + C_Heuristic;
		int SACG = ((calcOne + distanceA_And_C) + distanceC_And_G) + G_Heuristic;
		int SBCG = ((calcTwo + distanceB_And_C) + distanceC_And_G) + G_Heuristic;
		System.out.println("SABC: " + SABC);

		int SABCG = ((calcOne + distanceA_And_B + distanceB_And_C) + distanceC_And_G) + G_Heuristic;

		System.out.println("Complete paths: ");
		System.out.println("Route S->A->G: " + SAG);
		System.out.println("Route S->A->C->G: " + SACG);
		System.out.println("Route S->B->C->G: " + SBCG);
		System.out.println("Route S->A->B->C->G: " + SABCG);
	}
}
