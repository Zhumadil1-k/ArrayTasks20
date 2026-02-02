import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Array8Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> animals = new ArrayList<>();

        System.out.print("How many animals do you want to enter? ");
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter animal " + (i + 1) + ": ");
            animals.add(scan.nextLine());
        }
        Set<String> uniqueAnimals = new HashSet<>(animals);
        animals = new ArrayList<>(uniqueAnimals);
        System.out.println("Animals list without duplicates:");
        System.out.println(animals);

        scan.close();
    }
}

