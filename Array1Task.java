import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Array1Task{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> books1 = new ArrayList<>();
        ArrayList<String> books2 = new ArrayList<>();
        System.out.print("How many books do you want to write in a first list?");
        int n1 = scan.nextInt();
        scan.nextLine();
        for(int i =0;i<n1;i++){
            System.out.print("Enter the book"+(i+1)+";");
            books1.add(scan.nextLine());
        }
        System.out.print("How many books do you want to write in a second list?");
        int n2 = scan.nextInt();
        scan.nextLine();
        for(int i =0;i<n2;i++) {
            System.out.print("Enter the book" + (i + 1) + ";");
            books1.add(scan.nextLine());
        }
        Set<String> unigueBooks =new HashSet<>();
        unigueBooks.addAll(books1);
        unigueBooks.addAll(books2);
        ArrayList<String>result = new ArrayList<>(unigueBooks);
        System.out.println("A list of the unigue books");
        System.out.println(result);
        scan.close();
    }
}
