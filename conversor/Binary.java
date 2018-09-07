package com.maomorantes.conversor;

public class Binary implements NumericSystem{
	
	public Binary(){
		super();
	}

	@Override
	public String printNumber(String number) {
		return "El numero binario es: " + number;
		
	}

	@Override
	public String fromDecimalParseTo(String decimalNumber) {
		return Integer.toBinaryString(Integer.parseInt(decimalNumber));
	}

	@Override
	public String fromBinaryParseTo(String binaryNumber) {
		return binaryNumber;
	}
	
	@Override
	public String fromOctalParseTo(String Octalnumber) {
		int decimalNumber = Integer.parseInt(Octalnumber,8);
		return fromDecimalParseTo(String.valueOf(decimalNumber));
	}
	
	@Override
	public String fromHexaParseTo(String hexaNumber) {
		int decimalNumber = Integer.parseInt(hexaNumber,16);
		return fromDecimalParseTo(String.valueOf(decimalNumber));
	}
}
