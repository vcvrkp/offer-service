package com.tnt.offer;

import static springfox.documentation.builders.PathSelectors.any;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = "com.tnt")
@RefreshScope
public class OfferServiceApplication {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Offer").select()
                .apis(RequestHandlerSelectors.basePackage("com.tnt")).paths(any()).build()
                .apiInfo(new ApiInfo("Offer Service", "A set of servies to provide actions on offer domain", "1.0.0",
                        null, new Contact("Ramakrishna", "@Dell", null), null, null));
    }

    public static void main(String[] args) {
        SpringApplication.run(OfferServiceApplication.class, args);
    }

}
