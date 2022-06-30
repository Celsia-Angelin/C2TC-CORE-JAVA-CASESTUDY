package com.proj.application;

import com.proj.framework.NormalAcc;
import com.proj.framework.PrimeAcc;
import com.proj.framework.ShopFactory;

public class User {

	public static void main(String[] args) {

//	a. Assign instance of GSShopFactory to ShopFactory reference.
		GSShopFactory shopObj = new GSShopFactory();

//	b. Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
		GSPrimeAcc primeAccObj = new GSPrimeAcc(1234, "prime_account_name", 2000f, true);
//		PrimeAcc primeAcc = shopFactory.getPrimeAcc(0, "prime", 0, true);
//		PrimeAcc primeAccObj = new GSPrimeAcc();

//	c. Instantiate GSNormalAcc and refer it through reference NormalAcc.
		GSNormalAcc normalAccObj = new GSNormalAcc(5678, "normal_account_name", 2500f, NormalAcc.getDeliveryCharges());

//	d. Invoke bookProduct() method.
		primeAccObj.bookProduct(3200.0f);
		normalAccObj.bookProduct(3200.0f);

//	e. Invoke toString() method.
//		System.out.println(primeAccObj.toString());
		primeAccObj.toString();
		normalAccObj.toString();
	}
}


