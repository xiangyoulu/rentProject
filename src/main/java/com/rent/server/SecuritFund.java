package com.rent.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.rent.entity.JsonResult;

/**
 * 证券类基金
 * @author admin
 *
 */
public class SecuritFund implements Rent{
	
	Logger logger = LoggerFactory.getLogger(SecuritFund.class);

	@Override
	public JsonResult doService(JSONObject obj) {
		logger.info("===SecuritFund doService obj={}", obj);
		
		// 业务处理 TODO
		
		return new JsonResult("证券类基金", obj, 800);
	}

}
