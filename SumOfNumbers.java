import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = scanner.nextInt();

         int sum = 0;
        for (int i = 0; i <= n; i++) {
        sum = sum + i;
        }
        System.out.println("The Sum is:" +sum);
    }
}