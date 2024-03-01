package dev.patika.libraryAppWeek11.mapper;

import dev.patika.libraryAppWeek11.dto.request.AuthorRequest;
import dev.patika.libraryAppWeek11.dto.response.AuthorResponse;
import dev.patika.libraryAppWeek11.entity.Author;
import org.mapstruct.Mapper;

import java.util.List;

// author entity den author response a map leme işlemi yapacağız
// dönüş tipi author response olur

@Mapper
public interface AuthorMapper {
    AuthorResponse entityToResponse(Author author);
    List<AuthorResponse> entityToResponse(List<Author> authorList);
    Author requestToEntity(AuthorRequest authorRequest);

}
