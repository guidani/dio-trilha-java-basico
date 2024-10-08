package com.guilherme.dio_api.doc;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig  {
    private Contact contato(){
        return new Contact(
                "Guilherme","https://www.guilherme.com","guilherme@email.com"
        );
    }

    private ApiInfoBuilder informacoesApi(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("rest api");
        apiInfoBuilder.description("api de exemplo com springboot");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("http://www.termsofservice.com");
        apiInfoBuilder.license("mit");
        apiInfoBuilder.licenseUrl("http://www.licenca.com");
        apiInfoBuilder.contact(this.contato());
        return apiInfoBuilder;
    }

    public Docket detalheApi()
    {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.guilherme.dio_api.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informacoesApi().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));
        return docket;
    }
}
