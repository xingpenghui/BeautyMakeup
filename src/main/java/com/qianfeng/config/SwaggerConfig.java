package com.qianfeng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *@Author feri
 *@Date Created in 2019/1/4 10:02
 */
@Configuration
@EnableSwagger2  //启用Swagger
@EnableWebMvc
public class SwaggerConfig {
    public ApiInfo createApi(){
        return new ApiInfoBuilder().title("第六期联合项目接口文档").
                description("为了更好的融入团队，并且模拟真实的企业开发环境").
                contact(new Contact("Java1806","http://1000phone.com","121212@163.com")).build();
    }
    @Bean  //等价于 <bean>标签
    public Docket createDoc(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createApi()).select().
                apis(RequestHandlerSelectors.basePackage("com.qianfeng.controller")).build();
    }
}
