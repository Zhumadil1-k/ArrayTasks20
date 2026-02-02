import java.util.ArrayList;
import java.util.Scanner;

public class Array18Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();

        System.out.print("How many movie titles? ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter movie title " + (i + 1) + ": ");
            movies.add(scan.nextLine());
        }

        String longest = "";
        String secondLongest = "";

        for (String movie : movies) {
            if (movie.length() > longest.length()) {
                secondLongest = longest;
                longest = movie;
            } else if (movie.length() > secondLongest.length()
                    && movie.length() < longest.length()) {
                secondLongest = movie;
            }
        }

        System.out.println("\nSecond longest movie title:");
        System.out.println(secondLongest);
        System.out.println("Length: " + secondLongest.length());
    }
}

