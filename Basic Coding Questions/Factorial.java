import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		double factorial = 1;
        int temp = number;
		
		while(number>0) {
			factorial = factorial * number;
			number--;
		}
		System.out.println("Factorial of number "+ temp + " =   " + factorial);

	}

}

