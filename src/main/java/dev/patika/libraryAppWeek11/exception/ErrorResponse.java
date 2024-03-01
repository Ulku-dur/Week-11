package dev.patika.libraryAppWeek11.exception;

import lombok.Data;

import java.time.LocalDateTime;
@Data

public class ErrorResponse {
    private Integer statuscode;
    private String message;
    private String description;
    private LocalDateTime occurenceDate;
}
