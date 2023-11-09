/**
 * 
 */
package com.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.springboot.interceptor.RequestHandlerInterceptor;

/**
 * @author Junaid.Khan
 *
 */

@Configuration
public class StudentConfig implements WebMvcConfigurer {

	
	@Bean 
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
	@Autowired
	private RequestHandlerInterceptor handlerInterceptor;

	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(handlerInterceptor);

	}

}
