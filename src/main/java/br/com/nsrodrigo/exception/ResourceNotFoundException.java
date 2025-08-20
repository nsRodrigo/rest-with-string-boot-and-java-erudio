package br.com.nsrodrigo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
      // Gera o status code para a excessão UnsupportedMathOperationException
        super(message);
    }
}
