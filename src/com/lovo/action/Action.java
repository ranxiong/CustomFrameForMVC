package com.lovo.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理用户请求的控制器接口
 * @author 骆昊
 *
 */
public interface Action {

	public ActionResult execute(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException;
}
