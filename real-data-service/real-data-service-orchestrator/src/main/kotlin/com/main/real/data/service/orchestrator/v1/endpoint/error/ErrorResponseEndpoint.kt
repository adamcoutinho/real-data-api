package com.main.real.data.service.orchestrator.v1.endpoint.error

import com.main.real.data.service.orchestrator.v1.endpoint.error.dto.ErrorResponse
import com.main.real.data.service.orchestrator.v1.endpoint.error.exception.BusinessException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ErrorResponseEndpoint {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun methodArgumentNotValidation(methodArgumentNotValidException: MethodArgumentNotValidException):ResponseEntity<Any> {

        val errorResponse =  methodArgumentNotValidException.fieldErrors.map {
              ErrorResponse(
                  message = it.defaultMessage
              )
          }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(errorResponse)
    }

    @ExceptionHandler(BusinessException::class)
    fun methodArgumentNotValidation(businessException: BusinessException):ResponseEntity<Any> {

        val errorResponse =
            ErrorResponse(
                message = businessException.message
            )


        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(errorResponse)
    }


}