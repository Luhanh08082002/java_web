package vku.udn.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.log.LogFactory;

import jakarta.servlet.annotation.WebFilter;

@WebFilter("/*")
public class AuthenticationFilter implements Filter {
	private List<String> excludedRequests;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		excludedRequests = new ArrayList<>();
		excludedRequests.add(new String("/login"));
		excludedRequests.add(new String("/register"));
		excludedRequests.add(new String(".js"));
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		boolean loggedIn = session != null && session.getAttribute("acc") != null;
		String userRequest = req.getRequestURI();
		if (loggedIn || isValidrequest(userRequest)) {
			
		chain.doFilter(req, res);
		}else {
			LogFactory.getLogger(userRequest, userRequest).logInfo("Invalid request");
			res.sendRedirect(req.getContextPath()+"/login");
		}

	}
	

	private boolean isValidrequest(String Request) {
		for(String excludedRequest : excludedRequests) {
			if(Request.endsWith(excludedRequest)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

}
