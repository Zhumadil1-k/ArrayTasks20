import java.util.ArrayList;
import java.util.Scanner;

public class Array13Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> songs = new ArrayList<>();

        System.out.print("How many songs? ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter song " + (i + 1) + ": ");
            songs.add(scan.nextLine());
        }
        String shortest = songs.get(0);
        for (String song : songs) {
            if (song.length() < shortest.length()) {
                shortest = song;
            }
        }

        System.out.println("\nShortest song title: " + shortest);
        System.out.println("Length: " + shortest.length());
    }
}

