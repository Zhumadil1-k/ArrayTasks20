import java.util.ArrayList;
import java.util.Scanner;

public class Array19Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> lengths = new ArrayList<>();

        System.out.print("How many fruits? ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter fruit " + (i + 1) + ": ");
            fruits.add(scan.nextLine());
        }

        for (String fruit : fruits) {
            lengths.add(fruit.length());
        }

        System.out.println("\nLengths of fruits:");
        System.out.println(lengths);
    }
}

