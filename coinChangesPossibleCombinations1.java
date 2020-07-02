class Main
{
	// Function to find the total number of distinct ways to get change of N
	// from unlimited supply of coins in set S
	public static int count(int S[], int N) {

		int n = S.length;

		int T[][] = new int[n + 1][N + 1];

		for (int i = 0 ; i <= n; i++) {
			T[i][0] = 1;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= N; j++) {
				if (S[i - 1] > j) {
					T[i][j] = T[i - 1][j];
				}
				else {
					T[i][j] = T[i - 1][j] + T[i][j - S[i - 1]];
				}
			}
		}

		return T[n][N];
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
