package org.tcs.test;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		//Scanner sck = new Scanner(System.in);

		Scanner sc = new Scanner(System.in);
		System.out.println("My name is balaji writing logic for login");

		//ctrl+2 and then release and press L
		System.out.println("Enter a byte value as input");
		byte nextByte = sc.nextByte();
		System.out.println("Output byte value is" +nextByte);
		
		byte nextBytee = sc.nextByte();
		System.out.println("Output byte value is" +nextBytee);

		System.out.println("Enter short value as input");
		short nextShort = sc.nextShort();
		System.out.println("Output short value is"+nextShort);
		
		System.out.println("Enter integer value as input");
		int nextInt = sc.nextInt();
		System.out.println("Output integer value is"+nextInt);
		
		System.out.println("Enter long value as input");
		long nextLong = sc.nextLong();
		System.out.println("Output long value is"+nextLong);
		
		System.out.println("Enter floar value as input");
		float nextFloat = sc.nextFloat();
		System.out.println("Output float value is"+nextFloat);
		
		System.out.println("Enter double value as input");

		double nextDouble = sc.nextDouble();
		System.out.println("Output value is" +nextDouble);
		
		System.out.println("Enter boolean value as input");
		boolean nextBoolean = sc.nextBoolean();
		System.out.println("Output value is" +nextBoolean);

		System.out.println("Enter string value as input");

		String next = sc.next();
		System.out.println("Output value is" +next);

	}
	

}
