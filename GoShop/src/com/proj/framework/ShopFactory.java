package com.proj.framework;

import com.proj.framework.NormalAcc;
import com.proj.framework.PrimeAcc;

public abstract class ShopFactory {

	public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);

	public abstract NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);
}


