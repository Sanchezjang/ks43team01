package ks43team01.user.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class UserInterceptor implements HandlerInterceptor{

	
	private static final Logger log = LoggerFactory.getLogger(UserInterceptor.class);

		
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String addr = request.getHeader("REFERER");
		String requestUri =	request.getRequestURI();
		log.info("requestUri값!!  :{}",requestUri); 
		log.info("addr값!!  :{}",addr);
		HttpSession session = request.getSession();
		if(requestUri.indexOf("/userpage/login/login") < 0)  session.setAttribute("PRE_ADDR", requestUri);
		
		String sessionId = (String) session.getAttribute("UID");
		if(sessionId == null) {
			log.info("sessionId값  :  {}",sessionId);
			response.sendRedirect("/userpage/login/login");
			return false;
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}
