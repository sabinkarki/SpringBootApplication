<pre>
<h2>Order of execution</h2>
Filter and than Interceptor
</pre>

<h2>
Filter is when you want things to work from the web container and it is configured in web.xml. 
Interceptor works within the Spring Container.
<br>
Filters work more in the request/response domain, in the other hand interceptor act more in the method execution domain.
<h2>

<pre>
<h2>Implementation of Interceptor</h2>
1.Create a class which implements HandlerInterceptor and override preHandle,postHandle and afterCompletion method.
2.In Configuration add created class to InterceptorRegistry.

In this example everything runs smoothly however in every Sunday it the application displays message "Sunday is Holiday.So we are offline"
</pre>
<br>
<pre>
<h2>Implementation of Filter</h2>
1.Create a class which implements Filter
2.In-order to execute filter for specific url we create a bean of FilterRegistrationBean and set 
that filter and add parameters like in FIlterConfig.Java
</pre>

