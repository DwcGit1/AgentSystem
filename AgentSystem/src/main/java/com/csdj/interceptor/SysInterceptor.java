package com.csdj.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.csdj.entity.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 拦截器
 *
 */
public class SysInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("users");
		if (user==null) {
			//重定向到指定页面
			response.sendRedirect(request.getContextPath()+"/jsp/error.jsp");
			//拦截
			return false;
		}else {
			//不拦截
			return true;
		}
	}

}
