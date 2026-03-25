import java.util.*;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
        System.out.print(i+" ");
        }
    }
}