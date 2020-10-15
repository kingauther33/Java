package com.company.Ex2;

public class TestBook {
    public static void main(String[] args) {
        Author[] a1 = new Author[] {
                new Author("CodeAn", "kingauther33@gmail.com", 'M'),
                new Author("CodeToan", "kingToan33@gmail.com", 'M'),
        };
        System.out.println(a1);

        Book dummyBook = new Book("Java for Dummy", a1, 19.95, 99);
        System.out.println(dummyBook);

        //Test
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("Name is: " + dummyBook.getName());
        System.out.println("Price is: " + dummyBook.getPrice());
        System.out.println("Qty is: " + dummyBook.getQty());
        for (int i = 0; i <= 1; i++) {
            System.out.println("Author's name is: " + dummyBook.getAuthor(i));
            System.out.println("Author's name is: " + dummyBook.getAuthor(i).getName());
            System.out.println("Author's name is: " + dummyBook.getAuthor(i).getEmail());
        }

        //Use an anonymous instances of Author to construct a Book instance
        Book anotherBook = new Book("More Java", new Author[] {
            new Author("Toan", "kingToan33@gmail.com", 'M'),
            new Author("Tung", "kingTung33@gmail.com", 'M')
        }, 29.95);
        System.out.println(anotherBook);
    }
}
