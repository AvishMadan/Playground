package simplejava;

public class RevrseString {

	public static void main(String[] args) {
		String str = "Avish is a tester";
		String rev = "";

		String a[] = str.split(" ");

		for (int i = 0; i < a.length; i++) {
			for (int j = a[i].length() - 1; j > -1; j--) {
				System.out.print(a[i].charAt(j));

			}

			System.out.print(" ");

		}

		System.out.println(rev);

	}
}
