package simplejava;

public class starPattern {
	int l = 1;



	public void star2(int num) {
		for (int i = 0; i < num; i++) {
			for (int k = num - i; k > 0; k--)
				System.out.print(" ");
			for (int j = 0; j < i*2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		starPattern pattern = new starPattern();
		pattern.star2(25);

	}
}
