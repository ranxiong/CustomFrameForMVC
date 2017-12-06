package com.lovo.listener;

import com.lovo.util.DbResourceManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.SQLException;

/**
 * 加载和卸载数据库驱动的监听器
 * @author 骆昊
 *
 */
@WebListener
public class DbDriverContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent evt) {
		try {
			Class.forName("com.lovo.util.DbResourceManager");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent evt) {
		try {
			DbResourceManager.unloadDriver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
