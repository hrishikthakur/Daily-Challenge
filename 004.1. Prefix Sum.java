// O(n ^ 2)
public class Main{
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

    // Use 1 based indexing
		int[] a = new int[n + 1];
		for(int i = 1; i <= n; i++){
			a[i] = scn.nextInt();
		}

		int q = scn.nextInt();
		while(q-- > 0){
			int l = scn.nextInt();
			int r = scn.nextInt();
			long sum = 0;
			for(int i = l; i <= r; i++){
				sum += a[i];
			}
			System.out.println(sum);
		}
    
	}
}

// O(N) -> Prefix Sum
public class Main{
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] a = new int[n + 1];
		for(int i = 1; i <= n; i++){
			a[i] = scn.nextInt();
		}

		int[] prefix = new int[n + 1];
		for(int i = 1; i <= n; i++){
			prefix[i] = prefix[i - 1] + a[i];
		}

		int q = scn.nextInt();
		while(q-- > 0){
			int l = scn.nextInt();
			int r = scn.nextInt();
			System.out.println(prefix[r] - prefix[l - 1]);
		}
    
	}
}
