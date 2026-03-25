import java.util.*;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = scanner.nextInt();

        int i = 1;
        do {
        System.out.print(i +" ");
        i++ ;
        } while(i<=n);
    }
}