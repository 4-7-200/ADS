class LSD
{
	public static void sort(String[] a, int w)
	{
		int N = a.length;
		int R=256;
		String[] aux = new String[N];

		for (int d = w-1; d >= 0; d--){

		// Sort by key-indexed counting on dth char.	
 			int[] count = new int[R+1];
 				for (int i = 0; i < N; i++)
		
 					// Compute frequency counts.
		 			count[a[i].charAt(d) + 1]++;
				for (int r = 0; r < R; r++)

				// Transform counts to indices.

					count[r+1] += count[r];
				for (int i = 0; i < N; i++)

				// Distribute.

		 			aux[count[a[i].charAt(d)]++] = a[i];
				
		 		for (int i = 0; i < N; i++)

				// Copy back.

				 	a[i] = aux[i];
		 		}
		for(int i = 0; i<N; i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.print("\n");	
		 
	}
	public static void main(String[] args)
		{
			String a[] ={"dawa", "nima", "karm", "sums", "reda"};
			int w = 4;
			sort(a,w);
		}
}