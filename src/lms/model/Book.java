package lms.model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private Boolean isBorrowed;

    public Book(String title, String author, String isbn){
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        isBorrowed=false;
    }
    public void setTitle(String title){
        if(title==null ||title.isBlank()){
            throw new IllegalArgumentException("Title can not be Blank.");
        }
        this.title=title;
    }

    public void setAuthor(String author) {
        if(author ==null || author.isBlank()){
            throw new IllegalArgumentException("Author can not be Blank.");
        }
        this.author = author;
    }

    public void setIsbn(String isbn) {
        if(isbn==null ||isbn.isBlank()){
            throw new  IllegalArgumentException("ISBN can not be Blank.");
        }
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Boolean getBorrowed() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        return "Book{title='" + title
                + "', author='" + author
                + "', isbn='" + isbn
                + "', borrowed=" + isBorrowed + "}";
    }
}
