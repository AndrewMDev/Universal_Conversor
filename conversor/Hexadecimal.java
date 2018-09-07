package com.maomorantes.conversor;

public class Hexadecimal implements NumericSystem {

	@Override
	public String printNumber(String number) {
		return "El numero hexadecimal es: " + number;
	}

	@Override
	public String fromDecimalParseTo(String decimalNumber) {
		return Integer.toHexString(Integer.parseInt(decimalNumber));
	}

	@Override
	public String fromBinaryParseTo(String binaryNumber) {
		String decimalNumber = String.valueOf(Integer.parseInt(binaryNumber, 2));
		return fromDecimalParseTo(decimalNumber);
	}

	@Override
	public String fromOctalParseTo(String octalNumber) {
		String decimalNumber = String.valueOf(Integer.parseInt(octalNumber, 8));
		return fromDecimalParseTo(decimalNumber);
	}

	@Override
	public String fromHexaParseTo(String hexaNumber) {
		return hexaNumber;
	}

}
