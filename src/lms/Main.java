
package lms;

import lms.model.Book;
import lms.model.Member;
import lms.service.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        Book b2 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");

        Book b3 = new Book("The Pragmatic Programmer", "Hunt & Thomas", "978-0135957059");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        Member m1 = new Member("M001", "Nadeesha Perera");

        Member m2 = new Member("M002", "Kasun Silva");

        library.addMember(m1);
        library.addMember(m2);

        library.listBooks();
        library.listMembers();

        try {

            library.addBook(new Book("", "Nobody", "000-0000000000"));

        } catch (IllegalArgumentException e) {

            System.err.println("Rejected invalid book: " + e.getMessage()
            );
        }
    }
}
