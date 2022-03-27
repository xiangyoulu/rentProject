package com.rent.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.rent.entity.JsonResult;

/**
 * 新建
 * @author admin
 *
 */
public class StateCreate implements State{
	
	Logger logger = LoggerFactory.getLogger(StateCreate.class);

	@Override
	public JsonResult doExecute(JSONObject obj) {
		logger.info("===StateCreate doExecute obj={}", obj);
		
		// todo
		
		return new JsonResult("内贸直租--新建", obj, 800);
	}

}
