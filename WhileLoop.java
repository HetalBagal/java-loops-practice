import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = scanner.nextInt();

        int i = 1;
        while (i <= n) {
        System.out.print(i + " ");
        i++;
        }
    }
}