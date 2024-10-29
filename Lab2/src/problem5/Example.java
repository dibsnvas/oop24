package problem5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example {
    private Map<String, String> books = new HashMap<>();

    public void addBook(String bookName) {
        if (books.containsKey(bookName)) {
            System.out.println("Книга уже есть.");
        } else {
            books.put(bookName, null);
            System.out.println("Книга добавлена.");
        }
    }

    public void assignBook(String bookName, String readerName) {
        if (!books.containsKey(bookName)) {
            System.out.println("Книга не найдена.");
        } else if (books.get(bookName) == null) {
            books.put(bookName, readerName);
            System.out.println("Книга выдана " + readerName + ".");
        } else {
            System.out.println("Книга уже взята.");
        }
    }

    public void checkBookStatus(String bookName) {
        if (!books.containsKey(bookName)) {
            System.out.println("Книга не найдена.");
        } else if (books.get(bookName) == null) {
            System.out.println("Книга доступна.");
        } else {
            System.out.println("Книга у " + books.get(bookName) + ".");
        }
    }

    public static void main(String[] args) {
    	Example library = new Example();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Добавить книгу\n2. Выдать книгу\n3. Проверить статус книги\n4. Выйти");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Название книги:");
                String bookName = scanner.nextLine();
                library.addBook(bookName);
            } else if (choice == 2) {
                System.out.println("Название книги:");
                String bookName = scanner.nextLine();
                System.out.println("Имя читателя:");
                String readerName = scanner.nextLine();
                library.assignBook(bookName, readerName);
            } else if (choice == 3) {
                System.out.println("Название книги:");
                String bookName = scanner.nextLine();
                library.checkBookStatus(bookName);
            } else if (choice == 4) {
                System.out.println("Выход.");
                break;
            } else {
                System.out.println("Неверный выбор.");
            }
        }

        scanner.close();
    }
}
