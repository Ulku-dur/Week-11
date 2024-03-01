package dev.patika.libraryAppWeek11.service;

import dev.patika.libraryAppWeek11.core.BaseEntity;
import dev.patika.libraryAppWeek11.dto.request.AuthorRequest;
import dev.patika.libraryAppWeek11.dto.response.AuthorResponse;

import java.util.List;

public interface BaseService <E extends BaseEntity, REQUEST, RESPONSE>{
    // List<AuthorResponse> findAll()
    List<RESPONSE> findAll();
   // AuthorResponse create(AuthorRequest authorRequest)
    RESPONSE create(REQUEST request);
}
