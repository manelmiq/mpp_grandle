package SE3;

import java.util.Objects;

public class Book extends LendingItem {
    private String isbn;
    private String title;
    private String authorFistName;
    private String authorLasName;

    public Book(String isbn, String title, String authorFistName, String authorLasName) {
        this.isbn = isbn;
        this.title = title;
        this.authorFistName = authorFistName;
        this.authorLasName = authorLasName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
