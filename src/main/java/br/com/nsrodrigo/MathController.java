package br.com.nsrodrigo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new Exception();
		}
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}

	private Double convertToDouble(String strNumber) {
		// Se strNumber for igual a nulo, retorna 0D
		if (strNumber == null)
			return 0D;

		// Substitui a "," em "."
		String number = strNumber.replaceAll(",", ".");

		// Se number for numerico, retorna o resultado como double
		if (isNumeric(number))
			return Double.parseDouble(number);
		return 0D;
	}

	private boolean isNumeric(String strNumber) {
		// Se strNumber for igual a nulo, retorna falso
		if (strNumber == null)
			return false;

		// Substitui a "," em "."
		String number = strNumber.replaceAll(",", ".");

		// Validar se o numero é positivo ou negativo [-+], se é de 0 a 9 [0-9] e se
		// pode ser fracionado "." e [0-9]
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
