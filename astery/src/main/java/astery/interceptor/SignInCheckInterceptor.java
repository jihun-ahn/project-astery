package astery.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SignInCheckInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		
		if(session != null) {
			// 로그인 체크
			String code = (String)session.getAttribute("code");
			
			if(code!=null) {//로그인이 되어 있음
				return true;
			}
		}
		 response.sendRedirect(request.getContextPath()+"/login");
		return false;
	}
}
