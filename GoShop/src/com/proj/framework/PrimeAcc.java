package com.proj.framework;

import com.proj.framework.ShopAcc;

public abstract class PrimeAcc extends ShopAcc {

	private boolean isPrime = true;
	private static final float deliveryCharges = 0.0f;

//	constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}

//	getter of isPrime
	public boolean getisPrime() {
		return this.isPrime;
	}

//	getter of delivery charges
	public float getDeliverycharges() {
		return deliveryCharges;
	}


	public void bookProduct(float book) {

	}

	@Override
	public String toString() {
		return super.toString() + " PrimeAcc{" + "isPrime=" + isPrime + '}';
	}

}


