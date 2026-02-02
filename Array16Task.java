import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array16Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<>();

        System.out.print("How many days? ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter day " + (i + 1) + ": ");
            days.add(scan.nextLine());
        }
        Collections.rotate(days, 2);

        System.out.println("\nDays after rotation:");
        System.out.println(days);
    }
}

