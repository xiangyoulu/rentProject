package com.rent.factory;

import org.springframework.util.StringUtils;

import com.rent.entity.RentConstant;
import com.rent.server.BackRent;
import com.rent.server.DomeTradeDirectRent;
import com.rent.server.EntrustLoan;
import com.rent.server.ForeTradeDirectRent;
import com.rent.server.Rent;
import com.rent.server.SecuritFund;

public class RentFactory {
	
	public static Rent ctrateRent(String proType) {
		
		if(StringUtils.isEmpty(proType)){
			return null;
		}
		
		Rent rent = null;
		switch (proType) {
		case RentConstant.PROD_TYPE_1:
			rent = new DomeTradeDirectRent();
			break;
		case RentConstant.PROD_TYPE_2:
			rent = new ForeTradeDirectRent();
			break;
		case RentConstant.PROD_TYPE_3:
			rent = new BackRent();
			break;
		case RentConstant.PROD_TYPE_4:
			rent = new EntrustLoan();
			break;
		case RentConstant.PROD_TYPE_5:
			rent = new SecuritFund();
			break;
		default:
			break;
		}
		return rent;
	}

}
