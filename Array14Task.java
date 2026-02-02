import java.util.ArrayList;
import java.util.Scanner;

public class Array14Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.print("How many words? ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words.add(scan.nextLine());
        }
        for (int i = 0; i < words.size(); i++) {
            String replaced = words.get(i).replaceAll("(?i)[aeiou]", "*");
            words.set(i, replaced);
        }

        System.out.println("\nAfter replacing vowels:");
        System.out.println(words);
    }
}


