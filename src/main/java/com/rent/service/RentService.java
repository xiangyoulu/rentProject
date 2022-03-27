package com.rent.service;

import com.alibaba.fastjson.JSONObject;
import com.rent.entity.JsonResult;

public interface RentService {
	
	JsonResult projectExecute(JSONObject obj);

}
