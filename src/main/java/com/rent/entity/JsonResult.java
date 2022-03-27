package com.rent.entity;

import java.io.Serializable;

public class JsonResult implements Serializable{

	private static final long serialVersionUID = 8939167440685314663L;
	
	private String state;	//状态(OK:成功，ERROR:失败)
	private String message;	//处理结果消息，如果失败要返回失败原因
	private Object data;	//项目信息
	private long elapsed;	//处理耗时(ms)
	
	
	public JsonResult(String message, Object data, long elapsed) {
		state = "OK";
		this.message = message;
		this.data = data;
		this.elapsed = elapsed;
	}
	
	public JsonResult(Throwable e, long elapsed){
		state = "ERROR";
		message = e.getMessage();
		data = null;
		this.elapsed = elapsed;
	}
	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public long getElapsed() {
		return elapsed;
	}

	public void setElapsed(long elapsed) {
		this.elapsed = elapsed;
	}

	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", message=" + message + ", data=" + data + ", elapsed=" + elapsed + "]";
	}
	
	
	
	
	

}
