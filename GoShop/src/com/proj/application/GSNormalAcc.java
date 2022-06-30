package com.proj.application;

import com.proj.framework.NormalAcc;

	public class GSNormalAcc extends NormalAcc {

//		constructor
		public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
			super(accNo, accNm, charges, deliveryCharges);
		}

		@Override
		public void bookProduct(float charges) {
//			System.out.println("UserName: " + ShopAcc.getAccNm() + "\n" + "Charges: " + charges + "\n"
//					+ "Delivery charges: " + getCharges());
			System.out.println("Normal user, Your Charges will be: " + getCharges() + "   with Delivery charge of: "
					+ getDeliveryCharges());
		}

		@Override
		public String toString() {
			return super.toString();
		}

	}


