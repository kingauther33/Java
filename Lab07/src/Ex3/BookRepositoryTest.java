package Ex3;

import java.util.Scanner;

public class BookRepositoryTest {
    private Book[] books;
    private byte bookCount;

    public String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    public String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }

    public BookRepositoryTest() {
        books = new Book[4];
        for (int i = 0; i < 4; i++) {
            books[i] = new Book();
        }
        bookCount = 0;
    }

    public static void main(String[] args) {
        //Co the dung argument co san cua de khoi tao book ma ko thong qua BookRepositoryTest() (Run -> Edit Configurations)
        //byte numberOfBooks = Byte.parseByte(args[0]);
        // BookRepi... objBook...
        // objBook.books = new Book[numberOfBooks]; (neu de books ko private);
        int choice;
        Scanner sc = new Scanner(System.in);
        BookRepositoryTest objBook = new BookRepositoryTest();

        do {
            objBook.displayHeader();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    objBook.addBook();
                    break;
                case 2:
                    objBook.searchByBookName();
                    break;
                case 3:
                    objBook.displayBook();
                    break;
                case 4:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        } while (choice != 4);
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        if (bookCount < books.length) {
            System.out.println("Enter book name:");
            books[bookCount].setName(sc.nextLine());

            System.out.println("Enter author name: ");
            books[bookCount].setAuthorName(sc.nextLine());

            System.out.println("Enter book price: ");
            books[bookCount].setPrice(Float.parseFloat(sc.nextLine()));

            System.out.println("Enter ISBN of the book: ");
            books[bookCount].setIsbn(Integer.parseInt(sc.nextLine()));

            System.out.println("Enter year of publication: ");
            books[bookCount].setYearPublished(Short.parseShort(sc.nextLine()));

            bookCount++;
        } else System.out.println("Cannot add more books to the library!!!");
    }

    public void displayHeader() {
        System.out.println("Welcome to E-Repository.");
        System.out.println("Select the operation you want to perfom:");
        System.out.println("************************************************");
        System.out.println("1. Add book to the repository");
        System.out.println("2. Search book by book name");
        System.out.println("3. Display Books");
        System.out.println("4. Exit");
        System.out.println("************************************************");
    }

    public void searchByBookName() {
        Scanner sc = new Scanner(System.in);
        boolean bookFound = false;
        if (bookCount > 0) {
            System.out.println("Enter the book name you want to search for:");
            String searchByName = sc.nextLine();
            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++) {
                if (books[rowIndex].getName().equals(searchByName)) {
                    System.out.println(padRight("ISBN", 20) + padRight("Book Name",20)
                            + padRight("Author Name",20)
                            + padRight("Price($)",20) + "Year of Publication");
                    System.out.println("-------------------------------------------------" +
                            "---------------------------------------------------------------");
                    System.out.println(padRight(Integer.toString(books[rowIndex].getIsbn()),20) +
                            padRight(books[rowIndex].getName(),20) +
                            padRight(books[rowIndex].getAuthorName(),20) +
                            padRight(Float.toString(books[rowIndex].getPrice()),20) +
                            books[rowIndex].getYearPublished());
                    bookFound = true;
                    break;
                }
            }
            if (!bookFound) System.out.println("There is no books to be found!!!");
        } else System.out.println("There is no books in the library to search for ;( Please add more books!!!");
    }

    public void displayBook() {
        if (bookCount > 0) {
            System.out.println(padRight("ISBN", 20) + padRight("Book Name",20)
                    + padRight("Author Name",20)
                    + padRight("Price($)",20) + "Year of Publication");
            System.out.println("-------------------------------------------------" +
                    "---------------------------------------------------------------");
            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++) {
                System.out.println(padRight(Integer.toString(books[rowIndex].getIsbn()),20) +
                        padRight(books[rowIndex].getName(),20) +
                        padRight(books[rowIndex].getAuthorName(),20) +
                        padRight(Float.toString(books[rowIndex].getPrice()),20) +
                        books[rowIndex].getYearPublished());
            }
        } else System.out.println("There is no books in the library to display ;( Please add more books!!!");
    }
}
