package com.rent.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.rent.entity.JsonResult;
import com.rent.factory.StateFactory;

/**
 * 内贸直租
 * @author admin
 *
 */
public class DomeTradeDirectRent implements Rent{
	
	Logger logger = LoggerFactory.getLogger(DomeTradeDirectRent.class);

	@Override
	public JsonResult doService(JSONObject obj) {
		logger.info("===DomeTradeDirectRent doService obj={}", obj);
		
		// 业务处理 TODO
		String proState = (String) obj.get("proState");
		logger.info("===RentServiceImpl projectExecute proState={}", proState);
		
		// 按状态进行任务分配
		State state = StateFactory.ctrateState(proState);
		return state.doExecute(obj);
	}

}
