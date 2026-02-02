import java.util.Scanner;
import java.util.ArrayList;
public class Array10Task {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.println("How many numbers do you want to enter?");
        int n = scan.nextInt();
        int[] numbers = new int[n];
        for (int i = 0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" number");
            numbers[i]= scan.nextInt();
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(int num: numbers){
            list.add(num);
        }
        System.out.println("ArrayList ");
        for(int num :list){
            System.out.println(num);
        }
        scan.close();
    }
}
