package com.st.zhenghe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-21 02:46
 * @Description:
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
        public Docket createRestApi(){
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.st.zhenghe.controller"))
                    .paths(PathSelectors.any())
                    .build();
        }
        private ApiInfo apiInfo(){
            return new ApiInfoBuilder()
                    .title("springboot测试")
                    .version("1.1.0")
                    .build();
        }
}
