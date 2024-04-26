/**
 *
 */

package com.springboot.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

import com.springboot.exception.InvalidHeaderFieldException;

import io.micrometer.common.util.StringUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author Junaid.Khan
 *
 */

@Component
public class RequestHandlerInterceptor implements HandlerInterceptor  {


	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("--------------------------------------");
		System.out.println("Intercepter is called------------------");
		System.out.println("--------------------------------------");
		
		if(StringUtils.isBlank(request.getHeader("student-auth-key"))) {
			throw new InvalidHeaderFieldException("Invalid request");
		}
		return true;
	}
	
	

}
