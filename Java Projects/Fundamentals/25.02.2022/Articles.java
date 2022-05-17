package Exercise;

import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        var n = Integer.parseInt(scanner.nextLine());
        Article article = new Article();
        article.Rename(input[0]);
        article.Edit(input[1]);
        article.ChangeAuthor(input[2]);

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            String newContent = "";
            for (int j = 1; j < command.length - 1; j++)
                newContent += command[j] + " ";
            newContent += command[command.length - 1];
            switch (command[0]) {
                case "Edit:":
                    article.Edit(newContent);
                    break;
                case "ChangeAuthor:":
                    article.ChangeAuthor(newContent);
                    break;
                case "Rename:":
                    article.Rename(newContent);
                    break;
            }
        }

        String title = article.Title();
        String content = article.Content();
        String author = article.Author();
        System.out.printf("%s - %s: %s", title, content, author);
    }
}

class Article {
    private String title;
    private String content;
    private String author;

    public void Edit(String value) {
        this.content = value;
    }

    public void ChangeAuthor(String value) {
        this.author = value;
    }

    public void Rename(String value) {
        this.title = value;
    }

    public String Title() {
        return title;
    }

    public String Content() {
        return content;
    }

    public String Author() {
        return author;
    }

    public void Output() {
    }
}
