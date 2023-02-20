package org.ssglobal.training.codes.itemC;

public class TestGeneralMethod {

	public static void main(String[] args) {
		GeneralMethods gm = new GeneralMethods();
		gm.powersOfTwo();
		gm.alarm(5);
		System.out.println(gm.sum100());
		System.out.println(gm.sumRange(1, 10));
		System.out.println(gm.maxOfTwo(5, 10));
		System.out.println(gm.larger(10, 5));
		System.out.println(gm.evenlyDivisible(3, 3));
	}

}
