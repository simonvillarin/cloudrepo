package org.ssglobal.training.codes.itemF;

public class Fraction {
	public int numerator;
	public int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void printRational() {
		System.out.println(numerator + "/" + denominator);
	}

	public Fraction add(Fraction summand) {
		int	numerator1 = numerator * summand.getDenominator() + denominator * summand.getNumerator();
		int denominator1 = denominator * summand.getDenominator();
		return new Fraction(numerator1, denominator1);
	}

	public Fraction multiply(Fraction factor) {
		int numerator1 = numerator * factor.getNumerator();
		int denominator1 = denominator * factor.getDenominator();
		return new Fraction(numerator1, denominator1);
	}

	public boolean greaterEqual(Fraction comp) {
		double value1 = numerator / denominator;
		double value2 = comp.getNumerator() / comp.getDenominator();
		return value1 >= value2 ? true : false;
	}
}
