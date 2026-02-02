import java.util.Scanner;
import java.util.ArrayList;
public class Array4Task {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("How many fruits do want to write?");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0;i<n;i++){
            System.out.println("Enter the "+(i +1)+" fruit");
            fruits.add(scan.nextLine());
        }
        fruits.removeIf(fruit->fruit.equalsIgnoreCase("Banana"));
        System.out.println("Fruits after removing Banana:");
        System.out.println(fruits);
        scan.close();
    }
}
