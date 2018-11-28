package data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ChapterEntityPK implements Serializable {
    private String bookIsbn;
    private int chapterNum;

    @Column(name = "BOOK_ISBN")
    @Id
    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    @Column(name = "CHAPTER_NUM")
    @Id
    public int getChapterNum() {
        return chapterNum;
    }

    public void setChapterNum(int chapterNum) {
        this.chapterNum = chapterNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChapterEntityPK that = (ChapterEntityPK) o;
        return chapterNum == that.chapterNum &&
                Objects.equals(bookIsbn, that.bookIsbn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookIsbn, chapterNum);
    }
}
