package Session7.bookdetails;

import java.util.Scanner;

public class Book {
    private int books[][];
    private byte bookCount;

    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }

    public Book() {
        books = new int[3][3] ;
        bookCount = 0;
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        if (bookCount < books.length) {
            System.out.print("Enter Book ISBN number: ");
            books[bookCount][0] = Integer.parseInt(sc.nextLine());

            System.out.print("Enter numbers of pages of the book: ");
            books[bookCount][1] = Integer.parseInt(sc.nextLine());

            System.out.print("Enter year of publishing: ");
            books[bookCount][2] = Integer.parseInt(sc.nextLine());

            bookCount++;
        } else System.out.println("Sorry! You cannot add more books to the library.");
    }

    public void displayBooks() {
        if (bookCount > 0) {
            System.out.println(padRight("ISBN", 20) + padRight("Pages", 20) + "Publication Year");

            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++) {
                System.out.println(padRight(Integer.toString(books[rowIndex][0]), 20) +
                        padRight(Integer.toString(books[rowIndex][1]), 20) +
                        padRight(Integer.toString(books[rowIndex][2]), 20));
            }
        } else {
            System.out.println("There is no books to display :( Please add more books!!");
        }
    }

    public void searchBooks() {
        Scanner sc = new Scanner(System.in);
        boolean booksFound = false;
        if (bookCount > 0) {
            System.out.print("Enter the numbers of ISBN you want to search for: ");
            int searchISBN = Integer.parseInt(sc.nextLine());
            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++) {
                if (books[rowIndex][0] == searchISBN) {
                    System.out.println(padRight(Integer.toString(books[rowIndex][0]), 20) +
                            padRight(Integer.toString(books[rowIndex][1]), 20) +
                            padRight(Integer.toString(books[rowIndex][2]), 20));
                    booksFound = true;
                    break; // do ISBN la doc nhat, tim dc 1 cuon la break for loop luon.
                }
            }
            if (!booksFound) {
                System.out.println("The book is not found!"); // Can in ra khi khong tim dc sach de user biet
            }
        } else {
            System.out.println("The is no book in the library!"); // Can in ra khi user chua input
        }
    }

    public void searchByYear() {
        Scanner sc = new Scanner(System.in);
        boolean booksFound = false;
        if (bookCount > 0) {
            System.out.print("Enter the number of years you want to search: ");
            int searchByYear = Integer.parseInt(sc.nextLine());
            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++) {
                if (books[rowIndex][2] == searchByYear) {
                    System.out.println(padRight(Integer.toString(books[rowIndex][0]), 20) +
                            padRight(Integer.toString(books[rowIndex][1]), 20) +
                            padRight(Integer.toString(books[rowIndex][2]), 20));
                    booksFound = true;
                }
            }

            if (!booksFound) System.out.println("There is no books can be found!");
        } else System.out.println("The is no book in the library!");

    }
}
