import java.util.ArrayList;
import java.util.Scanner;

public class Array17Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.print("How many entries? ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name (or type null): ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("null")) {
                students.add(null);
            } else {
                students.add(input);
            }
        }

        // Удаление null значений
        students.removeIf(name -> name == null);

        System.out.println("\nStudents without null values:");
        System.out.println(students);
    }
}
