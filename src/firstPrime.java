import java.util.Scanner;

public class firstPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numberPrime's amount : ");
        int numberOfAmount = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (count<numberOfAmount){
            if (isPrimeNumber(i)){
                System.out.println(i + " ");
                count ++;
            }
            i++;
        }

    }

    private static boolean isPrimeNumber(int n) {
        if (n < 2) return false;
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i ++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
