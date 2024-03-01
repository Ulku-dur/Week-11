package dev.patika.libraryAppWeek11.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.patika.libraryAppWeek11.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Category extends BaseEntity {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToMany(mappedBy = "categories")
    @JsonIgnore
    private List<Book> bookList;
}
