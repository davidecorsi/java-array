
public class Main {
	public static void main(String[] args) {
		int[] n;
		n = new int[10];
		n[0] = 5;
		int [] n1 = {3, 6, 7, 9, 10, 1, 4, 6, 15, 2};
		
		// Utilizzando il for
		for(int i = 0; i < n1.length; i++) {
			System.out.println(n1[i]);
		}
		
		// Utilizzando il for each
		for(int i: n) {
			System.out.println(i);
		}
	}
}
