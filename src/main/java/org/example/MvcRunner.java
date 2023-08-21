package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class MvcRunner implements WebMvcConfigurer {

        @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver bean=new InternalResourceViewResolver();
//        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views/folder/");
        bean.setSuffix(".html");
        return bean;
    }




//    @Bean
//    public ITemplateResolver templateResolver(){
//        SpringResourceTemplateResolver resolver=new SpringResourceTemplateResolver();
//        resolver.setPrefix("/WEB-INF/views/folder/");
//        resolver.setSuffix(".html");
//        return resolver;
//    }
//
//    @Bean
//    public BeanNameViewResolver beanNameViewResolver(){
//        return new BeanNameViewResolver();
//    }
}
