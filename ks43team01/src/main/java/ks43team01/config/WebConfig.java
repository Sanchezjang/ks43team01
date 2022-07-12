package ks43team01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import ks43team01.user.Interceptor.CommonInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	private final CommonInterceptor commonInterceptor;
	
	public WebConfig(CommonInterceptor commonInterceptor) {

		this.commonInterceptor = commonInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(commonInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/admin/build/**")
				.excludePathPatterns("/admin/css/**")
				.excludePathPatterns("/admin/vendors/**")
				.excludePathPatterns("/assets/**")
				.excludePathPatterns("/Doc/**")
				.excludePathPatterns("/images/**");
		
		WebMvcConfigurer.super.addInterceptors(registry);
	}
}
