package dev.patika.libraryAppWeek11.service;

import dev.patika.libraryAppWeek11.dto.request.AuthorRequest;
import dev.patika.libraryAppWeek11.dto.response.AuthorResponse;
import dev.patika.libraryAppWeek11.entity.Author;
import dev.patika.libraryAppWeek11.exception.AuthorAlreadyExistsException;
import dev.patika.libraryAppWeek11.mapper.AuthorMapper;
import dev.patika.libraryAppWeek11.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
// service repository ile haberleşecek o zaman burata repo inject edilir

@Service
@RequiredArgsConstructor // constructor injection
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;
    public List<AuthorResponse> findAll() { // db den author olarak gelen veriyi AuthorResponse a dönüştürmeliyiz
    // bunun için author entity sinden Authorresponse a maple yapılır
        return authorMapper.entityToResponse(authorRepository.findAll());
    }
    public AuthorResponse create(AuthorRequest authorRequest) {
        // yazarı Db de sorgula
        // Optinal db den veri çekme işleminde tercih edilir
        Optional<Author> authorFromDb = authorRepository.findByNameAndBirthDateAndCountry(authorRequest.getName(), authorRequest.getBirthDate(), authorRequest.getCountry());
        if(authorFromDb.isPresent()) {
          throw new AuthorAlreadyExistsException(authorFromDb.get().getId());
        }
        Author author = authorMapper.requestToEntity(authorRequest);
        return authorMapper.entityToResponse(authorRepository.save(author));

    }


}
