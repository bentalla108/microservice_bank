package com.bentalla.accounts.dto;

import org.springframework.http.HttpStatus;

import java.time.Instant;

public class ErrorResponseDto {
    private String apiPath;
    private String errorMessage;
    private HttpStatus  errorCode;
    private Instant errorTime;
}
