package data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "publisher", schema = "bookstore")
public class PublisherEntity {
    private String code;
    private String publisherName;

    @Id
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "PUBLISHER_NAME")
    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublisherEntity that = (PublisherEntity) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(publisherName, that.publisherName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(code, publisherName);
    }
}
