package com.rent.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.rent.entity.JsonResult;

/**
 * 回租
 * @author admin
 *
 */
public class BackRent implements Rent{
	
	Logger logger = LoggerFactory.getLogger(BackRent.class);

	@Override
	public JsonResult doService(JSONObject obj) {
		logger.info("===BackRent doService obj={}", obj);
		
		// 业务处理 TODO
		
		return new JsonResult("回租", obj, 800);
	}

}
