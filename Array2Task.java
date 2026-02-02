import java.util.ArrayList;
import java.util.Scanner;
public class Array2Task {
    public static void main (String []args){
        Scanner scan = new Scanner (System.in);
        ArrayList<String> movies = new ArrayList<>();
        System.out.println("How many movies do you want to write");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0;i < n;i++){
            System.out.print("Enter the" + (i + 1) + "movie");
            String movie = scan.nextLine();
            movies.add(movie);
        }
        String longestTitle = movies.get(0);
        for(String movie : movies){
            if(movie.length()>longestTitle.length()){
                longestTitle=movie;
            }
        }
        System.out.print("Longest title"+longestTitle);
        scan.close();
    }
}
