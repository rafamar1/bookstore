package data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "book", schema = "bookstore")
public class BookEntity {
    private String isbn;
    private String bookName;

    @Id
    @Column(name = "ISBN")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "BOOK_NAME")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity that = (BookEntity) o;
        return Objects.equals(isbn, that.isbn) &&
                Objects.equals(bookName, that.bookName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(isbn, bookName);
    }
}
