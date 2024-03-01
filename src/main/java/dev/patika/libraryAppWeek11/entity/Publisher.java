package dev.patika.libraryAppWeek11.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.patika.libraryAppWeek11.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Publisher extends BaseEntity {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @OneToMany(mappedBy = "publisher")
    @JsonIgnore
    private List<Book> bookList;
}
