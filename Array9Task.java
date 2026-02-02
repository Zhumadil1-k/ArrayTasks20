import java.util.Scanner;
import java.util.ArrayList;
public class Array9Task {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        ArrayList<String> cities = new ArrayList<>();
        System.out.println("How many cities do you want to enter?");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" city");
            cities.add(scan.nextLine());
        }
        String[] citiesArray = cities.toArray(new String[0]);
        System.out.println("CitiesArray:");
        for(String city:citiesArray){
            System.out.println(city);
        }

    }
}
