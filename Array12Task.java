import java.util.Scanner;
import java.util.ArrayList;
public class Array12Task {
    public static void main(String[]args){
        Scanner scan =new Scanner (System.in);
        ArrayList<String>names = new ArrayList<>();
        System.out.print("How many names? ");
        int n = scan.nextInt();
        scan.nextLine(); // очистка буфера

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(scan.nextLine());
        }
        names.removeIf(name -> name.length() % 2 == 0);

        System.out.println("Names with odd length only:");
        System.out.println(names);
    }
}
