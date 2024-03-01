package dev.patika.libraryAppWeek11.repository;

import dev.patika.libraryAppWeek11.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository <Publisher, Long> {

}
