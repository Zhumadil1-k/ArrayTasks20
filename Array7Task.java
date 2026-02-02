import java.util.ArrayList;
import java.util.Scanner;
public class Array7Task {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> Flowers = new ArrayList<>();
        System.out.println("How many flowers do you want to enter?");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i =0;i<n;i++){
            System.out.print("Enter flower "+(i+1));
            Flowers.add(scan.nextLine());
        }
        int firstIndex = Flowers.indexOf("Rose");
        int lastIndex = Flowers.lastIndexOf("Rose");
        if(firstIndex ==-1){
            System.out.println("The flower Rose is not found ");
        }else{
            System.out.println("First index of Rose "+ firstIndex);
            System.out.println("The last index Rose"+lastIndex);
        }
        scan.close();
    }
}
