package com.example.swagger2;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lee Taesung
 * @since 2022/10/12
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI(@Value("${springdoc.version}") String springdocVersion) {
        Info info = new Info()
                .title("타이틀 입력")
                .version(springdocVersion)
                .description("API에 대한 설명 입력");

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}
