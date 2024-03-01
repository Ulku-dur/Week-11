package dev.patika.libraryAppWeek11.repository;

import dev.patika.libraryAppWeek11.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {
}
