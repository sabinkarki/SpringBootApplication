package filter.inceptor.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
/*@Order(1)
@WebFilter("/webFilter1")*/
public class WebFilter1 implements Filter {

	private static final boolean CONDITION = true;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("WebFilter1 Destroyed");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("From WebFilter1 doFilter method");
		filterChain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("WebFilter1 Initiated");

	}

}
