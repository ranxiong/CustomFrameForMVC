package com.lovo.action;

import com.google.gson.Gson;

/**
 * Action执行结束产生的内容
 * @author 骆昊
 *
 */
public class ResultContent {
	private String url;
	private Object obj;
	
	public ResultContent(String url) {
		this.url = url;
	}
	
	public ResultContent(Object obj) {
		this.obj = obj;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getJson() {
		return new Gson().toJson(obj);
	}
}
