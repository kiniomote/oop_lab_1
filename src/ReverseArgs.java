
public class ReverseArgs {

	public static void main(String[] args) {
		for (int i = args.length; i > 0; i--) {
			for (int j = args[i - 1].length(); j > 0; j--) {
				System.out.print(args[i - 1].charAt(j - 1));
			}
			System.out.print(" ");
		}
	}

}
