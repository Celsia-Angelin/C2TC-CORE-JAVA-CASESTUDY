package com.proj.framework;

import com.proj.framework.ShopAcc;

//3 	Defining the abstract subclass NormalAcc of super abstract class ShopAcc
public abstract class NormalAcc extends ShopAcc {

	// final private class variable
	private final static float deliveryCharges = 99.0f;

	// Constructor
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
	}

	// to access private variable we need getter and setter
	public static float getDeliveryCharges() {
		return deliveryCharges;
	}

	public void bookProduct(float book) {

	}

	public String toString() {
		return super.toString() + " NormalAcc{" + "deliveryCharges=" + deliveryCharges + '}';
	}
}


