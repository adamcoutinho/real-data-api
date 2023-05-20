package com.main.real.data.service.authpass.v1.endpoint.exception

import com.main.real.data.service.authpass.v1.endpoint.exception.dto.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandlerEndpoint {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun get(methodNotArgumentNotValidException: MethodArgumentNotValidException):ResponseEntity<Any> {
   val errorResponse=     ErrorResponse(
            status = HttpStatus.NOT_FOUND.value(),
            message=methodNotArgumentNotValidException.message
        )
        return ResponseEntity.ok(errorResponse)
    }
}