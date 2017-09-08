Order of execution
Filter and than Interceptor

Filter is when you want things to work from the web container and it is configured in web.xml. 
Interceptor works within the Spring Container.

Filters work more in the request/response domain, in the other hand interceptor act more in the method execution domain.

Implementation of Interceptor
1.Create a class which implements HandlerInterceptor and override preHandle,postHandle and afterCompletion method.
2.In Configuration add created class to InterceptorRegistry.

In this example everything runs smoothly however in every Friday it the application displays message "Sunday is Holiday.So we are offline"

Implementation of Filter
1.Create a class which implements Filter
2.In-order to execute filter for specific url we create a bean of FilterRegistrationBean and set 
that filter and add parameters like in FIlterConfig.Java


