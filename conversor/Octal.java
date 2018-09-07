package com.maomorantes.conversor;

public class Octal implements NumericSystem {


	@Override
	public String printNumber(String number) {
		return "El numero octal es: " + number;
		
	}

	@Override
	public String fromDecimalParseTo(String decimalNumber) {
		return Integer.toOctalString(Integer.parseInt(decimalNumber));
	}

	@Override
	public String fromBinaryParseTo(String binaryNumber) {
		String decimalNumber = String.valueOf(Integer.parseInt(binaryNumber, 2));
		return fromDecimalParseTo(decimalNumber);

	}

	@Override
	public String fromOctalParseTo(String octalNumber) {
		return octalNumber;
	}

	@Override
	public String fromHexaParseTo(String hexaNumber) {
		String decimalNumber = String.valueOf(Integer.parseInt(hexaNumber, 16));
		return fromDecimalParseTo(decimalNumber);
	}

}
