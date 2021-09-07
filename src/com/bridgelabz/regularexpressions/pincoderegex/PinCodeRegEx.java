package com.bridgelabz.regularexpressions.pincoderegex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PinCodeRegEx 
{

	public static boolean pinCodeValidator(String pinCode) 
	{
		Pattern pattern=Pattern.compile("^[0-9]{3}\\s{0,1}[0-9]{3}$");
		Matcher matcher=pattern.matcher(pinCode);
		return matcher.matches();
	}

	public static void main(String[] args) 
	{
		System.out.println("**Welcome to Pincode Evaluator**");
		
		String pinCode="400 088";
		boolean isPinCode=pinCodeValidator(pinCode);
		if(isPinCode)
			System.out.println("Pincode "+pinCode+" is VALID");
		else
			System.out.println("Pincode "+pinCode+" is INVALID");

	}

}
