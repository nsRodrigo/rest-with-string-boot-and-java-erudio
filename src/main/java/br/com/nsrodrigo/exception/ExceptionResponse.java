package br.com.nsrodrigo.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {
    // Usado para formatar o retorno da excessão em Json de forma mais amigavel
}
