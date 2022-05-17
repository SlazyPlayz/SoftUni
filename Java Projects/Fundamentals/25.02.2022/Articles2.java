package Exercise;

import java.util.Scanner;

public class Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());
        Article2 article = new Article2();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            article.setTitle(input[0]);
            article.setContent(input[1]);
            article.setAuthor(input[2]);
            System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
            System.out.println();
        }

        String input = scanner.nextLine();
    }
}

class Article2 {
    private String title;
    private String content;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
}
