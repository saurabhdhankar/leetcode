class Main
{
	// Function to find the total number of distinct ways to get
	// change of N from unlimited supply of coins in set S
	public static int count(int S[], int N) {

		int T[] = new int[N+1];
		T[0] = 1;

		for (int i = 0; i < S.length; i++) {
			for (int j = S[i]; j <= N; j++) {
				T[j] += T[j - S[i]];
			}
		}

		return T[N];
	}

	public static void main(String[] args)
	{
		// n coins of given denominations
		int[] S = { 1, 2, 3 };

		// Total Change required
		int N = 4;

		System.out.println("Total number of ways to get desired change is "
				+ count(S, N));
	}
}
