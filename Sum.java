import java.util.Scanner;
import java.util.StringTokenizer;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two space-separated integers to add.");
        StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
        System.out.println(Integer.parseInt(tokenizer.nextToken()) + Integer.parseInt(tokenizer.nextToken()));
    }
}
