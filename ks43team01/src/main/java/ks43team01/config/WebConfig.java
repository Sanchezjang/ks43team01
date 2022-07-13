package ks43team01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import ks43team01.user.Interceptor.CommonInterceptor;
import ks43team01.user.Interceptor.UserInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	private final CommonInterceptor commonInterceptor;
	private final UserInterceptor userInterceptor;
	
	
	public WebConfig(CommonInterceptor commonInterceptor, UserInterceptor userInterceptor) {

		this.commonInterceptor = commonInterceptor;
		this.userInterceptor = userInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		/*registry.addInterceptor(commonInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/admin/build/**")
				.excludePathPatterns("/admin/css/**")
				.excludePathPatterns("/admin/vendors/**")
				.excludePathPatterns("/assets/**")
				.excludePathPatterns("/Doc/**")
				.excludePathPatterns("/images/**");*/
		
		registry.addInterceptor(userInterceptor)
				.addPathPatterns("/userpage/**")
				.excludePathPatterns("/is/**")
				.excludePathPatterns("/css/**")
				.excludePathPatterns("/js/**")
				.excludePathPatterns("/userpage/login/login")
				.excludePathPatterns("/userpage/userjoin")
				.excludePathPatterns("/userpage/login/logout");
				
		
		WebMvcConfigurer.super.addInterceptors(registry);
		
	}
	
	
}
