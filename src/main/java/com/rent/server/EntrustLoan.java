package com.rent.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.rent.entity.JsonResult;

/**
 * 委贷
 * @author admin
 *
 */
public class EntrustLoan implements Rent{
	
	Logger logger = LoggerFactory.getLogger(EntrustLoan.class);

	@Override
	public JsonResult doService(JSONObject obj) {
		logger.info("===EntrustLoan doService obj={}", obj);
		
		// 业务处理 TODO
		
		return new JsonResult("委贷", obj, 800);
	}

}
