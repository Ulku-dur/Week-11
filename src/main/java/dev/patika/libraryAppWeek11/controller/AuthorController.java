package dev.patika.libraryAppWeek11.controller;

import dev.patika.libraryAppWeek11.dto.request.AuthorRequest;
import dev.patika.libraryAppWeek11.dto.response.AuthorResponse;
import dev.patika.libraryAppWeek11.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/author")
@RequiredArgsConstructor
public class AuthorController {
 private final AuthorService authorService;

 @GetMapping
 public ResponseEntity<List<AuthorResponse>> findAll() {
     return new ResponseEntity<>(authorService.findAll(), HttpStatus.OK);
 }

 @PostMapping
 public ResponseEntity<AuthorResponse> create(@RequestBody AuthorRequest authorRequest) {
     return new ResponseEntity<>(authorService.create(authorRequest), HttpStatus.CREATED);
 }

}
