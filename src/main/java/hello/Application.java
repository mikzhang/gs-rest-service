package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "hello")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*@Bean
    public FilterRegistrationBean testFilterRegistration(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new FilterTest());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("filterTest");
        registrationBean.setOrder(1);
        return registrationBean;
    }*/
}
