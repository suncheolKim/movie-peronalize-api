package kr.sparta.movieperonalize.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("v1")
                .packagesToScan("kr.sparta.movieperonalize")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI springOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("MoviePersonalizeAPI")
                        .version("v0.0.1")
                        .description("Movie Personalize API"))
                .externalDocs(new ExternalDocumentation()
                        .description("Movie Personalize API Documentation"));
    }
}
