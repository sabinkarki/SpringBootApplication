package filter.inceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import filter.inceptor.interceptor.DaysOfWeekBasedAccessInterceptor;

@Configuration
public class ApplicationConfig extends WebMvcConfigurerAdapter {

	@Autowired
	DaysOfWeekBasedAccessInterceptor daysOfWeekBasedAccessInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(daysOfWeekBasedAccessInterceptor);
	}
}
