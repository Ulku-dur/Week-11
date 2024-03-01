package dev.patika.libraryAppWeek11.repository;

import dev.patika.libraryAppWeek11.entity.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookBorrowingRepository extends JpaRepository <BookBorrowing, Long> {
}
