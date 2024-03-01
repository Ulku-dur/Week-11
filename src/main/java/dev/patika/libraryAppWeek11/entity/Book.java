package dev.patika.libraryAppWeek11.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.patika.libraryAppWeek11.core.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Book extends BaseEntity {
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "publication_year", nullable = false)
    private int publisherYear;
    @Column(name = "stock", nullable = false)
    private int stock;
    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author;
    @ManyToMany
    @JoinTable(
            name = "book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")

    )
    private List<Category> categories;

    @ManyToOne
    @JoinColumn(name = "publisher_id", referencedColumnName = "id")
    private Publisher publisher;

    @OneToMany(mappedBy = "book")
    @JsonIgnore
    private List<BookBorrowing> bookBorrowingList;

}
