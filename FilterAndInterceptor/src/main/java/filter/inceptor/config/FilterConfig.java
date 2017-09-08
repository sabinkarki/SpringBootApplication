package filter.inceptor.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import filter.inceptor.filter.WebFilter1;
import filter.inceptor.filter.WebFilter2;

@Configuration
public class FilterConfig extends WebMvcConfigurerAdapter {

	/*
	 * When no URL pattern or servlets are specified the filter will be
	 * associated to '/*'. The filter name will be deduced if not specified.
	 */
	@Bean
	public FilterRegistrationBean filter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(webFilter1());
		registration.addUrlPatterns("/webFilter1");
		registration.setOrder(1);
		return registration;
	}

	public WebFilter1 webFilter1() {
		return new WebFilter1();
	}

	@Bean
	public FilterRegistrationBean filter2() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(webFilter2());
		registration.addUrlPatterns("/webFilter2");
		registration.setOrder(2);
		return registration;
	}

	public WebFilter2 webFilter2() {
		return new WebFilter2();
	}

}
