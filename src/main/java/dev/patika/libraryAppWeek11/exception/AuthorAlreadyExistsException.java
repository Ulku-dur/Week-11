package dev.patika.libraryAppWeek11.exception;

public class AuthorAlreadyExistsException extends RuntimeException{
    public AuthorAlreadyExistsException(Long id) {
        super(id + "li yazar zaten kayıtlı");
    }
}
