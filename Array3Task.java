import java.util.Scanner;
import java.util.ArrayList;
public class Array3Task {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        ArrayList<String> foods =  new ArrayList<>();
        System.out.println("How many foods do you want to write?");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter the"+(i+1)+" food");
            foods.add(scan.nextLine());
        }
        int count =0;
        for(String food :foods) {
            if (food.equals("Pizza")) {
                count++;
            }
        }
        System.out.println("Pizza appears"+count+" times");
        scan.close();
    }
}
