package com.rent.factory;

import org.springframework.util.StringUtils;

import com.rent.entity.RentConstant;
import com.rent.server.BackRent;
import com.rent.server.DomeTradeDirectRent;
import com.rent.server.EntrustLoan;
import com.rent.server.ForeTradeDirectRent;
import com.rent.server.Rent;
import com.rent.server.SecuritFund;
import com.rent.server.State;
import com.rent.server.StateCreate;

public class StateFactory {
	
	public static State ctrateState(String proState) {
		
		if(StringUtils.isEmpty(proState)){
			return null;
		}
		
		State state = null;
		switch (proState) {
		case RentConstant.PRO_STATE_0:
			state = new StateCreate();
			break;
		/*case "PROD_TYPE_2":
			rent = new ForeTradeDirectRent();
			break;
		case "PROD_TYPE_3":
			rent = new BackRent();
			break;
		case "PROD_TYPE_4":
			rent = new EntrustLoan();
			break;
		case "PROD_TYPE_5":
			rent = new SecuritFund();
			break;*/
		default:
			break;
		}
		return state;
	}

}
