import java.util.Scanner;
import java.util.ArrayList;
public class Array11Task {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        ArrayList<String>list1=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        System.out.println("How many countries do you want to enter in the 1 list?");
        int n =scan.nextInt();
        scan.nextLine();
        for(int i =0;i<n;i++){
            System.out.println("Enter country "+(i+1));
            list1.add(scan.nextLine());

        }
        System.out.println("How many countries do you want to enter in the 2 list?");
        int n2 =scan.nextInt();
        scan.nextLine();
        for(int i =0;i<n2;i++) {
            System.out.println("Enter country " + (i + 1));
            list2.add(scan.nextLine());
        }
        ArrayList<String>common=new ArrayList<>();
        for(String country :list1){
            if (list2.contains(country)&& !common.contains(country)){
                common.add(country);
            }
        }
        System.out.println("Common countries "+common);

        }
}
