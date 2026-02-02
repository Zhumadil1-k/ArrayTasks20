import java.util.Scanner;
import java.util.ArrayList;
public class Array6Task {
    public static void main(String[]args){
        ArrayList<String> Listone=new ArrayList<>();
        ArrayList<String> Listtwo=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many tittles do you want to enter in the first list?");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" tittle");
            Listone.add(scan.nextLine());
        }
        System.out.println("How many tittles do you want to enter in the sublist?");
        int n2 = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n2;i++){
            System.out.println("Enter the "+(i+1)+" tittle");
            Listtwo.add(scan.nextLine());}
        if(Listone.containsAll(Listtwo)){
            System.out.println("First List contains all sublist");}
            else{System.out.println("First List does not contain all sublist");}
            scan.close();

    }
}
