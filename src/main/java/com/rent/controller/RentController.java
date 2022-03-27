package com.rent.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.rent.entity.JsonResult;
import com.rent.service.RentService;



/**
 * 租赁项目处理微服务
 * @author admin
 *
 */
@RestController
@RequestMapping("/rent")
public class RentController {
	
	Logger logger = LoggerFactory.getLogger(RentController.class);
	
	@Autowired
    private RentService rentService;
	
	
	/**
	 * 项目业务处理接口
	 * @param obj
	 * @return
	 */
	@RequestMapping("/projectExecute")
	public JsonResult projectExecute(@RequestBody JSONObject obj) {
		logger.info("===RentController projectExecute obj={}", obj);
		return rentService.projectExecute(obj);
	}

}
