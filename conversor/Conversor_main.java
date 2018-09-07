package com.maomorantes.conversor;

import javax.swing.*;

public class Conversor_main {

	public static void main(String[] args) {
		
		
		while(true) {
			String headerFrom = "Please select the type of number:\n";
			String body = "1. Decimal\n 2. Binary\n 3. Octal\n 4. Hexadecimal";
			String optionFrom = JOptionPane.showInputDialog(headerFrom+body);
			
			String stringInputNumber=JOptionPane.showInputDialog("Insert Number: ");
			
			String headerTo = "Please select a conversion system:\n";
			String optionTo = JOptionPane.showInputDialog(headerTo+body);
			
			NumericSystem numericParser = new Decimal();
			String result="0";
			switch(optionTo) {
				case "1":
					numericParser = new Decimal();
					break;
				case "2":
					numericParser = new Binary();
					break;
				case "3":
					numericParser = new Octal();
					break;
				case "4":
					numericParser = new Hexadecimal();
					break;
			}
			
			try {
				
				if(optionFrom.equals("1")) {
					result = numericParser.fromDecimalParseTo(stringInputNumber);
				} else if(optionFrom.equals("2")) {
					result = numericParser.fromBinaryParseTo(stringInputNumber);
				} else if(optionFrom.equals("3")) {
					result = numericParser.fromOctalParseTo(stringInputNumber);
				} else if(optionFrom.equals("4")) {
					result = numericParser.fromHexaParseTo(stringInputNumber);
				}
			} catch(NumberFormatException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "ERROR DE FORMATO --> " + e.getLocalizedMessage());
			}
			
				
			String finalResult = numericParser.printNumber(result);		
			JOptionPane.showMessageDialog(null, finalResult);
		}
		
	}

}
