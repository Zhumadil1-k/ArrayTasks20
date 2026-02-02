import java.util.Scanner;
import java.util.ArrayList;
public class Array5Task {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> Colors = new ArrayList<>();
        System.out.println("How many colors do you want to write?");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" color");
            Colors.add(scan.nextLine());
        }
        for(int i =0;i<Colors.size();i++){
            Colors.set(i,"Black");
        }
        System.out.println("Result"+ Colors);
        scan.close();
    }
}
