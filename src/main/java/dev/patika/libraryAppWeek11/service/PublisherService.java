package dev.patika.libraryAppWeek11.service;

import dev.patika.libraryAppWeek11.dto.request.PublisherRequest;
import dev.patika.libraryAppWeek11.dto.response.PublisherResponse;
import dev.patika.libraryAppWeek11.entity.Publisher;

import java.util.List;

public class PublisherService implements BaseService<Publisher, PublisherRequest, PublisherResponse>{

    @Override
    public List<PublisherResponse> findAll() {
        return null;
    }

    @Override
    public PublisherResponse create(PublisherRequest publisherRequest) {
        return null;
    }
}
