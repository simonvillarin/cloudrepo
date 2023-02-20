package org.ssglobal.training.codes.itemC;

public class GeneralMethods {
	public void powersOfTwo() {
		short num = 2;
		
		for (byte i = 1; i <= 10; i++) {				
			System.out.print(num + " ");
			num *= 2;
		}
	}
	
	public void alarm(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Alarm!");
		}
	}
	
	public short sum100() {
		short sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}	
		return sum;
	}
	
	public int sumRange(int num1, int num2) {
		int sum = 0;
		
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}	
		return sum;
	}
	
	public int maxOfTwo(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
	
	public boolean larger(double num1, double num2) {
		return num1 > num2 ? true : false;
	}
	
	public boolean evenlyDivisible(int num1, int num2) {
		return num1 % num2 == 0 && num2 % num1 == 0 ? true : false;
	}
}
