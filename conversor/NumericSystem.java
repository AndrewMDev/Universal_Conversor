package com.maomorantes.conversor;

public interface NumericSystem {
	
	public String fromDecimalParseTo(String decimalNumber);
	
	public String fromBinaryParseTo(String binaryNumber);
	
	public String fromOctalParseTo(String octalNumber);
	
	public String fromHexaParseTo(String hexaNumber);
	
	public String printNumber(String number);

}
