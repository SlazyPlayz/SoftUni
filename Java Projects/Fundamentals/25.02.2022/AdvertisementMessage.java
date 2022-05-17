package Exercise;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());
        Random rand = new Random();
        Messages message = new Messages();

        for (int i = 0; i < n; i++) {
            int a = rand.nextInt(6);
            int b = rand.nextInt(6);
            int c = rand.nextInt(8);
            int d = rand.nextInt(5);
            message.ReturnMessage(a, b, c ,d);
        }
    }
}

class Messages {
    private String[] phrases =
            {"Excellent product.",
            "Such a great product.", "I always use that product.",
            "Best product of its category.", "Exceptional product.",
            "I can’t live without this product."};
    private String[] events =
            {"Now I feel good.", "I have succeeded with this product.",
                    "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                    "Try it yourself, I am very satisfied.", "I feel great!"};
    private String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
    private String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    public void ReturnMessage (int a, int b, int c, int d) {
        String phrase = phrases[a];
        String event = events[b];
        String author = authors[c];
        String city = cities[d];
        System.out.println(phrase + " " + event + " " + author + " - " + city);
    }
}
