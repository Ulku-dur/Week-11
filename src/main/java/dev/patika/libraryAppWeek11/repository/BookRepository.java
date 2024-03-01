package dev.patika.libraryAppWeek11.repository;

import dev.patika.libraryAppWeek11.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
