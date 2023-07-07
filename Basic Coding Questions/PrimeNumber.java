import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    boolean isPrime = false;

    for(int i=2;i<number/2;i++){
        if(number%i==0){
            isPrime=true;
        }
    }
    if(isPrime==true){
        System.out.println("Not prime");
    } else{
        System.out.println("Prime");
    }


}
    
}
