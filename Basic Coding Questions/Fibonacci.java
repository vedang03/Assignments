import java.util.Scanner;

public class Fibonacci {
	static int firstNumber = 0 , secondNumber = 1;
	
	static void printFibonacci(int series, int firstNumber , int secondNumber){
		int thirdNumber;
		if(series>0) {
		thirdNumber = firstNumber + secondNumber;
		System.out.println(" "+thirdNumber);
		firstNumber = secondNumber;
		secondNumber = thirdNumber;
		printFibonacci(series-1,firstNumber , secondNumber);
		}
		
		
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int series = sc.nextInt();
		System.out.println(" " + firstNumber + "\n" + " " + secondNumber);
		printFibonacci(series-2 , firstNumber , secondNumber);
		

	}

}
