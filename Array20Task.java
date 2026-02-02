import java.util.ArrayList;
import java.util.Scanner;

public class Array20Task
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        System.out.print("How many departments? ");
        int depCount = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < depCount; i++) {
            System.out.print("\nDepartment " + (i + 1) + " name: ");
            String depName = scan.nextLine();

            System.out.print("How many employees in " + depName + "? ");
            int empCount = scan.nextInt();
            scan.nextLine();

            ArrayList<String> employees = new ArrayList<>();

            for (int j = 0; j < empCount; j++) {
                System.out.print("Enter employee " + (j + 1) + ": ");
                employees.add(scan.nextLine());
            }

            departments.add(employees);
        }


        System.out.println("\nDepartments and employees:");
        for (int i = 0; i < departments.size(); i++) {
            System.out.println("Department " + (i + 1) + ": " + departments.get(i));
        }
    }
}

