
public class Fibonachi {

	public static void main(String[] args) {
		printFibonachiNumbers(Integer.parseInt(args[0]));
	}
	
	public static void printFibonachiNumbers(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(getFibonachi(i));
		}
	}
	
	public static int getFibonachi(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		else {
			return getFibonachi(number - 1) + getFibonachi(number - 2);
		}
	}
}
