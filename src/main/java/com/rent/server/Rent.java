package com.rent.server;

import com.alibaba.fastjson.JSONObject;
import com.rent.entity.JsonResult;

public interface Rent {
	
	JsonResult doService(JSONObject obj);

}
