package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		int num = 2323;
		int sum = 0;
		while (num !=0) { 
			sum = sum + num%10;
			num = num/10;
			
		}
		 System.out.println("Value: " + sum);

	}

}
