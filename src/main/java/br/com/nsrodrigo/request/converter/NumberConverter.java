package br.com.nsrodrigo.request.converter;

import br.com.nsrodrigo.exception.UnsupportedMathOperationException;
import org.springframework.context.annotation.Description;

public class NumberConverter {

    @Description("Método para converter numero em Double")
    public static Double convertToDouble(String strNumber) {
        // Se o strNumber for nulo ou vazio retorna uma excessão
        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("Please set a numeric value");

        // A variavel number recebe o strNumber que sera ajustado para . na separação das casas decimais
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    @Description("Método para validar se o valor passado no parametro é numérico")
    public static boolean isNumeric(String strNumber){
        // Se o strNumber for nulo ou vazio retorna uma excessão
        if (strNumber == null || strNumber.isEmpty()) return false;

        // A variavel number recebe o strNumber que sera ajustado para . na separação das casas decimais
        String number = strNumber.replace(",", ".");

        // Retorna o numero se atender aos critérios: positivo ou negativo, de 0 a 9, separado por '.' e de 0 a 9
        return (number.matches("[-+]?[0-9]*\\.?[0-9]+"));
    }
}
