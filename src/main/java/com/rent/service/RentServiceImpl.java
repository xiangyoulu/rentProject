package com.rent.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.SocketUtils;

import com.alibaba.fastjson.JSONObject;
import com.rent.entity.JsonResult;
import com.rent.factory.RentFactory;
import com.rent.server.Rent;



@Service
public class RentServiceImpl implements RentService{

	Logger logger = LoggerFactory.getLogger(RentServiceImpl.class);
	
	@Override
	public JsonResult projectExecute(JSONObject obj) {
		logger.info("===RentServiceImpl projectExecute obj={}", obj);
		
		try {
			String proType = (String) obj.get("proType");
			logger.info("===RentServiceImpl projectExecute proType={}", proType);
			
			// 按产品类型进行任务分配
			Rent rent = RentFactory.ctrateRent(proType);
			
			return rent.doService(obj);
			
		} catch (Exception e) {
			logger.error("===RentServiceImpl projectExecute处理失败", e);
			return new JsonResult(e, 800);
		}
		
	}
	

	

}
