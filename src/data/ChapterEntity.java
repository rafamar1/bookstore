package data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "chapter", schema = "bookstore")
@IdClass(ChapterEntityPK.class)
public class ChapterEntity {
    private String bookIsbn;
    private int chapterNum;
    private String title;

    @Id
    @Column(name = "BOOK_ISBN")
    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    @Id
    @Column(name = "CHAPTER_NUM")
    public int getChapterNum() {
        return chapterNum;
    }

    public void setChapterNum(int chapterNum) {
        this.chapterNum = chapterNum;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChapterEntity that = (ChapterEntity) o;
        return chapterNum == that.chapterNum &&
                Objects.equals(bookIsbn, that.bookIsbn) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookIsbn, chapterNum, title);
    }
}
