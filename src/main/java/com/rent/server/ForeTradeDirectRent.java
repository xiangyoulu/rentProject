package com.rent.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.rent.entity.JsonResult;

/**
 * 外贸直租
 * @author admin
 *
 */
public class ForeTradeDirectRent implements Rent{

	Logger logger = LoggerFactory.getLogger(ForeTradeDirectRent.class);

	@Override
	public JsonResult doService(JSONObject obj) {
		logger.info("===ForeTradeDirectRent doService obj={}", obj);
		
		// 业务处理 TODO
		
		return new JsonResult("外贸直租", obj, 800);
	}

	

}
