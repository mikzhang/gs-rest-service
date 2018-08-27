package hello;

import hello.interceptor.Interceptor1;
import hello.interceptor.Interceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private Interceptor1 interceptor1;
    @Autowired
    private Interceptor2 interceptor2;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor1).addPathPatterns("/**");
        registry.addInterceptor(interceptor2).addPathPatterns("/**")/*.excludePathPatterns("/api/ping")*/;
    }

}
