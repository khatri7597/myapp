package com.myapp.config;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Controller
    public static class SwaggerUiController {

        @GetMapping("/api/docs/ui")
        public String redirect() {
            return "redirect:/swagger-ui.html";
        }
    }

    @Bean
    public Docket apiV1() {
        String title = "Card API v1";
        String description = "Card contains APIs";
        String version = "v1";
        String termsOfServiceUrl = "";
        Contact contact = new Contact("Icreon ", "https://apis.icreon.com", "apis@icreon.com");
        String license = "Not Licensed for External Use";
        String licenseUrl = "https://apis.icreon.com/card/license";
        @SuppressWarnings("rawtypes")
		Collection<VendorExtension> vendorExtensions = Collections.emptyList();
        ApiInfo apiInfo = new ApiInfo(title, description, version, termsOfServiceUrl, contact, license, licenseUrl, vendorExtensions);
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.myapp.controller"))
                .paths(PathSelectors.any())
                .build()
                .directModelSubstitute(LocalDate.class, String.class)
                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo);
    }

}
