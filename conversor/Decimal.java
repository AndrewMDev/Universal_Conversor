package com.maomorantes.conversor;

public class Decimal implements NumericSystem{
	
	public Decimal() {
		super();
	}
	
	@Override
	public String printNumber(String number) {
		return "El numero decimal es: " + number;
	}

	@Override
	public String fromDecimalParseTo(String decimalNumber) {
		return decimalNumber;
	}

	@Override
	public String fromBinaryParseTo(String binaryNumber) {
		return String.valueOf(Integer.parseInt(binaryNumber, 2));
	}

	@Override
	public String fromOctalParseTo(String octalNumber) {
		return String.valueOf(Integer.parseInt(octalNumber, 8));
	}

	@Override
	public String fromHexaParseTo(String hexaNumber) {
		return String.valueOf(Integer.parseInt(hexaNumber, 16));

	}

}
