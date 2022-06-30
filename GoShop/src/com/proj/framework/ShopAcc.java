package com.proj.framework;

//1	abstract class
public abstract class ShopAcc {

	private int accNo;
	private String accNm;
	private float charges;

//	Abstract class constructor.
	public ShopAcc(int accNo, String accNm, float charges) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;

	}

//	getter of accNo
	public int getAccNo() {
		return accNo;
	}

//	getter of accNm
	public String getAccNm() {
		return accNm;
	}

//	setter of accNm
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

//	getter of charges
	public float getCharges() {
		return charges;
	}

//	 methods
	public void bookProduct(float book) {
	};

	public void items(float item) {
	};

	public String toString() {
		return "ShopAcc{" + "accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + '}';
	};
	

	
	
}


