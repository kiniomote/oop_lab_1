
public class Factorial {

	public static void main(String[] args) {
		System.out.print(getFactorial(Integer.parseInt(args[0])));
	}
	
	public static int getFactorial(int number) {
		if (number == 1) {
			return 1;
		}
		else {
			return number * getFactorial(number - 1);
		}
	}

}
